package com.tahsin.testdagger2.Houses;

import com.tahsin.testdagger2.interfaces.House;

import javax.inject.Inject;

public class Lannisters implements House {

    @Inject
    public  Lannisters(){

    }

    @Override
    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName() + " is prepared for war");
    }

    @Override
    public void reportForWar() {
        System.out.println(this.getClass().getSimpleName() + " is reporting...");
    }
}
