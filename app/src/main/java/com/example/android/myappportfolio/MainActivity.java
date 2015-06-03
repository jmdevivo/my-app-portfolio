package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button media_streamer, super_duo1, super_duo2, ant_terminator,materialize, capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();


        media_streamer = (Button) findViewById(R.id.media_streamer);
        super_duo1 = (Button) findViewById(R.id.super_duo1);
        super_duo2 = (Button) findViewById(R.id.super_duo2);
        ant_terminator = (Button) findViewById(R.id.ant_terminator);
        materialize = (Button) findViewById(R.id.materialize);
        capstone = (Button) findViewById(R.id.capstone);

        media_streamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will open my media streamer", Toast.LENGTH_SHORT).show();
            }
        });

        super_duo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will display my score app", Toast.LENGTH_SHORT).show();
            }
        });

        super_duo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will display my library app", Toast.LENGTH_SHORT).show();
            }
        });

        ant_terminator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will display my large app", Toast.LENGTH_SHORT).show();
            }
        });

        materialize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will display my material design app", Toast.LENGTH_SHORT).show();
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will display my capstone app", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
