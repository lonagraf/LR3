package com.example.lr3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstMethod();
    }
    public void FirstMethod()
    {
        ListView listView = findViewById(R.id.listView);
        String[] firstMethod = getResources().getStringArray(R.array.FirstMethod);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,firstMethod);
        listView.setAdapter(adapter);
    }
    public void onClick (View v)
    {
        Intent intent = new Intent(MainActivity.this, SecondMethod.class);
        startActivity(intent);
    }
    public void onClick1 (View v)
    {
        Intent intent = new Intent(MainActivity.this, ThirdMethod.class);
        startActivity(intent);
    }
}