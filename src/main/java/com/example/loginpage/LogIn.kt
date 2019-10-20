package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginpage.util.ClickInitializer
import com.example.loginpage.util.OnTextViewClickInitializer

class LogIn : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        var intent = Intent(this, SignIn::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        var initializer : ClickInitializer = OnTextViewClickInitializer(this)
        initializer.initialize(R.id.sign_btn)
    }
}
