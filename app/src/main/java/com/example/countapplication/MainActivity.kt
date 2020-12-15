package com.example.countapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //アップButtonを取得
        val button = findViewById<Button>(R.id.count_button)
        //ダウンButtonを取得
        val button2 = findViewById<Button>(R.id.count_button2)
        //TextViewを取得
        val textView = findViewById<TextView>(R.id.count_text)
        //ボタンイベントを通知
        button.setOnClickListener {
            count += 1
            textView.text = count.toString()
        //Log.d("MainActivity","Button Click!")
        }
        button2.setOnClickListener {
            count -= 1
            textView.text = count.toString()
        }
    }
}