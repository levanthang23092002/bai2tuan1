package com.example.levanthang_2050531200336;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class form2 extends AppCompatActivity {
    TextView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);
        anhxa();
        controlButton();
    }
    private void controlButton() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(form2.this,"bye",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(form2.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
    private void anhxa() {
        back= (TextView) findViewById(R.id.txt_back);
    }

}