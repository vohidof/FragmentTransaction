package com.vohidov.fragmenttransaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFragment1 = MyFragment1()

        btn_add.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.add(R.id.liner_container, myFragment1)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        btn_replace.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.liner_container, MyFragment2())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        btn_remove.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.remove(myFragment1)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        btn_hide.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.hide(myFragment1)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        btn_show.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.show(myFragment1)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }
}