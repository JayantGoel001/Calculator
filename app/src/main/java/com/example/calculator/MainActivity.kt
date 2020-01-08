package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener
{
    var st=""
    var a='+'
    var loc=0
    lateinit var array: Array<Button>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        array= arrayOf(one,zero,two,three,four,five,six,seven,eight,nine,dot,output,plus,minus,divide,multiply,clear)
        array.forEach()
        {
            it.setOnClickListener (this)
        }
        /*one.setOnClickListener(this);
        zero.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        dot.setOnClickListener(this);
        output.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        clear.setOnClickListener(this);*/
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(view: View)
    {
        when (view.id) {
            R.id.zero -> {
                st += "0"
                display.text = st
            }
            R.id.one -> {
                st += "1"
                display.text = st
            }
            R.id.two -> {
                st += "2"
                display.text = st
            }
            R.id.three -> {
                st += "3"
                display.text = st
            }
            R.id.four -> {
                st += "4"
                display.text = st
            }
            R.id.five -> {
                st += "5"
                display.text = st
            }
            R.id.six -> {
                st += "6"
                display.text = st
            }
            R.id.seven -> {
                st += "7"
                display.text = st
            }
            R.id.eight -> {
                st += "8"
                display.text = st
            }
            R.id.nine -> {
                st += "9"
                display.text = st
            }
            R.id.dot -> {
                st= "$st."
                display.text = st
            }
            R.id.plus -> {
                a='+'
                loc=st.length
                st= "$st+"
                display.text = st
            }
            R.id.minus -> {
                a='-'
                loc=st.length
                st= "$st-"
                display.text = st
            }
            R.id.divide -> {
                a='/'
                loc=st.length
                st= "$st/"
                display.text = st
            }
            R.id.multiply -> {
                a='*'
                loc=st.length
                st= "$st*"
                display.text = st
            }
            R.id.clear -> {
                st=""
                display.text = st
            }
            R.id.output -> {
                display.text = st
                val first=(st.subSequence(0,loc).toString()).toDouble()
                val second=(st.subSequence(loc+1,st.length).toString()).toDouble()
                when(a){
                    '+'->{
                        display.text = "${first+second}"
                    }
                    '-'->{
                        display.text = "${first-second}"
                    }
                    '*'->{
                        display.text = "${first*second}"
                    }
                    '/'->{
                        display.text = "${first/second}"
                    }
                }
                st=display.text.toString()
            }
        }
    }
}
