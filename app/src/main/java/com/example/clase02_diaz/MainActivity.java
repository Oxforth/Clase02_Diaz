package com.example.clase02_diaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtnombre;
    private Button btn1;
    private Double horas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre = (EditText) findViewById(R.id.editNombre);
        btn1 = (Button) findViewById(R.id.btnEnviar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                horas = Double.parseDouble(txtnombre.getText().toString());
                if(horas>60) {
                    Toast.makeText(getApplicationContext(), "Las horas no pueden pasar de 60, escriba de nuevo", Toast.LENGTH_LONG).show();
                } else if(horas<=40){
                    Toast.makeText(getApplicationContext(), "" +horas*40, Toast.LENGTH_LONG).show();
                } else if(horas>=40&&horas<=50){
                    Toast.makeText(getApplicationContext(), "" +((40*40)+((horas-40)*80)), Toast.LENGTH_LONG).show();
                } else if(horas>=50&&horas<=60) {
                    Toast.makeText(getApplicationContext(), "" +((40*40)+800+((horas-50)*120)), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
