package com.android.leybiography;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get all id
        Toolbar toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        // define my toolbar
        setSupportActionBar(toolbar);

        // define a button for my nav bar
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout,
                toolbar, R.string.navigation_drawer_open, R.string.close_navigation_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // define actions when we click on an item
        navigationView.setNavigationItemSelectedListener(this);

        // set an item menu by default
        if (savedInstanceState == null) {
            navigationView.setCheckedItem(R.id.nav_profile);
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new ProfileFragment()).commit();
        }

    }

    @Override
    public void onBackPressed() {

        // close the drawer navigation if is open on back pressed
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ProfileFragment()).commit();
                break;
            case R.id.nav_biography:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new BiographyFragment()).commit();
                break;
            case R.id.nav_language_learned:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new LanguageFragment()).commit();
                break;
            case R.id.nav_certificate:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CertificateFragment()).commit();
                break;
            case R.id.nav_share:
                Intent shareApp = new Intent();
                shareApp.setAction(Intent.ACTION_SEND);
                shareApp.putExtra(Intent.EXTRA_TEXT, getResources().getString(R.string.shareText) +
                        "https://github.com/Ley-EL/BiographyApp");
                shareApp.setType("text/plain");
                startActivity(Intent.createChooser(shareApp, getResources().getString(R.string.appChooserTitle)));
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}