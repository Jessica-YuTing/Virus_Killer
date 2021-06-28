package tw.edu.pu.csim.s1081675.vinuskiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game1.*
import kotlinx.android.synthetic.main.activity_game1.ans1_btn
import kotlinx.android.synthetic.main.activity_game1.ans2_btn
import kotlinx.android.synthetic.main.activity_game1.ans3_btn
import kotlinx.android.synthetic.main.activity_game2.*
import kotlinx.android.synthetic.main.activity_main.*


class Game2 : AppCompatActivity() {
    var sum = 0
    var UID:String = ""
    var email:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)
        sum = intent.getIntExtra("score", 0)
        Toast.makeText(this, sum.toString(), Toast.LENGTH_LONG).show()

        UID = intent.getStringExtra("UserID").toString()
        email = intent.getStringExtra("User").toString()

        ans1_btn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                val intent = Intent(this@Game2, Game3::class.java)
                intent.putExtra("score", NewScore(2))
                intent.putExtra("UserID", UID)
                intent.putExtra("User", email)
                startActivity(intent)
            }
        })


        ans2_btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@Game2, Game3::class.java)
                intent.putExtra("score", NewScore(1))
                intent.putExtra("UserID", UID)
                intent.putExtra("User", email)
                startActivity(intent)
            }
        })

        ans3_btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@Game2, Game3::class.java)
                intent.putExtra("score", NewScore(3))
                intent.putExtra("UserID", UID)
                intent.putExtra("User", email)
                startActivity(intent)
            }
        })

    }

    private fun NewScore(score: Int): Int {
        sum += score
        return sum
    }

}