package com.aakriti.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var edit_mob_no: EditText
    lateinit var edit_pass: EditText
    lateinit var button: Button
    lateinit var txt_forgot_pswd: TextView
    lateinit var txt_register: TextView
    val validphone ="123456789"
    val validpassword = "Aakriti"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        title = "Log In"
        edit_mob_no = findViewById(R.id.edit_mob_no)
        edit_pass = findViewById(R.id.edit_pass)
        button = findViewById(R.id.button)
        txt_forgot_pswd = findViewById(R.id.txt_forgot_pswd)
        txt_register = findViewById(R.id.txt_register)


        button.setOnClickListener {
            val mobileno = edit_mob_no.text.toString()
            val password = edit_pass.text.toString()
            if(mobileno==validphone && password==validpassword)
            {
                val intent= Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(
                    this@LoginActivity,
                    "Incorrect Credentials", Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}