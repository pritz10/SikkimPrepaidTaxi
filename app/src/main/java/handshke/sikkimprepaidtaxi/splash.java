package handshke.sikkimprepaidtaxi;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

@SuppressLint("NewApi")
public class splash extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();



        Thread t =new Thread(){
            public void run(){
                try{

                    sleep(1500);

                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent i =new Intent(splash.this,MainActivity.class);
                    startActivity(i);
                }
            }
        };
        t.start();
    }
    @Override
    public void onPause(){
        super.onPause();
        finish();
    }

}
