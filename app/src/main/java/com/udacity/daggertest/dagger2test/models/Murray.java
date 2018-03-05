package com.udacity.daggertest.dagger2test.models;

/**
 * Created by federico.creti on 05/03/2018.
 */

public class Murray implements IPlayer {
    @Override
    public String getName() {
        return Murray.class.getSimpleName();
    }

    @Override
    public IRacket getRacket() {
        return new Racket();
    }
}
