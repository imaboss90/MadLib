package com.example.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v){
        EditText myName = (EditText) findViewById(R.id.editName);
        EditText myAdj = (EditText) findViewById(R.id.editAdjective);
        EditText myPantheon = (EditText) findViewById(R.id.editPantheon);
        EditText myNoun = (EditText) findViewById(R.id.editNoun);

        String myNameStr = myName.getText().toString();
        String myAdjStr = myAdj.getText().toString();
        String myPantheonStr = myPantheon.getText().toString();
        String myNounStr = myNoun.getText().toString();


        Intent intent = new Intent(this, InfoActivity.class);

        intent.putExtra(InfoActivity.MY_NAME, myNameStr);
        intent.putExtra(InfoActivity.MY_NOUN, myNounStr);
        intent.putExtra(InfoActivity.MY_ADJ, myAdjStr);
        intent.putExtra(InfoActivity.MY_PANTH, myPantheonStr);

        startActivity(intent);
    }
}
