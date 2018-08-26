package com.tahsin.testdagger2;

import com.tahsin.testdagger2.Houses.Lannisters;
import com.tahsin.testdagger2.Houses.Starks;

import javax.inject.Inject;

import dagger.Component;


public class War {


    private Starks starks;

    private Lannisters lannisters;

    @Inject
    public War(Starks starks, Lannisters lannisters){
        this.starks = starks;
        this.lannisters = lannisters;
    }

    public void prepare(){
        starks.prepareForWar();
        lannisters.prepareForWar();
    }

    public void report(){
        starks.reportForWar();
        lannisters.reportForWar();
    }

    @Component
    interface BattleComponent {
        War getWar();
    }
}
