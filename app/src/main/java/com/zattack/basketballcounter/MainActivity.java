package com.zattack.basketballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void threeA(View view){
        scoreA+=3;
        printScoreA(scoreA);
    }

    public void threeB(View view){
        scoreB+=3;
        printScoreB(scoreB);
    }

    public void twoA(View view){
        scoreA+=2;
        printScoreA(scoreA);
    }
    public void twoB(View view){
        scoreB+=2;
        printScoreB(scoreB);
    }
    public void freeA(View view){
        scoreA++;
        printScoreA(scoreA);
    }
    public void freeB(View view){
        scoreB++;
        printScoreB(scoreB);
    }
    public void resetReq(View view){
        scoreA=0;
        scoreB=0;
        printScoreA(scoreA);
        printScoreB(scoreB);
    }
    public void printScoreA(int scoreA){
        TextView teamA = (TextView) findViewById(R.id.textView3);
        teamA.setText("" + scoreA);
    }

    public void printScoreB(int scoreB){
        TextView teamB = (TextView) findViewById(R.id.textView4);
        teamB.setText(""+scoreB);
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
