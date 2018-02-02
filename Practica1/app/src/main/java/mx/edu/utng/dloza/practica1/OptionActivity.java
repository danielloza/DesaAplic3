package mx.edu.utng.dloza.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
    }

    public void nextView1(View view) {

        startActivity(new Intent(this, CalculatorActivity.class));

    }

    public void nextView2(View view){
        startActivity(new Intent(this, FormActivity.class));


    }
}
