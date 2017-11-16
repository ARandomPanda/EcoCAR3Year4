package erau.ecocar3year4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DiagnosticActivity extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_diagnostic);
    }


    public void ElectConButtonClicked(View view){
        Intent intent = new Intent(DiagnosticActivity.this, DrawGraphActivity.class);
        startActivity(intent);
    }

    public void CurDraButtonClicked(View view){
        Intent intent = new Intent(DiagnosticActivity.this, DrawGraphActivity.class);
        startActivity(intent);
    }

    public void FuelConButtonClicked(View view){
        Intent intent = new Intent(DiagnosticActivity.this, DrawGraphActivity.class);
        startActivity(intent);
    }

}
