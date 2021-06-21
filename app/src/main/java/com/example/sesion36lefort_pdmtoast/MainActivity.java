package com.example.sesion36lefort_pdmtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnToast1,btnToast2,btnToast3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast1=findViewById(R.id.btnToast1);
        btnToast2=findViewById(R.id.btnToast2);
        btnToast3=findViewById(R.id.btnToast3);

    }
    //metodo toast1

    public void toast1Personalizado(View view){

        Context context= getApplicationContext();
        CharSequence mensaje="Mensaje emergente \n \n TOAST personalizado \n \nLefort";
        int duration = Toast.LENGTH_LONG;
        Toast toast1Personalizado=Toast.makeText(context, mensaje, duration);
        toast1Personalizado.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
        toast1Personalizado.show();
    }
    //metodo para toast personalizado 2
    public void toast2Personalizado(View view) {
        /////layoutInflanter comp-ejecu
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast2,null);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        ////llamado, invocar a elemento vista
        toast.setView(layout);
        toast.show();
    }

    public void toast3Personalizado(View view) {
        /////layoutInflanter comp-ejecu
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast3,null);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        ////llamado, invocar a elemento vista
        toast.setView(layout);
        toast.show();

    }
}