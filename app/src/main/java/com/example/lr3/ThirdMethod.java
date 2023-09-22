package com.example.lr3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ThirdMethod extends AppCompatActivity {
    ArrayList<Employee> employees = new ArrayList<Employee>();
    ListView employeesList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        setInitialData();
        employeesList = findViewById(R.id.employeesList);
        EmployeeAdapter  employeeAdapter = new EmployeeAdapter(this, R.layout.list_item, employees);
        employeesList.setAdapter(employeeAdapter);
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Employee selectedEmployee = (Employee)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Был выбран работник " + selectedEmployee.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        employeesList.setOnItemClickListener(itemListener);
    }
    private void setInitialData()
    {
        employees.add(new Employee("Иван", "Бухгалтер",R.drawable.photo1));
        employees.add(new Employee("Петр", "Руководитель",R.drawable.photo2));
        employees.add(new Employee("Константин", "Кассир",R.drawable.photo3));
        employees.add(new Employee("Максим", "Программист",R.drawable.photo4));
    }
    public void onClick (View v)
    {
        Intent intent = new Intent(ThirdMethod.this, MainActivity.class);
        startActivity(intent);
    }
}
