package com.example.gobetweens_thepackagedeliverysystems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpScreen extends AppCompatActivity {
TextView t2;
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);
        t2=findViewById(R.id.login);
        b1=findViewById(R.id.button);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),Selection.class);
                startActivity(intent);
            }
        });
    }

    public void Login(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}