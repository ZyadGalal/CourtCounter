package com.example.andriod.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    int score1 =0;
    int score2=0;
    TextView T;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView T1= (TextView)findViewById(R.id.TVa);
        TextView T2 = (TextView)findViewById(R.id.TVb);
        T=T1;
        t=T2;
         }


    public void points(View view)
    {
        score1++;
        T.setText(String.valueOf(score1));
    }
    public void pointss(View view)
    {
        score1=score1+2;
        T.setText(String.valueOf(score1));
    }
    public void pointsss(View view)
    {
        score1=score1+3;
        T.setText(String.valueOf(score1));
    }
    public void pointsa(View view)
    {
        score2++;
        t.setText(String.valueOf(score2));
    }
    public void pointssa(View view)
    {
        score2=score2+2;
        t.setText(String.valueOf(score2));
    }
    public void pointsssa(View view)
    {
        score2=score2+3;
        t.setText(String.valueOf(score2));
    }
    public void reset(View view)
    {
        T.setText("0");
        t.setText("0");
        score1=0;
        score2=0;
    }

}
