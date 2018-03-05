package com.udacity.daggertest.dagger2test.models;

import javax.inject.Inject;

/**
 * Created by federico.creti on 05/03/2018.
 */

public class Federer implements IPlayer {
    @Inject
    public Federer(){

    }

    @Override
    public String getName() {
        return Federer.class.getSimpleName();
    }

    @Override
    public IRacket getRacket() {
        return new Racket();
    }
}
