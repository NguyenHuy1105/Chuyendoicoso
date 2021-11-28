package com.example.chuyendoi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinnervao;
    Spinner spinnerra;
    EditText text1;
    Button kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnervao=(Spinner) findViewById(R.id.spinner1);
        spinnerra=(Spinner) findViewById(R.id.spinner2);
        ArrayList<String> arrayCoSo= new ArrayList<String>();
        arrayCoSo.add("cơ số 2");
        arrayCoSo.add("cơ số 8");
        arrayCoSo.add("cơ số 10");
        arrayCoSo.add("cơ số 16");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayCoSo);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnervao.setAdapter(arrayAdapter);
        spinnerra.setAdapter(arrayAdapter);


    }
}