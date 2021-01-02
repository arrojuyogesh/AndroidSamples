package com.example.navdrawersample;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.navdrawersample.MainActivity.closeDrawer;

public class Dashboard extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

    }
    public void ClickMenu(View view){

        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){

        closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){

        MainActivity.redirectActivity(this,MainActivity.class);
        closeDrawer(drawerLayout);
        finish();
    }

    public void ClickDashboard(View view){
        recreate();
        closeDrawer(drawerLayout);

    }

    public void ClickAboutUs(View view){

        MainActivity.redirectActivity(this,AboutUs.class);
        closeDrawer(drawerLayout);
        finish();    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }
}