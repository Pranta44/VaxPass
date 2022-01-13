package cosc490.morgan.vaxpass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import cosc490.morgan.vaxpass.activities.HomeActivity;
import cosc490.morgan.vaxpass.activities.VaccinationRecordActivity;

public class CovidInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_info);

        // Start: Bottom Navigation Bar //
        BottomNavigationView bottomNavigationView = findViewById(R.id.navBar);

        bottomNavigationView.setSelectedItemId(R.id.ic_home);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0,0);
                    case R.id.ic_record:
                        startActivity(new Intent(getApplicationContext(), VaccinationRecordActivity.class));
                        overridePendingTransition(0,0);
                    case R.id.ic_info:
                        startActivity(new Intent(getApplicationContext(),CovidInfoActivity.class));
                        overridePendingTransition(0,0);
                }
            }
        });
        //Hello
        // End: Bottom Navigation Bar//
    }
}