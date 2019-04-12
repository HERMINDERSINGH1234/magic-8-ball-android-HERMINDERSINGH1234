package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    // this is the method of toast of creating
    public void makeToast(String string){

        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

       // method it is called by the button that is called the View.

    public void guess(View view) {

        // first find the value of the edit text display in the Toast.
        //EditText, guessEditText=id of button hai then call by resource.id.idname by find view by id

        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
         // we want to display that value as a Toast.

        //so then we have to convert the string into the integer so in java by this way Integer.parseInt();
        int guessInt=Integer.parseInt(guessEditText.getText().toString());

        if(guessInt > randomNumber) {
            makeToast("Lower!");
        }else if(guessInt < randomNumber) {
            makeToast("Higher!");
        } else
            {
            makeToast("That's Right! Try again!");
            //after getting the right answer so we have to again generate the random number again so again Random begins here.,.,

                Random rand =new Random();
                randomNumber= rand.nextInt(20)+1;
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // onCreate method is used when the app is launced so we create the random number when the app is launched

        Random rand =new Random();
        randomNumber= rand.nextInt(20)+1;
    }
}
