package com.example.hellokitty2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView = findViewById(R.id.textView)

        val imageButton: ImageButton = findViewById(R.id.imageButton)

        imageButton.setOnClickListener {
            textView.text = "Hello Kitty"
        }


        val editText: EditText = findViewById(R.id.editText)
        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                textView.text = "Hello Kitty!";
            } else {
                textView.text = "Hello, " + editText.text
            }
        }

        val button: Button = findViewById(R.id.button);
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }



        val edit_address: EditText = findViewById(R.id.edit_address);
        val edit_gift: EditText = findViewById(R.id.edit_gift);
        val sendButton: Button = findViewById(R.id.sendButton)
        sendButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("username", edit_address.text.toString())
            intent.putExtra("gift", edit_gift.text.toString())
            startActivity(intent)
        }
    }

}