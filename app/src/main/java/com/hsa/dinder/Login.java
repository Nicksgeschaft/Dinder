package com.hsa.dinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText mail = findViewById(R.id.mail);
        findViewById(R.id.login).setOnClickListener(view -> sendData()); // Button send Data

        mail.setOnFocusChangeListener(new View.OnFocusChangeListener() { //E-Mail
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
               if (!hasFocus) { // nach Beendigung der E-Mail-Eingabe
                    {
                        if(true){ // Abfrage, ob E-Mail ist valide xxx@yyy.zz / xxx@yyy.z1.zx / ... - funktioniert nicht
                            findViewById(R.id.login).setEnabled(true);
                        }
                    }
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