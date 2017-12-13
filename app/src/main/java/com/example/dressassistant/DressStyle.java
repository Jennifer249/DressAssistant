package com.example.dressassistant;

/**
 * Created by 洪祺瑜 on 2017/12/2.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DressStyle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dressstyle);
        TextView textA = (TextView) findViewById(R.id.textA);
        textA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DressStyle.this, DressDetails.class);
                startActivity(intent);
            }
        });
        ImageView pictureA = (ImageView) findViewById(R.id.pictureA);
        pictureA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DressStyle.this, DressDetails.class);
                startActivity(intent);
            }
        });
        Button bu=(Button) findViewById(R.id.button8);
        bu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(DressStyle.this,HairStyle.class);
                startActivity(intent);
            }
        });
        Button b=(Button) findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(DressStyle.this,DressStyle.class);
                startActivity(intent);
            }
        });
        Button but=(Button) findViewById(R.id.button6);
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(DressStyle.this,MakeupStyle.class);
                startActivity(intent);
            }
        });
        Button butt=(Button) findViewById(R.id.button7);
        butt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(DressStyle.this,MySpace.class);
                startActivity(intent);
            }
        });
    }
    }

