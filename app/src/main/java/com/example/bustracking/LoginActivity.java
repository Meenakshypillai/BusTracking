package com.example.bustracking;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.messaging.FirebaseMessaging;

public class LoginActivity extends AppCompatActivity {
   // private static final String TAG ="LoginActivity";
    @Override
    public void onCreate(@Nullable Bundle x) {
        super.onCreate(x);
        setContentView(R.layout.activity_login_new);

        // Button buttonLogin = findViewById(R.id.button);

    }
        public void processLoginlinkClick(View v)
        {
            final EditText etUsername = findViewById((R.id.etUserName));
            final EditText etPassword = findViewById(R.id.etPassword);

                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (username.equals("username") && password.equals("password")) {
                    Intent intent = new Intent(this, RegUserActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Credential", Toast.LENGTH_LONG).show();

                }
            }



    public void processSignuplinkClick (View view){
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);

    }


}


