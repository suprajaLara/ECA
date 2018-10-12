package com.idiots.capstarcky.eca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Final extends AppCompatActivity {

    TextView s;
    String sc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Intent intent=getIntent();

        s=(TextView)findViewById(R.id.score);
        sc=intent.getStringExtra("score");
        s.setText(sc);

    }
    @Override
    public void onBackPressed() {

        Intent intent=new Intent(Final.this,HomeActivity.class);
        startActivity(intent);
        finish();


    }
}
