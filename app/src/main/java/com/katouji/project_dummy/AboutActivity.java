package com.katouji.project_dummy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AboutActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> listData;
    private Button btnDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        listData = new ArrayList<>();
        setData();

        btnDatabase = (Button) findViewById(R.id.btnDatabase);
        btnDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityDatabase();
            }
        });

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecycleAdapter(listData);
        recyclerView.setAdapter(adapter);
    }

    private void setData(){
        listData.add("Data Satu");
        listData.add("Data Dua");
        listData.add("Data Tiga");
        listData.add("Data Empat");
        listData.add("Data Lima");
    }

    public void openActivityDatabase(){
        Intent intent = new Intent(this, DatabaseActivity.class);
        startActivity(intent);

    }

}
