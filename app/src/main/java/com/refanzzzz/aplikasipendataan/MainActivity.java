package com.refanzzzz.aplikasipendataan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    TextView username, password;
    MaterialButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initElement();

        String usernm = "admin";
        String pass = "admin123";

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals(usernm) && password.getText().toString().equals(pass)) {
                    Toast.makeText(MainActivity.this, "Login Succes", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    void initElement() {
        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.password);
        btnLogin = (MaterialButton) findViewById(R.id.btnLogin);
    }
}

