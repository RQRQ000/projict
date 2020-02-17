package com.newwalk.projict

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {
var x = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
    }

    fun test(view: View){
        var a: Int = (10..100).random()
        var b: Int = (10..100).random()
        textView5.setText("$a+$b")
        x = a + b
    }
      fun TrueFalse(view: View)  {
          if (editText.text.toString() == "$x"){textView6.setText("молодец!")}


      }
}
