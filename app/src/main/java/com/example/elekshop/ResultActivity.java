package com.example.elekshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Collections;

public class ResultActivity extends AppCompatActivity {

    TextView results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        results = findViewById(R.id.texxt);

                Intent intent = getIntent();

                String result = intent.getStringExtra("result");
                results.setText(result);

            }
        }
