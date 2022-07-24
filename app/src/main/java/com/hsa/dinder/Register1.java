package com.hsa.dinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Register1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
        EditText mail = findViewById(R.id.mail);
        final boolean[] emc = {false};
        findViewById(R.id.checkInput).setOnClickListener(view -> checkInput());

                mail.setOnFocusChangeListener(new View.OnFocusChangeListener() { //E-Mail -> ist das eine automatisierung und die Funktion kann auch so aufgerufen werden?
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) { // nach Beendigung der E-Mail-Eingabe
                    {
                        if(true){ // Abfrage, ob E-Mail ist valide xxx@yyy.zz / xxx@yyy.z1.zx / ... - funktioniert nicht
                            if (!true){ // Abfrage, ob Mail bereits existiert
                                emc[0] = true; // E-Mail-Check wird true
                            } else ((TextView) findViewById(R.id.registererrors)).setText("E-Mail existiert bereits.");
                        } else ((TextView) findViewById(R.id.registererrors)).setText("E-Mail hat ungültiges Format.");
                    }
                }
            }
        });
    }

    public void checkInput(){
        if(true) { // text not shorter 5 chars
            if (findViewById(R.id.password) != findViewById(R.id.password2)) { // password1 /= password2 (repeat)
                // boa bin ich müde #2:49Uhr // if() emc muss true sein -> weiter zu seite 2
            } else ((TextView) findViewById(R.id.registererrors)).setText("Passwort ist nicht identisch.");
        } else ((TextView) findViewById(R.id.registererrors)).setText("Passwort zu kurz.");
    }
}