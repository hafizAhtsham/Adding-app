package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

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
        Button sum=findViewById(R.id.add);
        EditText n1=findViewById(R.id.num1);
        EditText n2=findViewById(R.id.number2);
        TextView ans=findViewById(R.id.ans);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                if(!n1.getText().toString().isEmpty()&&!n2.getText().toString().isEmpty())
                {
                    float a=Float.parseFloat(n1.getText().toString())+Float.parseFloat(n2.getText().toString());
                    ans.setText(Float.toString(a));
                    n1.setText("");
                    n2.setText("");
                }
            }
        });



    }
}