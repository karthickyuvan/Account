package com.karthickyuvan.account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname,pwd;
    Button login;
    TextView txtsignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = findViewById(R.id.editUname);
        pwd = findViewById(R.id.editPwd);
        txtsignup =findViewById(R.id.signup_link);
        login = findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Validate();
                ulogin();

            }
        });




    }

    private void Validate() {
        if (uname.equals("") && (pwd.equals("")))
        {
            Toast.makeText(this, " Please Enter All Fields", Toast.LENGTH_SHORT).show();
        }
        else
        {
            ulogin();
        }
    }

    private void ulogin() {
        if(uname.getText().toString().equals("Admin") && (pwd.getText().toString().equals("password")))
        {
            Intent intent = new Intent(this,Signup.class);
            startActivity(intent);
        }else
        {
            Toast.makeText(this, " Check Username and Password ", Toast.LENGTH_SHORT).show();
        }
    }


}