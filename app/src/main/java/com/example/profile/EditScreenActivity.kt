package com.example.profile
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.edit_screen.*

class EditScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_screen)

        btnSave.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            intent2.putExtra("FIRST_NAME", editName.text.toString())
            intent2.putExtra("LAST_NAME", editLastName.text.toString())
            intent2.putExtra("EMAIL", editEmail.text.toString())
            intent2.putExtra("DATE", editDate.text.toString())
            intent2.putExtra("SEX", editSex.text.toString())
            setResult(Activity.RESULT_OK, intent2)
            finish()
        }
    }
}
