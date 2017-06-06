package com.example.techgenysis.myapplication101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Activity2 extends AppCompatActivity {
    int n,A;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        setTitle("Activity B");

        Random r = new Random();

        TextView t;
        n=r.nextInt();
        t = (TextView)findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        if(extras!=null)
        {   A = extras.getInt("Random no. of A");
            t.setText(String.valueOf(A));
        }


    }

    public void check(View v)
    {
        Intent i = new Intent(getBaseContext(),MainActivity.class);
        i.putExtra("Random no. of B",n);
        startActivity(i);
    }

}
