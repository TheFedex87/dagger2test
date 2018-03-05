package com.udacity.daggertest.dagger2test.models;

import javax.inject.Inject;

/**
 * Created by federico.creti on 05/03/2018.
 */

public class Nadal implements IPlayer {
    @Inject
    public Nadal(){

    }

    @Override
    public String getName() {
        return Nadal.class.getSimpleName();
    }

    @Override
    public IRacket getRacket() {
        return new Racket();
    }
}
