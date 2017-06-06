package com.example.techgenysis.myapplication101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int n,B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Activity A");

        Random r = new Random();
        n = r.nextInt();
        TextView t;
        t = (TextView)findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();


        // Handles null pointer exception at first launch
        if (extras != null) {
        B = extras.getInt("Random no. of B");
        t.setText(String.valueOf(B));}

    }

    public void check(View v)
    {
        Intent i = new Intent(MainActivity.this,Activity2.class);
        i.putExtra("Random no. of A",n);
        startActivity(i);
    }
}
