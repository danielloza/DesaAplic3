package mx.edu.utng.dloza.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    private Button btnSubmit;
    private EditText edtName;
    private EditText edtPhone;
    private EditText edtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        btnSubmit = findViewById(R.id.btn_submit);
        edtName = findViewById(R.id.edt_name);
        edtPhone = findViewById(R.id.edt_phone);
        edtAge = findViewById(R.id.edt_age);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create the Intent
                Intent intent = new Intent(FormActivity.this,
                        DataActivity.class);
                Bundle b = new Bundle();
                b.putString("Name", edtName.getText().toString());
                b.putString("Age", edtAge.getText().toString());
                b.putString("Phone", edtPhone.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }

}
