package ues.tareaipam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class client extends AppCompatActivity {

    private Spinner pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.client_layout);
        Intent intent = getIntent();
        ArrayAdapter<CharSequence> adaptadorPay = ArrayAdapter.createFromResource(this,R.array.PayArray,android.R.layout.simple_spinner_item);
        adaptadorPay.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pay = (Spinner)findViewById(R.id.paySpinner);
        pay.setAdapter(adaptadorPay);

    }


}
