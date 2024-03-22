package com.example.isayproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button up_button = findViewById(R.id.sign_in_button);
        up_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getBaseContext(), SignInActivity.class);
                        startActivity(intent);
                    }
                }
        );
        Button in_button = findViewById(R.id.sign_up_button);
        EditText email = findViewById(R.id.Email_text);
        EditText password = findViewById(R.id.Password_Text);
        in_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(SignUpActivity.this, SignInActivity.class);
                        i.putExtra("email",email.getText().toString());
                        i.putExtra("password",password.getText().toString());
                        startActivity(i);
                    }
                }
        );

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value1 = extras.getString("email");
            String value2 = extras.getString("password");
            email.setText(value1);
            password.setText(value2);
        }

    }
}
