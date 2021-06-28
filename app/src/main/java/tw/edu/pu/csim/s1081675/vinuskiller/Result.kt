package tw.edu.pu.csim.s1081675.vinuskiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_game1.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*


class Result : AppCompatActivity() {
    var sum = 0
    var UID:String = ""
    var email:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var db = FirebaseFirestore.getInstance()
        var user: MutableMap<String, Any> = HashMap()

        sum = intent.getIntExtra("score", 0)
        UID = intent.getStringExtra("UserID").toString()
        email = intent.getStringExtra("User").toString()
        result_txv.text = "您得到的分數是:"+sum.toString()+"分"

        user["分數"] = sum
        user["名字"] = email
        db.collection("Users")
                .document(UID)
                .set(user)
                .addOnSuccessListener {
                    Toast.makeText(baseContext, "新增/異動資料成功",
                            Toast.LENGTH_LONG).show()
                }
                .addOnFailureListener { e ->
                    Toast.makeText(baseContext, "新增/異動資料失敗：" + e.toString(),
                            Toast.LENGTH_LONG).show()
                }


        restart_btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@Result, Game1::class.java)
                startActivity(intent)
            }
        })

        return_btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@Result, MainActivity::class.java)
                startActivity(intent)
            }
        })
    }
}