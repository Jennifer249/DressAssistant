package com.example.dressassistant;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bu=(Button) findViewById(R.id.button8);
        bu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HairStyle.class);
                startActivity(intent);
            }
        });
        Button b=(Button) findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DressStyle.class);
                startActivity(intent);
            }
        });
        Button but=(Button) findViewById(R.id.button6);
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MakeupStyle.class);
                startActivity(intent);
            }
        });
        Button butto=(Button) findViewById(R.id.button7);
        butto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MySpace.class);
                startActivity(intent);
            }
        });
    }

}


