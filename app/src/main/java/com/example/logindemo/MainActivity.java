package com.example.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view) {

        EditText etName = (EditText) findViewById(R.id.etName) ;

        EditText etPass = (EditText) findViewById(R.id.etPass) ;

        Log.i("info", "Button Clicked!!") ;

        Log.i("Name", etName.getText().toString()) ;

        Log.i("Password", etPass.getText().toString()) ;

        if (etName.getText().toString().isEmpty() || etPass.getText().toString().isEmpty()) {

            Toast.makeText(this, "Please Enter all Field!!", Toast.LENGTH_SHORT).show();

        }
        else{

            Toast.makeText(this, "Welcome " + etName.getText().toString(), Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
