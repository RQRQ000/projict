package com.newwalk.projict

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)
    }
    fun button(view: View){
        var intent = Intent(this,spravoshnic::class.java)//cоздали intent
        startActivity(intent)//запускаем intent
    }
    fun button0(view: View){
        var intent = Intent(this,Main3Activity::class.java)//cоздали intent
        startActivity(intent)//запускаем intent

    }
    fun button1(view: View){
        var intent = Intent(this,Main4Activity::class.java)//cоздали intent
        startActivity(intent)//запускаем intent
    }
    fun button2(view: View){
        var intent = Intent(this,Main5Activity::class.java)//cоздали intent
        startActivity(intent)//запускаем intent

    }
}
