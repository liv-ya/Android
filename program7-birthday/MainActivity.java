package com.example.birthday;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView im;
    LinearLayout l1;

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
        im=(ImageView) findViewById(R.id.img1);
        l1=(LinearLayout) findViewById(R.id.ll1);
        im.setOnClickListener(this);
        l1.setOnClickListener(this);

    }
    public void onClick(View view){
        if(view.getId()==R.id.img1){
            im.setVisibility(View.GONE);
            l1.setVisibility(View.VISIBLE);
        }
        else{
            im.setVisibility(View.VISIBLE);
            l1.setVisibility(View.GONE);
        }
    }
}