package ues.tareaipam;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Client extends AppCompatActivity implements View.OnClickListener{

    private Spinner pay;
    private ClientManager[] cli;
    Button save = (Button) findViewById(R.id.ButtonSave);
    Button rad;
    private String radio;



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


    @Override
    public void onClick(View v) {
     switch(v.getId()){
         case R.id.ButtonSave:

             break;
     }
    }

    class ClientAdapter extends ArrayAdapter<ClientManager>{
       Activity context;

        public ClientAdapter(Activity context, ClientManager[] datos){
            super(context,R.layout.client_layout,datos);

        }

        public View getView(int posicion, View convertView, ViewGroup parent)
        {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.client_layout, null);

            TextView Code = (TextView) item.findViewById(R.id.Code);
            TextView Name = (TextView) item.findViewById(R.id.Name);
            TextView LastN = (TextView) item.findViewById(R.id.Last);
            TextView Id = (TextView) item.findViewById(R.id.ID);

            /*


            lblNombre.setText(listado[posicion].getNombre());

            lblApellidos.setText(listado[posicion].getApellido());
            lblCarrera.setText(listado[posicion].getCarrera());
            lblAnioIngreso.setText(Integer.toString(listado[posicion].getAnnioIngreso()));
            lblCiclo.setText(listado[posicion].getCicloActual());*/

            return (item);
        }
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.Whole:
                if (checked)
                   //rad=radiogroup.getCheckedRadioButtonId();
                    break;
            case R.id.Reta:
                if (checked)

                    break;
        }
    }
}
