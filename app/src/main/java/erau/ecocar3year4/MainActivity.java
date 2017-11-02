package erau.ecocar3year4;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void settingButtonClicked(View view){
        Intent intent = new Intent(MainActivity.this, SettingActivity.class);
        startActivity(intent);
    }

    public void informationButtonClicked(View view){
        Intent intent = new Intent(MainActivity.this, SettingActivity.class);
        startActivity(intent);
    }
    public void performanceButtonClicked(View view){
        Intent intent = new Intent(MainActivity.this, SettingActivity.class);
        startActivity(intent);
    }
    public void diagnosticButtonClicked(View view){
        Intent intent = new Intent(MainActivity.this, SettingActivity.class);
        startActivity(intent);
    }







}
