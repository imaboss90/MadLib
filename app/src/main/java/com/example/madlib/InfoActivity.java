package com.example.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    public static final String MY_NAME = "name";
    public static final String MY_NOUN = "noun";
    public static final String MY_ADJ = "adjective";
    public static final String MY_PANTH = "pantheon";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.myTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        //setTheme();


        Intent intent = getIntent();
        String myName = intent.getStringExtra(MY_NAME);
        String myNoun = intent.getStringExtra(MY_NOUN);
        String myAdj = intent.getStringExtra(MY_ADJ);
        String myPantheon = intent.getStringExtra(MY_PANTH);

        String strToDisplay = "My name is " + myName + " and I am the greatest immortal being to ever"
                + " walk this earth!" + " I am of the " + myPantheon + " pantheon, one that has been " +
                "ruling throughout time itself. " + "When I went to go meet Zeus the other day, he wanted to give me" +
                " a " + myAdj + " " + myNoun + ". It was by far my favorite gift I have ever received and wish to" +
                " give it to all.";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }
}
