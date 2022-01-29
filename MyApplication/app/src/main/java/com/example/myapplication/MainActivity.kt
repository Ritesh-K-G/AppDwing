package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<Button>(R.id.button)
        val t1 = findViewById<EditText>(R.id.textView)
        val t2 = findViewById<EditText>(R.id.textView2)

        btn.setOnClickListener() {
            if (t1.getText().toString().isEmpty())
            Toast.makeText(this, "Enter Your Name Dude!!", Toast.LENGTH_SHORT).show()
            else
            { Toast.makeText(this, "Hey I'm "+ t1.getText().toString() + "\nGo!! Corona Go!!", Toast.LENGTH_SHORT).show()
                t1.setText("");
                t2.setText("");

        }
    }
}
}


