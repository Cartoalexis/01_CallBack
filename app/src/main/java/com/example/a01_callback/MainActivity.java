package com.example.a01_callback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText txtUsuario, txtContrasena;
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        txtUsuario = findViewById(R.id.txtUsuario);
        txtContrasena = findViewById(R.id.txtContrasena);
    }

    public void loginUsuario(View view){
        String user = txtUsuario.getText().toString();
        String pass = txtContrasena.getText().toString();

        x = new Login().verificar(user, pass, new InterfaceCallBack() {
            @Override
            public void segundoMetodo() {
                if(x == 1){
                    Toast.makeText(MainActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "No existe", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}