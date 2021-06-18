package com.example.binaryvedas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rl_btn.setOnClickListener(View.OnClickListener { val i = Intent(this, ProfileActivity::class.java)
            startActivity(i) })

    }
}