package com.alyssa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText yourName = findViewById(R.id.guestName);
        Button button = findViewById(R.id.button);
        TextView greetings = findViewById(R.id.greetings);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String guestName = yourName.getText().toString();
                Log.d("test", guestName);
                if (guestName.equals("Alyssa")) {
                    Log.d("test", "Alyssa rules the world.");
                } else {
                    Log.d("test", "HI " + guestName);
                }
            }
        });
    }
}
