package com.example.sai8s.scoreboard;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1run,t1wicket,t2run,t2wicket;
    String r1,w1,r2,w2;
    int runs1,runs2,wicket1,wicket2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1run=findViewById(R.id.tvt1runs);
        t1wicket=findViewById(R.id.tvt1wicket);
        t2run=findViewById(R.id.tvt2runs);
        t2wicket=findViewById(R.id.tvt2wicket);
        }


    public void t1four(View view) {
        r1=t1run.getText().toString();
        runs1= Integer.parseInt(r1);
        runs1=runs1+4;
        r1= String.valueOf(runs1);
        t1run.setText(r1);
    }

    public void t1run(View view) {
        r1=t1run.getText().toString();
        runs1= Integer.parseInt(r1);
        runs1=runs1+1;
        r1= String.valueOf(runs1);
        t1run.setText(r1);
    }

    public void t1six(View view) {
        r1=t1run.getText().toString();
        runs1= Integer.parseInt(r1);
        runs1=runs1+6;
        r1= String.valueOf(runs1);
        t1run.setText(r1);
    }

    public void t1out(View view) {
        w1=t1wicket.getText().toString();
        wicket1= Integer.parseInt(w1);
        wicket1=wicket1+1;
        if(wicket1>=10){
            Toast.makeText(this, "All Out", Toast.LENGTH_SHORT).show();
        }
        else{
        w1= String.valueOf(wicket1);
        t1wicket.setText(w1);}

    }


    public void t2four(View view) {
        r2=t2run.getText().toString();
        runs2= Integer.parseInt(r2);
        runs2=runs2+4;
        r2= String.valueOf(runs2);
        t2run.setText(r2);
    }

    public void t2run(View view) {
        r2=t2run.getText().toString();
        runs2= Integer.parseInt(r2);
        runs2=runs2+1;
        r2= String.valueOf(runs2);
        t2run.setText(r2);
    }

    public void t2six(View view) {
        r2=t2run.getText().toString();
        runs2= Integer.parseInt(r2);
        runs2=runs2+6;
        r2= String.valueOf(runs2);
        t2run.setText(r2);
    }

    public void t2out(View view) {
        w2=t2wicket.getText().toString();
        wicket2= Integer.parseInt(w2);
        wicket2=wicket2+1;
        if(wicket2>=10){
            Toast.makeText(this, "All Out", Toast.LENGTH_SHORT).show();
        }
        else{
            w2= String.valueOf(wicket2);
            t2wicket.setText(w2);}
    }
}
