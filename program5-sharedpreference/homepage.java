package com.example.facebook_sharedpreference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class homepage extends AppCompatActivity implements View.OnClickListener {

    SharedPreferences sp;
    TextView e,p;
    Button prevbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sp = getSharedPreferences("MyPref",MODE_PRIVATE);
        e = (TextView)findViewById(R.id.homemail);
        p = (TextView)findViewById(R.id.hompass);
        prevbtn = (Button) findViewById(R.id.prevbtn);

        prevbtn.setOnClickListener(this);

        if(sp.contains("Email")){
            e.setText("Your Email : "+sp.getString("Email",""));
        }
        if(sp.contains("Password")){
            p.setText("Your Password : "+sp.getString("Password",""));
        }
    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}