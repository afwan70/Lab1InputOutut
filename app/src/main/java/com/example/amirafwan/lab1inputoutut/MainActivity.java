package com.example.amirafwan.lab1inputoutut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtMessage;
    Button submitButton;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessage = (TextView) findViewById(R.id.textView);
        submitButton = (Button) findViewById(R.id.button);
    }

    public void displayText(View view) {
        txtMessage.setText("WELCOME! -" + counter++);

        Toast toast =  Toast.makeText(this,"WELCOME", Toast.LENGTH_SHORT);
        toast.show();
    }

}





