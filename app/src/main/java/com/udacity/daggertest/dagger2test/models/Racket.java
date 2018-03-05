package com.udacity.daggertest.dagger2test.models;

import javax.inject.Inject;

import dagger.Provides;

/**
 * Created by federico.creti on 05/03/2018.
 */

public class Racket implements IRacket {
    private String model = "Babolat";

    @Inject
    public Racket(){
        //this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}
