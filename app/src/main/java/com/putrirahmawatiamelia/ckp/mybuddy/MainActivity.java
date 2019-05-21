package com.putrirahmawatiamelia.ckp.mybuddy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/* Tgl Pengerjaan : 21 Mei 2019
   NIM : 10116027
   Nama : Putri Rahmawati Amelia
   Kelas : IF-1
*/

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(MainActivity.this, activity_home.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}
