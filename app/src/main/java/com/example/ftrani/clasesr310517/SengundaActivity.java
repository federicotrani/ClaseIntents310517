package com.example.ftrani.clasesr310517;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SengundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sengunda);

        getSupportActionBar().setTitle("Titulo Dinamico");
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
}
