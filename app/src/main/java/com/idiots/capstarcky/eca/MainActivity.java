package com.idiots.capstarcky.eca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends Activity {

    Intent intent;
//    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

      // image=(ImageView)findViewById(R.id.image);
       // image.setBackgroundResource(R.drawable.fire2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
