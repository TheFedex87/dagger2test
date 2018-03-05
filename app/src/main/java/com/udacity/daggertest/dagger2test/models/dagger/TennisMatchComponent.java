package com.udacity.daggertest.dagger2test.models.dagger;

import com.udacity.daggertest.dagger2test.models.Federer;
import com.udacity.daggertest.dagger2test.models.IPlayer;
import com.udacity.daggertest.dagger2test.models.Murray;
import com.udacity.daggertest.dagger2test.models.Nadal;
import com.udacity.daggertest.dagger2test.models.TennisMatch;

import dagger.Component;

/**
 * Created by federico.creti on 05/03/2018.
 */
@Component
public interface TennisMatchComponent {
    TennisMatch getMatch();

    Federer getFederer();
    Nadal getNadal();
    Murray getMurray();
}
