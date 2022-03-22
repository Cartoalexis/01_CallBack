package com.example.a01_callback;

public class Login {

    public int verificar(String user, String pass, InterfaceCallBack callback){
        if(user.equals("admin") && pass.equals("123")){
            callback.segundoMetodo();
            return 1;
        }
        else{
            callback.segundoMetodo();
            return 0;
        }
    }
}
