package com.example.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    public static final String MY_NAME = "name";
    public static final String MY_NOUN = "noun";
    public static final String MY_ADJ = "adjective";
    public static final String MY_PANTH = "pantheon";

    MainActivity obj = new MainActivity();
    public String story = MainActivity.getStory();

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

        if(story.equalsIgnoreCase("Story 1")) {
            String strToDisplay = "My name is " + myName + " and I am the greatest immortal being to ever"
                    + " walk this earth!" + " On the weekends you can catch me eating some " + myPantheon + ", which I find very delicious."
                    + "When I went to go meet Zeus the other day, he wanted to give me" +
                    " a " + myAdj + " " + myNoun + ". It was by far my favorite gift I have ever received and wish to" +
                    " give it to all.";
            TextView str = (TextView) findViewById(R.id.info);
            str.setText(strToDisplay);
        }

        if(story.equalsIgnoreCase("Story 2")) {
            String strToDisplay = "It was a very " + myAdj + " night in October. " + myName + " was trying to find their "
                    + myNoun + " that got lost in the forest. Maybe it could be persuaded to come back?" + myName + " took the "
                    + myPantheon + " and cooked it in a pot. The smell of the " + myPantheon + " was so good, it brought back their " + myNoun + ".";
            TextView str = (TextView) findViewById(R.id.info);
            str.setText(strToDisplay);
        }

        if(story.equalsIgnoreCase("Story 3")) {
            String strToDisplay = "Over the years I've been contemplating if I want to open up a restaraunt where I will sell "
                    + myPantheon + ". My friend " + myName + " said it was a rookie move and would turn me into a " + myAdj + " "
                    + myNoun + ". So I don't think I'm going through with that idea...";
            TextView str = (TextView) findViewById(R.id.info);
            str.setText(strToDisplay);
        }



    }
}
