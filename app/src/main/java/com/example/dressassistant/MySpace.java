package com.example.dressassistant;

/**
 * Created by 洪祺瑜 on 2017/12/2.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MySpace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myspace);
        ImageButton button2 = (ImageButton)findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MySpace.this,MyCollect.class);
                startActivity(intent);
            }
        });
        Button bu=(Button) findViewById(R.id.button8);
        bu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MySpace.this,HairStyle.class);
                startActivity(intent);
            }
        });
        Button b=(Button) findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MySpace.this,DressStyle.class);
                startActivity(intent);
            }
        });
        Button but=(Button) findViewById(R.id.button6);
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MySpace.this,MakeupStyle.class);
                startActivity(intent);
            }
        });
        Button butto=(Button) findViewById(R.id.button7);
        butto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MySpace.this,MySpace.class);
                startActivity(intent);
            }
        });
        Button buu=(Button) findViewById(R.id.button10);
        buu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MySpace.this,Login.class);
                startActivity(intent);
            }
        });
    }
}


