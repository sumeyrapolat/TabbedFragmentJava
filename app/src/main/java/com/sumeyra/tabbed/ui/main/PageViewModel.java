package com.sumeyra.tabbed.ui.main;

import static androidx.lifecycle.Transformations.map;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel { //bir setter bir getter oluşturacağız

    //SETTER-> ayarlayıcı
    private MutableLiveData<String> nameInput = new MutableLiveData<>();
    public void setName(String name){
        nameInput.setValue(name);

    }

    //GETTER-> sağlayıcı

    public LiveData<String> getName(){
        return nameInput;
    }
    }
