package com.example.zerim.appsinnombre;

/* ESTA CLASE FUNCIONARA PARA MANTENER EN SEGUNDO PLANO
*  EL TRACKING DEL CAMIÓN                            */


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class BackGroundService extends Service {

    @Override
    public int onStartCommand(Intent intent ,int flag,int idProcces){


        return START_STICKY;
    }

    @Override
    public void onCreate(){

    }

    @Override
    public void onDestroy(){

    }
    /*Metodo abstracto*/
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
