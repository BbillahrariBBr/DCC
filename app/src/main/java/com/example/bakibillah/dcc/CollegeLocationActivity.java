package com.example.bakibillah.dcc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CollegeLocationActivity extends AppCompatActivity {
    Button showmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_location);
        setupUILocation();
    }

    public void setupUILocation(){
        showmap = (Button)findViewById(R.id.buttonShowMap);

    }

    public void showmapClick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:23.7396659,90.3821255"));
        Intent chooser = Intent.createChooser(i,"Show Map");
        startActivity(chooser);
    }
}
