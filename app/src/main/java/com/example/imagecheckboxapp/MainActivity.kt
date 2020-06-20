package com.example.imagecheckboxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    CheckBox chk;
    ImageView imgMina,imgMomo,imgsana,imgTzuyu;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgMina = findViewById(R.id.imgMina);
        imgMomo = findViewById(R.id.imgMomo);
        imgSana = findViewById(R.id.imgSana);
        imgTzuyu = findViewById(R.id.imgTzuyu);

        imgMina.setVisibility(View.GONE);
        imgMomo.setVisibility(View.GONE);
        imgSana.setVisibility(View.GONE);
        imgTzuyu.setVisibility(View.GONE);
    }

    fun btnOK(view: View) {

        imgMina.setVisibility(View.GONE);
        imgMomo.setVisibility(View.GONE);
        imgSana.setVisibility(View.GONE);
        imgTzuyu.setVisibility(View.GONE);

        int[] id ={R.id.chkMina,R.id.chkMomo,R.id.chkSana,R.id.chkTzuyu};

        for(int i:id){

            chk = findViewById(i);

            if(chk.isChecked()){
                if(chk.getId() == R.id.chkMina)
                    imgMina.visibility(View.VISIBLE);
                if(chk.getId() == R.id.chkMomo)
                    imgMomo.visibility(View.VISIBLE);
                if(chk.getId() == R.id.chkSana)
                    imgSana.visibility(View.VISIBLE);
                if(chk.getId() == R.id.chkTzuyu)
                    imgTzuyu.visibility(View.VISIBLE);

            }


        }

    }
}
