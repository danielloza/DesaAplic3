package mx.edu.utng.dloza.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    private TextView txtData2;
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        //Identify the controls
        txtData2 = findViewById(R.id.txtData2);

        //Recuperate the information pass in the intent
        Bundle bundle = this.getIntent().getExtras();

        //Construct the message to show
        txtData2.setText("Hello " + bundle.getString("Name") + ", " +
                bundle.getString("Age") + ", " + bundle.getString("Phone"));
    }


}
