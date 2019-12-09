package com.example.bustracking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegUserActivity  extends AppCompatActivity {

    public void onCreate(@Nullable Bundle x) {
        super.onCreate(x);
        setContentView(R.layout.activity_reguser);

        // Button buttonLogin = findViewById(R.id.button);

    }
public void processTracklinkClick(View view)
{
    Intent intent= new Intent(this, TrackBus.class);
    startActivity(intent);

}

public void processSearchBusLinkClick(View view) {

        Intent intent= new Intent(this, FindBus.class);
        startActivity(intent);

}

}