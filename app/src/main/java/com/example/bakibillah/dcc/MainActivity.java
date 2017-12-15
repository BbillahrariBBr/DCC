package com.example.bakibillah.dcc;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
        BaseSliderView.OnSliderClickListener,ViewPagerEx.OnPageChangeListener {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Intent intent;
    //Button factsheet;
    //SliderLayout sliderLayout;
    ViewPager viewPager;
    SlideShowAdapter slideShowAdapter;
    CircleIndicator circleIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer);
        SetUpUiMain();
        setSupportActionBar(toolbar);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 3000, 5000);
        toggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,
                R.string.open_drawer,R.string.close_drawer);
        navigationView.setNavigationItemSelectedListener(MainActivity.this);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

    }

    public  void SetUpUiMain(){
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView = (NavigationView)findViewById(R.id.navigation_view);
        viewPager = (ViewPager)findViewById(R.id.viewPager_id);
        slideShowAdapter = new SlideShowAdapter(MainActivity.this);
        viewPager.setAdapter(slideShowAdapter);

    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.collegeHistory:
                intent = new Intent(MainActivity.this, CollegeHistoryActivity.class);
                startActivity(intent);
                break;

            case R.id.clgAdministration:
                intent = new Intent(MainActivity.this, AdministratorActivity.class);
                startActivity(intent);
                break;

            case R.id.faculty:
                intent = new Intent(MainActivity.this, FacultyActivity.class);
                startActivity(intent);
                break;

            case R.id.studentInfo:
                intent = new Intent(MainActivity.this, StudentInfoActivity.class);
               startActivity(intent);
                break;

            case R.id.clgInfras:
                intent = new Intent(MainActivity.this, CollegeInsfrastructureActivity.class);
                startActivity(intent);
                break;
//
            case R.id.clgLoc:
                intent = new Intent(MainActivity.this, CollegeLocationActivity.class);
                startActivity(intent);
                break;
//
            case R.id.admitInfo:
                intent = new Intent(MainActivity.this, AdmissionInformationActivity.class);
                startActivity(intent);
                break;
//
            case R.id.Contact:
                intent = new Intent(MainActivity.this, ContuctUsActivity.class);
                startActivity(intent);
                break;
//
            case R.id.clgRanking:
                intent = new Intent(MainActivity.this, RankingActivity.class);
                startActivity(intent);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }

    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public class MyTimerTask extends TimerTask{

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if (viewPager.getCurrentItem()==0){
                        viewPager.setCurrentItem(1);
                    }
                    else if (viewPager.getCurrentItem()==1){
                        viewPager.setCurrentItem(2);
                    }
                    else {
                        viewPager.setCurrentItem(0);
                    }

                }
            });
        }
    }


}
