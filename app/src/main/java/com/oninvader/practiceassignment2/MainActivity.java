package com.oninvader.practiceassignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email;
    TextView label;
    Button button;
    String verified;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        label = (TextView) findViewById(R.id.label);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verified = email.getText().toString();
                if(verified.contains("@")){
                    label.setText("Verified");
                    label.setVisibility(View.VISIBLE);
                    label.setTextColor(getResources().getColor(R.color.success));
                }else{
                    label.setText("Declined");
                    label.setVisibility(View.VISIBLE);
                    label.setTextColor(getResources().getColor(R.color.error));
                }
            }
        });
    }
}
