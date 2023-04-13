package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("ResourceAsColor")
    public void touchToast(View view) {
        // uso padrao do toast nesse uso nao podemos fazer mudancas significativas
        // usamos o metodo static da classe toast e passamos tres parametros
        // o primeiro o context onde podemos acessar recursos do nosso sistema
        // o segundo parametro que nesse caso sera um texto exibido
        // o terceiro parametro que sera o tempo de exibicao
        /*Toast.makeText(
                getApplicationContext(),
                "Toast aparecaaa",
                Toast.LENGTH_SHORT
        ).show();*/

        // podemos tambem usar o Toast instanciado para definirmos atributos personalizados
        // o getApplicationContext e usado para acessrmos recursos do sistema
        Toast toast = new Toast(getApplicationContext());
        TextView text = new TextView(getApplicationContext());
        //ImageView image = new ImageView(getApplicationContext());

        text.setText("Toast personalizado");
        text.setTextSize(24);
        // text.setBackgroundColor(R.color.purple_200);
        toast.setView(text);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }
}