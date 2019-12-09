package com.example.bustracking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

public void onCreate(Bundle x)
{
    super.onCreate(x);
    setContentView(R.layout.activity_home);
}

public void processGoClickListner(View view)
{

    Intent intent= new Intent(this,LoginActivity.class);
    startActivity(intent);
}

}
