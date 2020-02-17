package com.newwalk.projict

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_spravoshnic.*

class spravoshnic : AppCompatActivity() {
    val pics = arrayListOf(R.drawable.one,R.drawable.throo)
    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spravoshnic)
    }
    fun button(view: View){
        imageView3.setImageResource(pics[i])
        i++
        if (i>=pics.size) i=0
    }
}
