package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        Intent i = new Intent(this.getApplicationContext(), LearnWebView.class);
        Bundle bundle = new Bundle();

        Button returnBtn = (Button) findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), List_courses.class));
            }
        });

        Button listsBtn = (Button) findViewById(R.id.listsBtn);
        listsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("page", "lists");
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        Button forLoop = (Button) findViewById(R.id.forLoop);
        forLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("page", "forLoop");
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        Button arrays = (Button) findViewById(R.id.array);
        arrays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("page", "arrays");
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        Button functions = (Button) findViewById(R.id.functions);
        functions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("page", "functions");
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}