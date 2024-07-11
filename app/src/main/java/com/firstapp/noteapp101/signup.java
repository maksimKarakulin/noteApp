package com.firstapp.noteapp101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    private EditText msignUpEmail,msignUpPassword;
    RelativeLayout msignUp;

    private TextView mgoToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().hide();

        msignUpEmail = findViewById(R.id.singUpEmail);
        msignUpPassword = findViewById(R.id.signUpPassword);
        msignUp = findViewById(R.id.signup);
        mgoToLogin = findViewById(R.id.goToLogin);

        mgoToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //when clicked, it will forward from the button to the activity signup
                Intent intent = new Intent(signup.this,MainActivity.class);
                startActivity(intent);
            }
        });

        msignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=msignUpEmail.getText().toString().trim();
                String password= msignUpPassword.getText().toString().trim();

                if(email.isEmpty() || password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"All Fields are required",Toast.LENGTH_SHORT).show(); //feedback message which makes text "all fields... blah'
                } else if(password.length()<7) {
                    Toast.makeText(getApplicationContext(),"Password should be greater than 7 digits x",Toast.LENGTH_SHORT).show();
                } else {
                    /// registered the user to firebase
                }
            }
        });
    }
}