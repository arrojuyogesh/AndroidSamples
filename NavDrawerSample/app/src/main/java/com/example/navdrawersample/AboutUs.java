package com.example.navdrawersample;

import androidx.core.app.ActivityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.navdrawersample.MainActivity.closeDrawer;

public class AboutUs extends AppCompatActivity {

    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        drawerLayout = findViewById(R.id.drawer_layout);
    }


    public void ClickMenu(View view){

        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){

        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){

        MainActivity.redirectActivity(this,MainActivity.class);
        MainActivity.closeDrawer(drawerLayout);
        finish();    }

    public void ClickDashboard(View view){
        MainActivity.redirectActivity(this,Dashboard.class);
        MainActivity.closeDrawer(drawerLayout);
        finish();
    }

    public void ClickAboutUs(View view){
        recreate();

    }
    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(false);

    }

}