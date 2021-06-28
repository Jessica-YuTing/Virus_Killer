package tw.edu.pu.csim.s1081675.vinuskiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game1.*
import kotlinx.android.synthetic.main.activity_main.*


class Game1 : AppCompatActivity() {
    var UID:String = ""
    var email:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game1)

        UID = intent.getStringExtra("UserID").toString()
        email = intent.getStringExtra("User").toString()

        ans1_btn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                val intent = Intent(this@Game1, Game2::class.java)
                intent.putExtra("score", NewScore(2))
                intent.putExtra("UserID", UID)
                intent.putExtra("User", email)
                startActivity(intent)
            }
        })


        ans2_btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val intent = Intent(this@Game1, Game2::class.java)
                intent.putExtra("score",NewScore(3))
                intent.putExtra("UserID", UID)
                intent.putExtra("User", email)
                startActivity(intent)
            }
        })

        ans3_btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val intent = Intent(this@Game1, Game2::class.java)
                intent.putExtra("score",NewScore(1))
                intent.putExtra("UserID", UID)
                intent.putExtra("User", email)
                startActivity(intent)
            }
        })

    }
}

private fun NewScore(score: Int): Int {
    var sum = 0
    sum += score
    return sum
}
