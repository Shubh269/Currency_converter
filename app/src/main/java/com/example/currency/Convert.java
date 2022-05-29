package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Convert extends AppCompatActivity {

    Button button;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);

        button = findViewById(R.id.button2);
        editText= findViewById(R.id.editText);
        textView=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().isEmpty()) {
                    editText.setHint(("Enter the number"));
                }
                else{
                    String s=editText.getText().toString();
                    double i=Double.parseDouble(s);
                    double rupees=i*76;

                    textView.setText(Integer.toString((int) rupees));
                }
            }
        });

    }
}