package com.rid.lat.ekantin.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rid.lat.ekantin.R;

public class LoginActivity extends AppCompatActivity {

    EditText inputName;
    EditText inputEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnNextScreen = (Button) findViewById(R.id.btn_login);

        btnNextScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);

                //Sending data to another Activity
                /*nextScreen.putExtra("name", inputName.getText().toString());
                nextScreen.putExtra("email", inputEmail.getText().toString());

                Log.e("n", inputName.getText()+"."+ inputEmail.getText());*/

                startActivity(nextScreen);

            }
        });
    }
}
