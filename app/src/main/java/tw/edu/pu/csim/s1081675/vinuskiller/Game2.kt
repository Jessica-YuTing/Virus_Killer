package tw.edu.pu.csim.s1081675.vinuskiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game1.*
import kotlinx.android.synthetic.main.activity_game1.ans1_btn
import kotlinx.android.synthetic.main.activity_game1.ans2_btn
import kotlinx.android.synthetic.main.activity_game1.ans3_btn
import kotlinx.android.synthetic.main.activity_game2.*
import kotlinx.android.synthetic.main.activity_main.*


class Game2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)

        ans1_btn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                intent = Intent(this@Game2, Game3::class.java)
                startActivity(intent)
            }
        })


        ans2_btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@Game2, Game3::class.java)
                startActivity(intent)
            }
        })

        ans3_btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@Game2, Game3::class.java)
                startActivity(intent)
            }
        })
    }
}