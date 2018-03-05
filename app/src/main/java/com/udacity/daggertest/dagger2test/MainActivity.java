package com.udacity.daggertest.dagger2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.udacity.daggertest.dagger2test.models.Racket;
import com.udacity.daggertest.dagger2test.models.Referee;
import com.udacity.daggertest.dagger2test.models.TennisMatch;
import com.udacity.daggertest.dagger2test.models.dagger.DaggerTennisMatchComponent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TennisMatch tennisMatch = DaggerTennisMatchComponent.create().getMatch();
        //Racket racket1 = new Racket("Babolat");
        //Racket racket2 = new Racket("Dunlop");


        /*Referee referee = new Referee("Badulo");

        Player player1 = new Player("Nadal", racket1);
        Player player2 = new Player("Federer", racket1);

        TennisMatch tennisMatch = new TennisMatch(player1, player2, referee);*/

        TextView tennisMatchTV = findViewById(R.id.tennis_match_info);
        tennisMatchTV.setText(tennisMatch.getMatchInfo());
    }
}
