package com.example.ipangsapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

     EditText inputan;
     TextView outputan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // pemanggilan element

        inputan =(EditText) findViewById(R.id.inputanUser);
        outputan =(TextView) findViewById(R.id.outputanUser);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputan.setText(inputan.getText());
            }
        });
    }

}