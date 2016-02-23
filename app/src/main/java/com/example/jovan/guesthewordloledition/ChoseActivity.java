package com.example.jovan.guesthewordloledition;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;


public class ChoseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose);

        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Boolean> argList = (ArrayList<Boolean>) args.getSerializable("ARRAYLIST");

        CheckBox cBoxAbilities = (CheckBox) findViewById(R.id.cBoxAbilities);
        cBoxAbilities.setChecked(argList.get(0).booleanValue());

        CheckBox cBoxChampions = (CheckBox) findViewById(R.id.cBoxChampions);
        cBoxChampions.setChecked(argList.get(1).booleanValue());

        CheckBox cBoxGame = (CheckBox) findViewById(R.id.cBoxGame);
        cBoxGame.setChecked(argList.get(2).booleanValue());
        
        CheckBox cBoxSummonerSpells = (CheckBox) findViewById(R.id.cBoxSummonerSpells);
        cBoxSummonerSpells.setChecked(argList.get(3).booleanValue());

        CheckBox cBoxItems = (CheckBox) findViewById(R.id.cBoxItems);
        cBoxItems .setChecked(argList.get(4).booleanValue());

        CheckBox cBoxMonsters = (CheckBox) findViewById(R.id.cBoxMonsters);
        cBoxMonsters.setChecked(argList.get(5).booleanValue());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chose, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btwStartHandler(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.lock_in_button);
        ArrayList<Boolean> list = new ArrayList<>();

        CheckBox cBoxAbilities = (CheckBox) findViewById(R.id.cBoxAbilities);
        if (cBoxAbilities.isChecked()) {
            list.add(true);
        } else list.add(false);

        CheckBox cBoxChampions = (CheckBox) findViewById(R.id.cBoxChampions);
        if (cBoxChampions.isChecked()) {
            list.add(true);
        } else list.add(false);

        CheckBox cBoxGame = (CheckBox) findViewById(R.id.cBoxGame);
        if (cBoxGame.isChecked()) {
            list.add(true);
        } else list.add(false);

        CheckBox cBoxSummonerSpells = (CheckBox) findViewById(R.id.cBoxSummonerSpells);
        if (cBoxSummonerSpells.isChecked()) {
            list.add(true);
        } else list.add(false);

        CheckBox cBoxItems = (CheckBox) findViewById(R.id.cBoxItems);
        if (cBoxItems.isChecked()) {
            list.add(true);
        } else list.add(false);

        CheckBox cBoxMonsters = (CheckBox) findViewById(R.id.cBoxMonsters);
        if (cBoxMonsters.isChecked()) {
            list.add(true);
        } else list.add(false);

        int time = 0;

        RadioButton rb30sec = (RadioButton) findViewById(R.id.rb30sec);
        if (rb30sec.isChecked()) time = 30;

        RadioButton rb60sec = (RadioButton) findViewById(R.id.rb60sec);
        if (rb60sec.isChecked()) time = 60;

        RadioButton rb90sec = (RadioButton) findViewById(R.id.rb90sec);
        if (rb90sec.isChecked()) time = 90;

        RadioButton rb120sec = (RadioButton) findViewById(R.id.rb120sec);
        if (rb120sec.isChecked()) time = 120;


        final Intent i = new Intent(this, GameActivity.class);
        Bundle argsNext = new Bundle();
        argsNext.putSerializable("ARRAYLIST", (Serializable) list);
        i.putExtra("BUNDLE", argsNext);
        i.putExtra("TIME", time);
        if (time != 0) {
            startActivity(i);
        } else {//TODO: Message da se odabere jedno od vremena
        }
        if (mp.isPlaying() == false) {
            mp.start();
            final int finalTime = time;
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                    if (finalTime != 0) {
                        startActivity(i);
                    } else {//TODO: Message da se odabere jedno od vremena
                    }
                }
            });
        }
    }

    public void btnBackHandler(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
