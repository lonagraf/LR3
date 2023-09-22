package com.example.lr3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SecondMethod  extends AppCompatActivity {
    ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView1 = findViewById(R.id.listView1);
        SecondMethod();

    }
    public void SecondMethod()
    {
        List<String> num = new ArrayList<String>();
        Random rand = new Random();
        int i = rand.nextInt(10);
        int e = rand.nextInt(10);
        while (i != e)
        {
            String j = "";
            j += Integer.toString(rand.nextInt(10));
            j += Integer.toString(rand.nextInt(10));
            j += Integer.toString(rand.nextInt(10));
            i = rand.nextInt(10);
            num.add(j);
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, num);
        listView1.setAdapter(adapter);
    }
    public void onClick (View v)
    {
        Intent intent = new Intent(SecondMethod.this, MainActivity.class);
        startActivity(intent);
    }
}
