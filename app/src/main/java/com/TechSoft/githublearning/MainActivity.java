package com.TechSoft.githublearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.techsoft.firstlibarary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.SimpleToast(getApplicationContext(),"Hello Bro");
    }
}