package com.example.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private static String story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // https://developer.android.com/guide/topics/ui/controls/spinner#java

        Spinner spin = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.story_array, R.layout.my_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                story = parent.getItemAtPosition(position).toString();
                //Spinner spin1 = (Spinner) findViewById(R.id.spinner1);
                //String selected = spin1.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public static String getStory(){
        return story;
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
