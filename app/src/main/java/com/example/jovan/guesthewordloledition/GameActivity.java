package com.example.jovan.guesthewordloledition;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;



public class GameActivity extends ActionBarActivity {

    private Word word;
    private int time;
    private ArrayList<String> wrong = new ArrayList<>();
    private ArrayList<String> right = new ArrayList<>();

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);
        final Intent intentNext = new Intent(this, ResultActivity.class);


        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Boolean> list = (ArrayList<Boolean>) args.getSerializable("ARRAYLIST");

        time = intent.getIntExtra("TIME", 60);
        final Word word = new Word(list);
        this.word = word;

        Bundle argsNext =  new Bundle();
        argsNext.putSerializable("ARRAYLIST", (Serializable) list);
        intentNext.putExtra("BUNDLE", args);

        final TextView tv = (TextView) findViewById(R.id.tViewTimer);
        final TextView tvWord = (TextView) findViewById(R.id.tvWord);
        final Button btnCorrect = (Button) findViewById(R.id.btnCorrect);
        final Button btnWrong = (Button) findViewById(R.id.btnWrong);

        final Handler handler  = new Handler();

//Novi Thread za tajmer
        final Runnable runnable = new Runnable() {
            private long startTime = System.currentTimeMillis();
            @Override
            public void run() {
                //Odbrojavanje do pocetka igre
                for (int i = 5; i >= 0; i--){
                    try {                            //TODO: Postaviti buttone da nestanu u ovom intervalu
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            long x = 6 - ((System.currentTimeMillis() - startTime) / 1000);
                            tv.setText("" + x);
                            btnCorrect.setClickable(false);
                            btnWrong.setClickable(false);
                        }
                    });

                    //PRvo upisivanje pojma
                    if (6 - ((System.currentTimeMillis() - startTime) /1000) == 0 ) {
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                tvWord.setText(word.getRandomWord());
                                btnCorrect.setClickable(true);
                                btnWrong.setClickable(true);
                            }
                        });
                    }
                }

                startTime = System.currentTimeMillis();
                for (int i = time; i != 0; i--){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            long x = time - ((System.currentTimeMillis() - startTime) / 1000);
                            tv.setText("" + x);
                        }
                    });
                }

                Bundle argswrong =  new Bundle();
                Bundle argsright =  new Bundle();
                argsright.putSerializable("ARRAYLSITRIGHT", (Serializable) right);
                argswrong.putSerializable("ARRAYLSITWRONG", (Serializable) wrong);
                intentNext.putExtra("BUNDLERIGHT", argsright);
                intentNext.putExtra("BUNDLEWRONG", argswrong);

                startActivity(intentNext);
                //TODO: novi Activity

            }
        };
            new Thread(runnable).start();
    }



    public void btnCorrectHandler(View view) {
        final TextView tvWord = (TextView) findViewById(R.id.tvWord);
        right.add(tvWord.getText().toString());
        tvWord.setText(this.word.getRandomWord());
        MediaPlayer mp = MediaPlayer.create(this, R.raw.victory);
        mp.start();

    }

    public void btnWrongHandler(View view) {
        final TextView tvWord = (TextView) findViewById(R.id.tvWord);
        wrong.add(tvWord.getText().toString());
        tvWord.setText(this.word.getRandomWord());
        MediaPlayer mp = MediaPlayer.create(this, R.raw.defeat);
        mp.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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


}
