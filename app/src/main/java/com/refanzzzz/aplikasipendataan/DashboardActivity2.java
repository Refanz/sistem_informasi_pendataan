package com.refanzzzz.aplikasipendataan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity2 extends AppCompatActivity {

    private TextView txtUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);
    }

    void initWidget(){
        txtUsername = (TextView) findViewById(R.id.txtUsername);
    }
}