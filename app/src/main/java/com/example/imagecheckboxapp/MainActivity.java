package com.example.imagecheckboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox chk;
    ImageView imgMina,imgMomo,imgSana,imgTzuyu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        TextView txvLike = findViewById(R.id.txvLike);
        RadioGroup kGirlGroup = findViewById(R.id.kGirlGroup);

        int id = kGirlGroup.getCheckedRadioButtonId();
        RadioButton selected = findViewById(id);

        txvLike.setText("我的最愛是 :" + selected.toString());
    }

}
