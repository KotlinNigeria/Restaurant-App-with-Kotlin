package com.example.android.justkotlin

import android.app.AlertDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var ebaQuantity: Int = 1
    var amalaQuantity: Int = 1
    var semoQuantity: Int = 1
    var price: Int = 5
    var soup: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plusEba()
        minusEba()
        plusAmala()
        minusAmala()
        plusSemo()
        minusSemo()
        ohaSoup()
        egusiSoup()
        eweduSoup()
        beef()
        cow()
        assorted()
        order()
    }

    fun display (a: Int) {
        updateprice.setText("Total amount is N${a * price}")
    }

    fun ebaQuantity (a: Int) {
        ebaQuant.setText("" + a)
    }

    fun amalaQuantity (a: Int) {
        amalaQuant.setText("" + a)
    }

    fun semoQuantity (a: Int) {
        semoQuant.setText("" + a)
    }

    fun plusEba () {
        ebaIncrement.setOnClickListener {
            ebaQuantity = ebaQuantity + 1
            display(ebaQuantity+amalaQuantity+semoQuantity+soup)
            ebaQuantity(ebaQuantity)
        }
    }

    fun minusEba () {
        ebaDecrement.setOnClickListener {
            ebaQuantity = ebaQuantity - 1
            display(ebaQuantity+amalaQuantity+semoQuantity+soup)
            ebaQuantity(ebaQuantity)
        }
    }

    fun plusAmala () {
        amalaIncrement.setOnClickListener {
            amalaQuantity = amalaQuantity + 1
            display(ebaQuantity+amalaQuantity+semoQuantity+soup)
            amalaQuantity(amalaQuantity)
        }
    }

    fun minusAmala () {
        amalaDecrement.setOnClickListener {
            amalaQuantity = amalaQuantity - 1
            display(ebaQuantity+amalaQuantity+semoQuantity+soup)
            amalaQuantity(amalaQuantity)
        }
    }

    fun plusSemo () {
        semoIncrement.setOnClickListener {
            semoQuantity = semoQuantity + 1
            display(ebaQuantity+amalaQuantity+semoQuantity+soup)
            semoQuantity(semoQuantity)
        }
    }

    fun minusSemo () {
        semoDecrement.setOnClickListener {
            semoQuantity = semoQuantity - 1
            display(ebaQuantity+amalaQuantity+semoQuantity+soup)
            semoQuantity(semoQuantity)
        }
    }

    fun isSoup(){
        soup = soup + 1
        display(ebaQuantity+amalaQuantity+semoQuantity+soup)
    }

    fun notSoup(){

        if (soup>0) {
            soup = soup - 1
            display(ebaQuantity + amalaQuantity + semoQuantity + soup)
        }

    }

    fun ohaSoup () {
        oha.setOnClickListener {
            if (oha.isChecked) {
                isSoup()
            } else { notSoup()
            }
        }
    }

    fun eweduSoup () {
        ewedu.setOnClickListener {
            if (ewedu.isChecked) {
                isSoup()
            } else { notSoup()
            }
        }
    }

    fun egusiSoup () {
        egusi.setOnClickListener {
            if (egusi.isChecked) {
                isSoup()
            } else { notSoup()
            }
        }
    }

    fun beef () {
        beef.setOnClickListener {
            if (beef.isChecked) {
                isSoup()
            } else { notSoup()
            }
        }
    }

    fun cow () {
        cow_head.setOnClickListener {
            if (cow_head.isChecked) {
                isSoup()
            } else { notSoup()
            }
        }
    }

    fun assorted () {
        assorted.setOnClickListener {
            if (assorted.isChecked) {
                isSoup()
            } else { notSoup()
            }
        }
    }

    fun result () : Int {
        return (ebaQuantity + amalaQuantity + semoQuantity + soup) * price
    }

    fun order () {
        submit.setOnClickListener {
            //var statement: String = "Your order has been received \n Your bill is N${result()}\n Thanks for your patronage \n Ese gan \n Nagode \n Merci Beaucoup"
         //   Toast.makeText(this, statement, Toast.LENGTH_SHORT).show()
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Order Completed")
            alertDialog.setMessage("Your order has been received \n Your bill is N${result()}\n Thanks for your patronage \n Ese gan \n Nagode \n Merci Beaucoup")
            alertDialog.show()
        }
    }
}
