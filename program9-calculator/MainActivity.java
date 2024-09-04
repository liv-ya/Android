package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n1,n2;
    RadioButton b1,b2,b3,b4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        n1=(EditText) findViewById(R.id.num1);
        n2=(EditText) findViewById(R.id.num2);
        b1=(RadioButton) findViewById(R.id.add);
        b2=(RadioButton) findViewById(R.id.sub);
        b3=(RadioButton) findViewById(R.id.mult);
        b4=(RadioButton) findViewById(R.id.div);
        t1=(TextView) findViewById(R.id.res);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.add){
            int a = Integer.parseInt(n1.getText().toString());
            int b = Integer.parseInt(n2.getText().toString());
            String res=String.valueOf(a+b);
            t1.setText("Sum : "+res);
        }
        else if(view.getId() == R.id.sub){
            int a = Integer.parseInt(n1.getText().toString());
            int b = Integer.parseInt(n2.getText().toString());
            String res=String.valueOf(a-b);4
            t1.setText("Sum : "+res);
        }
        else if(view.getId() == R.id.mult){
            int a = Integer.parseInt(n1.getText().toString());
            int b = Integer.parseInt(n2.getText().toString());
            String res=String.valueOf(a*b);
            t1.setText("Sum : "+res);
        }
        else{
            int a = Integer.parseInt(n1.getText().toString());
            int b = Integer.parseInt(n2.getText().toString());
            String res=String.valueOf(a/b);
            t1.setText("Sum : "+res);
        }
    }
}