package tw.edu.pu.csim.s1081675.vinuskiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game1.*
import kotlinx.android.synthetic.main.activity_main.*


class Game3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game3)

        ans1_btn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                intent = Intent(this@Game3, Result::class.java)
                startActivity(intent)
            }
        })


        ans2_btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@Game3, Result::class.java)
                startActivity(intent)
            }
        })

        ans3_btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@Game3, Result::class.java)
                startActivity(intent)
            }
        })
    }
}