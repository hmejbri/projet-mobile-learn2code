package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        // Check if the user is signed in
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            Button submit = (Button) findViewById(R.id.submit);
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText input1 = findViewById(R.id.input1);
                    EditText input2 = findViewById(R.id.input2);
                    EditText input3 = findViewById(R.id.input3);
                    EditText input4 = findViewById(R.id.input4);

                    String resp1 = input1.getText().toString().toLowerCase();
                    String resp2 = input2.getText().toString().toLowerCase();
                    String resp3 = input3.getText().toString().toLowerCase().replaceAll("\\s","");
                    String resp4 = input4.getText().toString().toLowerCase().replaceAll("\\s","");

                    if (!resp1.equals("print") || !resp2.equals("read") || !resp3.equals("arr=[]") || !resp4.equals("dict={}"))
                        Toast.makeText(Quiz.this, "One or more answers are wrong.",
                                Toast.LENGTH_SHORT).show();
                    else {
                        Intent intent = new Intent(view.getContext(), SuccessQuiz.class);
                        view.getContext().startActivity(intent);
                    }
                }
            });

            Button returnBtn = (Button) findViewById(R.id.returnBtn);
            returnBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), List_courses.class);
                    view.getContext().startActivity(intent);
                }
            });
        }
    }
}