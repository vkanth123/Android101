package com.example.techgenysis.myapplication101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Random r = new Random();
        int n;
        TextView t;
        n=r.nextInt();
        t = (TextView)findViewById(R.id.textView);
        t.setText(n+" ");


    }

    public void check(View v)
    {
        Intent i = new Intent(Activity2.this,MainActivity.class);
        startActivity(i);
    }

}
