package com.example.techgenysis.myapplication101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        TextView t;
        t = (TextView)findViewById(R.id.textView);
        t.setText(r.nextInt()+" ");
        setTitle("Activity A");
    }

    public void check(View v)
    {
        Intent i = new Intent(MainActivity.this,Activity2.class);
        startActivity(i);
    }
}
