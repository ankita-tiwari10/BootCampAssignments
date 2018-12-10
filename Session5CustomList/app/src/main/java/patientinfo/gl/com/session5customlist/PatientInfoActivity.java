package patientinfo.gl.com.session5customlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PatientInfoActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
EditText editFirst;
EditText editLast;
EditText editValue;
Button button;
Spinner spinDiag;
Spinner spinDate;
Button butListView;
    Button coordinateBut;
TextView tvValue;
    Button butBasic;
    AlertDialog.Builder builder;
    String[] diagnostic = { "Cold", "Fever", "Body Ache","HeadAche"};
    String[] dates={"07/12/2018","16/12/2018","20/12/2018"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_info);
        editFirst=findViewById(R.id.edFirstName);
        editLast=findViewById(R.id.edLastName);
        editValue=findViewById(R.id.edValue);
        spinDate=findViewById(R.id.date_spinner);
        spinDiag=findViewById(R.id.diag_spinner);
        tvValue=findViewById(R.id.tvValue);
        button=findViewById(R.id.buttonSave);
        builder = new AlertDialog.Builder(this);
        diagTest();
        DateForDiag();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable firstName=editFirst.getText();
                Editable lastName=editLast.getText();
                Editable value=editValue.getText();
                String text = spinDiag.getSelectedItem().toString();

                String text1 = spinDate.getSelectedItem().toString();

                builder.setMessage("FirstName:"+firstName+"  "+"LastName:"+lastName+"  "+"Diagnostic:"+text+"  "+"Value:"+value+"  "+"Date:"+text1);
                AlertDialog alert = builder.create();
                alert.setTitle("Patient Information");
                alert.show();
            }
        });
        CoOrdianate();
    }
public void CoOrdianate(){
    coordinateBut=findViewById(R.id.CoOrdinate);
    coordinateBut.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
Intent intent=new Intent(getApplicationContext(),GestureActivity.class);
startActivity(intent);
        }
    });
}
public  void DateForDiag(){
    spinDate.setOnItemSelectedListener(this);
    ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,dates);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinDate.setAdapter(adapter);
}
    public  void diagTest(){
        spinDiag.setOnItemSelectedListener(this);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,diagnostic);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinDiag.setAdapter(adapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Object item = parent.getItemAtPosition(position);
       String value1 = item.toString();
        String text = spinDiag.getSelectedItem().toString();

        if(!text.equals("Cold")){
            editValue.setVisibility(View.VISIBLE);
            tvValue.setVisibility(View.VISIBLE);
        }
        else {
            editValue.setVisibility(View.INVISIBLE);
            tvValue.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
