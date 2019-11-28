package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.provider.DocumentsContract.EXTRA_INFO;

public class Calculadora2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora2);

        TextView textView = (TextView) findViewById(R.id.calculadoraDisplay2);

        Bundle miBundle = this.getIntent().getExtras();

        if(miBundle!=null){
            String mensaje = miBundle.getString("resultado");
            textView.setText("Ultimo resultado: "+mensaje+"\nAutores del programa:"+"\nJuan David Ortiz"+"\nDaniel Castillo");
        }
        else{
            textView.setText("Mensaje vacío");
        }
    }

    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
