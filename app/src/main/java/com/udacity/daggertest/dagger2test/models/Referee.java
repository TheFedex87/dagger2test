package com.udacity.daggertest.dagger2test.models;

import javax.inject.Inject;

/**
 * Created by federico.creti on 05/03/2018.
 */

public class Referee implements IReferee {
    private String name;

    public Referee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
