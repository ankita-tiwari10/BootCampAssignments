package patientinfo.gl.com.patientinfosession5;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class BasicEventActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
EditText ed1;
EditText ed2;
TextView tv;
Button but;
Button dateBut;
    DatePicker picker;
    RadioButton genderradioButton;
    RadioGroup radioGroup;
    CheckBox pizza,coffe;
    String[] disease = { "malaria", "Typhoid", "neumonia", "Dengue", "Other"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_event);
        ed1=findViewById(R.id.editText1);
        ed2=findViewById(R.id.editText2);
        tv=findViewById(R.id.textV);
        but=findViewById(R.id.button);
        dateBut=findViewById(R.id.DateButton);
        pizza=(CheckBox)findViewById(R.id.checkBox1);
        coffe=(CheckBox)findViewById(R.id.checkBox2);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
       // picker=(DatePicker)findViewById(R.id.datePicker);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=ed1.getText().toString();
                String value2=ed2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
                tv.setText(String.valueOf(sum));
            }
        });
        Disease();
        Checkbox();
        RadioBut();
        Date();


    }

public void Date(){
    dateBut.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(getApplicationContext(),Datepick.class);
            startActivity(intent);
        }
    });
}
    public void RadioBut(){

                int selectedId = radioGroup.getCheckedRadioButtonId();
                genderradioButton = (RadioButton) findViewById(selectedId);
                if(selectedId==-1){
                    Toast.makeText(this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }

    }
//    public void Date(){
//        picker.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Change Date: "+getCurrentDate(), Toast.LENGTH_SHORT).show();
//
//            }
//
//        });
//    }
//    public String getCurrentDate(){
//        StringBuilder builder=new StringBuilder();;
//        builder.append((picker.getMonth() + 1)+"/");//month is 0 based
//        builder.append(picker.getDayOfMonth()+"/");
//        builder.append(picker.getYear());
//        return builder.toString();
//    }
    public  void Checkbox(){
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pizza.isChecked()){
                    Toast.makeText(getApplicationContext(), "Pizza Is Selected", Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), "Coffee Is Selected", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
public void Disease(){
    Spinner spin = (Spinner) findViewById(R.id.spinner);
    spin.setOnItemSelectedListener(this);

    //Creating the ArrayAdapter instance having the country list
    ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,disease);
    aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    //Setting the ArrayAdapter data on the Spinner
    spin.setAdapter(aa);
}
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),disease[position] , Toast.LENGTH_LONG).show();
        Log.v(disease[position],"disease name Spinner");
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
