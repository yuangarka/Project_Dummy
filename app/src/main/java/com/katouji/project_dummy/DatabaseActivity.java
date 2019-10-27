package com.katouji.project_dummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        new DatabaseFragment();

        setContentView(R.layout.fragment_database);

    }


}
