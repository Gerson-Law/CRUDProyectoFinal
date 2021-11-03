package com.itca.crud_proyecto_final.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("App con Acceso a Base de datos Firebase, MySQl Webhost000 " +
                "Módulo: Desarrollo de Aplicaciones Usando Tecnologías Emergentes" +
                "Desarolladores:" +
                "Heidy  Yohamy Mejia Mundo" +
                "Christy Alexandra Garcia Calderon" +
                "Carmen Elena Abarca Perez" +
                "Docente: Manuel de Jesús Gámez López" +
                "Segundo Año de Sistemas Informáticos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}