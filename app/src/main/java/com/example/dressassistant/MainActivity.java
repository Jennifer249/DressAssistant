package com.example.dressassistant;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Handler handler=new Handler();

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
        Button but1=(Button) findViewById(R.id.button4);
        but1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               scrollToPosition();
            }
        });
        Button but3=(Button) findViewById(R.id.button2);
        but3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scrollTo();
            }
        });
        Button but2=(Button) findViewById(R.id.button3);
        but2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scrollT();
            }
        });
    }
    private void scrollToPosition() {
        handler.post(new Runnable() {

            @Override
            public void run() {
                TextView textView=(TextView)findViewById(R.id.textView);
                int top=textView.getTop();
                ScrollView scrollView=(ScrollView)findViewById(R.id.sc1);
              scrollView.scrollTo(0, top);
//                scrollView.smoothScrollTo(0,top);
            }
        });
    }
    private void scrollTo() {
        handler.post(new Runnable() {

            @Override
            public void run() {
                TextView textView=(TextView)findViewById(R.id.textView2);
                int top=textView.getTop();
                ScrollView scrollView=(ScrollView)findViewById(R.id.sc1);
//                scrollView.scrollTo(0, 3000);
                scrollView.smoothScrollTo(0,top);
            }
        });
    }
    private void scrollT() {
        handler.post(new Runnable() {

            @Override
            public void run() {
                TextView textView=(TextView)findViewById(R.id.textView4);
                int top=textView.getTop();
                ScrollView scrollView=(ScrollView)findViewById(R.id.sc1);
//                scrollView.scrollTo(0, 3000);
                scrollView.smoothScrollTo(0,top);
            }
        });
    }

}


