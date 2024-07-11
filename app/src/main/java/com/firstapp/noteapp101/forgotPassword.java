package com.firstapp.noteapp101;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class forgotPassword extends AppCompatActivity {

    private EditText mforgotPassword;
    private Button mpasswordRecoverButton;
    private TextView mgoBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        mforgotPassword=findViewById(R.id.forgotPassword);
        mpasswordRecoverButton=findViewById(R.id.passwordRecoverButton);
        mgoBackToLogin=findViewById(R.id.goBackToLogin);


        mgoBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(forgotPassword.this,MainActivity.class);
                startActivity(intent);
            }
        });

        mpasswordRecoverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=mforgotPassword.getText().toString().trim();
                if(email.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter your email first",Toast.LENGTH_SHORT).show();
                } else {
                    // we have to send password recovery email
                }
            }
        });







    }
}