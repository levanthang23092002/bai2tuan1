package com.example.levanthang_2050531200336;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        controlButton();
    }
    private void controlButton() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Ban da dang nhap thanh cong",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,form2.class);
                startActivity(intent);
            }
        });

    }
    private void anhxa() {
        login= (Button) findViewById(R.id.btn_login);
    }
}