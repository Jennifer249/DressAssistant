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

public class MakeupStyle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makeupstyle);
        ImageButton imageButtonB=(ImageButton) findViewById(R.id.imageButtonB);
        imageButtonB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MakeupStyle.this, MakeupDetails.class);
                startActivity(intent);
            }
        });
        Button bu=(Button) findViewById(R.id.button8);
        bu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MakeupStyle.this,HairStyle.class);
                startActivity(intent);
            }
        });
        Button b=(Button) findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MakeupStyle.this,DressStyle.class);
                startActivity(intent);
            }
        });
        Button but=(Button) findViewById(R.id.button6);
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MakeupStyle.this,MakeupStyle.class);
                startActivity(intent);
            }
        });
        Button butto=(Button) findViewById(R.id.button7);
        butto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MakeupStyle.this,MySpace.class);
                startActivity(intent);
            }
        });
    }
    }

