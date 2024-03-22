package com.example.isayproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Button up_button = findViewById(R.id.sign_up_button);
        up_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getBaseContext(), SignUpActivity.class);
                        startActivity(intent);
                    }
                }
        );
        EditText EdEmail = findViewById(R.id.Email_text);
        EditText EdPassword = findViewById(R.id.Password_Text);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value1 = extras.getString("email");
            String value2 = extras.getString("password");
            EdEmail.setText(value1);
            EdPassword.setText(value2);
        }

        Button in_button = findViewById(R.id.sign_in_button);
        in_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(SignInActivity.this, SignUpActivity.class);
                        i.putExtra("email",EdEmail.getText().toString());
                        i.putExtra("password",EdPassword.getText().toString());
                        startActivity(i);
                    }
                }
        );


    }
}
