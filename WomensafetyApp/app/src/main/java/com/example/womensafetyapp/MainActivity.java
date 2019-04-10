package com.example.womensafetyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void register(View v) {
        Intent i_register=new Intent(MainActivity.this,Register.class);
        startActivity(i_register);

    }

    public void display_no(View v) {
        Intent i_view=new Intent(MainActivity.this,Display.class);
        startActivity(i_view);

    }

    public void instruct(View v) {
        Intent i_help=new Intent(MainActivity.this,Instructions.class);
        startActivity(i_help);
    }

    public void verify(View v) {
        Intent i_verify=new Intent(MainActivity.this,Verify.class);
        startActivity(i_verify);
    }
}
