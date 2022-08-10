package com.hsa.dinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText mail = findViewById(R.id.mail);
        EditText pw = findViewById(R.id.password);
        findViewById(R.id.login).setOnClickListener(view -> sendData()); // Button send Data

        mail.addTextChangedListener(new TextWatcher() { // watches Email Input

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(true){ // Abfrage, ob E-Mail ist valide xxx@yyy.zz / xxx@yyy.z1.zx / ... - funktioniert nicht
                    findViewById(R.id.login).setEnabled(true);
                }
            }
        });


    }
    public void sendData(){
        // Datenbank abfragen
        // if true -> open MyPage
    }

    public void openMyPage() { // Login.class -> MyPage
        Intent intent= new Intent(this, Login.class);
        startActivity(intent);
    }
}