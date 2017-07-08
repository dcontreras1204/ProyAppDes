package com.example.dexter.proyappdestinos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tipoTurismoActivity extends AppCompatActivity {
    Button turismo1;
    Button  turismo2;
    Button  turismo3;
    Button  turismo4;
    Button  turismo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_turismo);
        turismo1 = (Button) findViewById(R.id.btTurismo1);
        turismo2 = (Button) findViewById(R.id.btTurismo2);
        turismo3 = (Button) findViewById(R.id.btTurismo3);
        turismo4 = (Button) findViewById(R.id.btTurismo4);
        turismo5 = (Button) findViewById(R.id.btTurismo5);

        turismo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),busquedaTurismo1.class);
                intent.putExtra("codigo",1);
                startActivityForResult(intent,1);
            }
        });

        turismo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),busquedaTurismo1.class);
                intent.putExtra("codigo",2);
                startActivityForResult(intent,2);
            }
        });

        turismo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),busquedaTurismo1.class);
                intent.putExtra("codigo",3);
                startActivityForResult(intent,3);
            }
        });

        turismo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),busquedaTurismo1.class);
                intent.putExtra("codigo",4);
                startActivityForResult(intent,4);
            }
        });
        turismo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),busquedaTurismo1.class);
                intent.putExtra("codigo",5);
                startActivityForResult(intent,5);
            }
        });
    }
}
