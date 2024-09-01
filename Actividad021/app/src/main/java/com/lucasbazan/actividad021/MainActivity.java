package com.lucasbazan.actividad021;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        num=(int) (Math.random()*100001);
        String cadena=String. valueOf(num);
        Toast notificacion= Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.show();
    }
    public void controlar(View v){
        String valorIngresado=et1.getText().toString();
        int valor=Integer.parseInt(valorIngresado);
        if (valor==num) {
            Toast notificacion=Toast.makeText(this
            ,"Muy bien recodaste el número mostrado.", Toast.LENGTH_LONG);
            notificacion.show();
        } else {
            Toast notificacion=Toast.makeText(this, "Lo siento pero no es el número que mostro.", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}