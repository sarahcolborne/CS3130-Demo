package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText textField;
        textField = (EditText) findViewById(R.id.editText);

        final TextView textBox;
        textBox = (TextView) findViewById(R.id.textView);

        Button button;
        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View x){
                String temp = textField.getText().toString(); //get text from textField when button is clicked
                textBox.setText(temp); //insert text into textBox
            }

        });


    }
}
