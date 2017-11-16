package erau.ecocar3year4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int fuelrate;
    int speedinst;
    int current;

    float speedRateTot;
    float ruelRateTot;
    float fuelConsume;
    float totFuelconsume;
    float avgFuelConsume;
    float elecConsume;
    float avgElecConsume;
    float totElecConsume;
    float gasheatbyV;
    float mpgge;
    float evrange;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Button click call

    //Call Setting Activity
    public void settingButtonClicked(View view){
        Intent intent = new Intent(MainActivity.this, SettingActivity.class);
        startActivity(intent);
    }

    //Call Information Activity
    public void informationButtonClicked(View view){
        Intent intent = new Intent(MainActivity.this, InformationActivity.class);
        startActivity(intent);
    }

    //Call Performance Activity
    public void performanceButtonClicked(View view){
        Intent intent = new Intent(MainActivity.this, PerformanceActivity.class);
        startActivity(intent);
    }

    //Call Diagnostic Activity
    public void diagnosticButtonClicked(View view){
        Intent intent = new Intent(MainActivity.this, DiagnosticActivity.class);
        startActivity(intent);
    }









}

