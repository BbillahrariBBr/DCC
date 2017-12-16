package com.example.bakibillah.dcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacultyActivity extends AppCompatActivity {
    Button buttonAccounting;
    Button buttonBba;
    Button buttonChem;
    Button buttonCse;
    Button buttonEng;
    Button buttonMath;
    Button buttonStat;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        setUpUIFaculty();
    }
    public  void setUpUIFaculty(){
        buttonAccounting = (Button)findViewById(R.id.buttonAccounting);
        buttonBba = (Button)findViewById(R.id.buttonBba);
        buttonChem = (Button)findViewById(R.id.buttonChem);
        buttonCse = (Button)findViewById(R.id.buttonCse);
        buttonEng = (Button)findViewById(R.id.buttonEng);
        buttonMath = (Button)findViewById(R.id.buttonMath);
        buttonStat = (Button)findViewById(R.id.buttonStat);


    }

    public void showFaculty(View view) {
        if(view.getId()==R.id.buttonAccounting){
            i = new Intent(FacultyActivity.this,AccountingActivity.class);
            startActivity(i);
        }

        if(view.getId()==R.id.buttonBba){
            i = new Intent(FacultyActivity.this,BBAActivity.class);
            startActivity(i);
        }
        if(view.getId()==R.id.buttonChem){
            i = new Intent(FacultyActivity.this,ChemActivity.class);
            startActivity(i);
        }
        if(view.getId()==R.id.buttonCse){
            i = new Intent(FacultyActivity.this,CseActivity.class);
            startActivity(i);
        }
        if(view.getId()==R.id.buttonMath){
            i = new Intent(FacultyActivity.this,MathActivity.class);
            startActivity(i);
        }
        if(view.getId()==R.id.buttonEng){
            i = new Intent(FacultyActivity.this,EngActivity.class);
            startActivity(i);
        }
        if(view.getId()==R.id.buttonStat){
            i = new Intent(FacultyActivity.this,StatActivity.class);
            startActivity(i);
        }
    }
}
