package com.example.car_jo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flag="";
        val spVal :Spinner = findViewById(R.id.spCars);
        val bt:Button = findViewById(R.id.btPrice);
        var tv :TextView = findViewById(R.id.tVprice);

        var options = arrayOf("View cars","MG5","GAC","Kia", "BYD","Changan");


        spVal.adapter =
                ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options);
        spVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
               flag = options.get(p2);
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }



        }
        bt.setOnClickListener{
            val x: Int =15500;
            val y: Int =17500;
            val z: Int =12210;
            val d: Int =6700;
            val k: Int =13500;

            if(flag=="MG5"){
                tv.text= x.toString();

        }else if(flag=="GAC"){
                tv.text= y.toString();


    }else if(flag=="Kia"){
                tv.text= z.toString();

            }else if (flag=="BYD"){
                tv.text= d.toString();

            }else if(flag=="Changan"){
                tv.text= k.toString();

            }else if (flag=="View cars"){
                tv.text ="please select" ;
            }
        }
            }
        }
