package com.example.android.connect2doc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    EditText Email;
    EditText Pass;
    EditText Name;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        Email = findViewById(R.id.regEmail);
        Pass = findViewById(R.id.regPass);
        Name = findViewById(R.id.regName);
        signIn = findViewById(R.id.signIn);

        signIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                Intent i = new Intent(getApplicationContext(), Home.class);
                i.putExtra("username", name);
                startActivity(i);
            }
        });


    }
}
