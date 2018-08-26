package com.tahsin.testdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        War.BattleComponent component = DaggerWar_BattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.report();
    }
}
