package com.example.del777.multiplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Now connecting XML elements of layout to the backend

        Button multBtn = (Button) findViewById(R.id.multBtn);
        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
                EditText num2EditText = (EditText) findViewById(R.id.num2EditText);

                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);

                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());

                int result = num1 * num2;

                ResultTextView.setText(result + "");
            }
        });
    }
}
