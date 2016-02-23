package com.example.jovan.guesthewordloledition;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;


public class ResultActivity extends ActionBarActivity {
    ArrayList<Boolean> argList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle argsWrong = intent.getBundleExtra("BUNDLEWRONG");
        ArrayList<String> wrongWords = (ArrayList<String>) argsWrong.getSerializable("ARRAYLSITWRONG");

        Bundle argsRight = intent.getBundleExtra("BUNDLERIGHT");
        ArrayList<String> rightWords = (ArrayList<String>) argsRight.getSerializable("ARRAYLSITRIGHT");

        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Boolean> argList = (ArrayList<Boolean>) args.getSerializable("ARRAYLIST");
        this.argList = argList;


        ListView lvRight = (ListView) findViewById(R.id.lvRight);
        lvRight.setAdapter(new ArrayAdapter<String>(this, R.layout.white_text, rightWords));

        ListView lvWrong = (ListView) findViewById(R.id.lvWrong);
        lvWrong.setAdapter(new ArrayAdapter<String>(this, R.layout.white_text, wrongWords));

        TextView tvRight = (TextView) findViewById(R.id.tvCorrect);
        tvRight.setText("Corret: " + rightWords.size());

        TextView tvWrong = (TextView) findViewById(R.id.tvWrong);
        tvWrong.setText("Wrong: " + wrongWords.size());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //TODO
    }

    public void btnBackHandleFromResult(View view) {
        Intent i = new Intent(this, ChoseActivity.class);
        Bundle args =  new Bundle();
        args.putSerializable("ARRAYLIST", (Serializable)argList);
        i.putExtra("BUNDLE", args);
        startActivity(i);
    }
}
