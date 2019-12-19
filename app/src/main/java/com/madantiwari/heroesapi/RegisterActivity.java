package com.madantiwari.heroesapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etusername,etpassword,etaddress;
    Button btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etusername = findViewById(R.id.etsignUser);
        etpassword = findViewById(R.id.etsignPass);
        etaddress = findViewById(R.id.etAddress);

        btnsignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
