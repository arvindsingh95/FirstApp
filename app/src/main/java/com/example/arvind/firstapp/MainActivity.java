package com.example.arvind.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //psfi or psfs
    public static final int j = 1;
    public static final String str = "";
    public static final int i = 10;
    private void setupActionBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // Show the Up button in the action bar.
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupActionBar();
        Button buttonLogin = (Button) findViewById(R.id.button);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LoginActivity.class));

                // Type Toast and select create option.
                Toast.makeText(MainActivity.this, "shoe me thw move", Toast.LENGTH_SHORT).show();
                // Type fbc or fb
                Button viewById = (Button) findViewById(R.id.action_settings);
                // Type gone and set visibility gone.
                viewById.setVisibility(View.GONE);
                // Again with fbc
                TextView textView = (TextView) findViewById(R.id.action_settings);

                // Type IntentView with capital I
                Intent view = new Intent();
                view.setAction(Intent.ACTION_VIEW);
                view.setData(Uri.parse("tel:123456"));
                startActivity(view);
                
                String string = getResources().getString(R.string.app_name);

            }
        });
    }
}
