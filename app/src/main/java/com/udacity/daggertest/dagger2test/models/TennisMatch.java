package com.udacity.daggertest.dagger2test.models;

import javax.inject.Inject;

/**
 * Created by federico.creti on 05/03/2018.
 */

public class TennisMatch {

    private IPlayer player1;
    private IPlayer player2;

    //private IReferee referee;

    @Inject
    public TennisMatch(IPlayer player1, IPlayer player2){
        this.player1 = player1;
        this.player2 = player2;
        //this.referee = referee;
    }

    public String getMatchInfo(){
        return "Match played by: " + player1.getName() + " VS " + player2.getName() + ", refered by Badulo";
    }
}
