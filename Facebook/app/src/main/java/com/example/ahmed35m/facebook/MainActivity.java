package com.example.ahmed35m.facebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button LogInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        LogInButton = (Button) findViewById(R.id.logbutton);

    }

    public void displayHome(View view) {
        Intent intent = new Intent(this, homepage1.class);
        startActivity(intent);

    }
}
