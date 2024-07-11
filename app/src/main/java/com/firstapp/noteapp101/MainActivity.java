package com.firstapp.noteapp101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mloginEmail,mloginPassword;

    RelativeLayout mlogin,mgoToSignup;

    TextView mgoToForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        mloginEmail=findViewById(R.id.loginEmail);
        mloginPassword=findViewById(R.id.loginPassword);
        mlogin=findViewById(R.id.login);
        mgoToForgotPassword=findViewById(R.id.goToForgotPassword);
        mgoToSignup=findViewById(R.id.goToSignUp);

        mgoToSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,signup.class));
            }
        });

        mgoToForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,forgotPassword.class));
            }
        });

        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=mloginEmail.getText().toString().trim();
                String password=mloginPassword.getText().toString().trim();

                if(email.isEmpty() || password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"All Fields are required",Toast.LENGTH_SHORT).show();
                } else {
                    // login the user
                }

            }
        });








    }
}