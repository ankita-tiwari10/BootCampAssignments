package com.example.ankitatiwari.calculatorsession3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateActivity extends AppCompatActivity {
    private TextView Amount;
    private TextView Interest_Rate;
    private TextView Years;
    private EditText EditAmount;
    private EditText EditRate;
    private EditText EditYears;
    private Button CalculateSI;
    private  Button CalculateCI;
    private EditText EditCalculatedInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        Amount=findViewById(R.id.tvamount);
        Interest_Rate=findViewById(R.id.tvrate);
        Years=findViewById(R.id.tvYears);
        EditAmount =findViewById(R.id.amount);
        EditRate=findViewById(R.id.rate);
        EditYears=findViewById(R.id.years);
        CalculateSI=findViewById(R.id.button1);
        CalculateCI=findViewById(R.id.button2);
        EditCalculatedInterest=findViewById(R.id.editcalculatedinterest);
        CalculateSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(EditAmount.getText().toString());
                int num2 = Integer.parseInt(EditRate.getText().toString());
                int num = Integer.parseInt(EditYears.getText().toString());
SimpleInterest simpleInterest=new SimpleInterest();
               // int simpleInterest = (num1 * num2 * num) / 100;
                double calc = simpleInterest.simpleInterest(num1,num,num2);
                EditCalculatedInterest.setText(String.format("%.0f", calc));
             //   EditCalculatedInterest.setText(Integer.toString(si));
               // simplecalc ();
            }
        });
        CalculateCI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(EditAmount.getText().toString());
                int num2 = Integer.parseInt(EditRate.getText().toString());
                int num = Integer.parseInt(EditYears.getText().toString());
CompoundInterest compoundInterest=new CompoundInterest();
             double calc=compoundInterest.compoundInterest(num1,num,num2);
                EditCalculatedInterest.setText(String.format("%.0f", calc));
             //   EditCalculatedInterest.setText(Integer.toString(si));


            }
        });
    }
    public void simplecalc (){
        int num1 = Integer.parseInt(EditAmount.getText().toString());
        int num2 = Integer.parseInt(EditRate.getText().toString());
        int num = Integer.parseInt(EditYears.getText().toString());

        int si = (num1 * num2 * num) / 100;

        EditCalculatedInterest.setText(Integer.toString(si));
//        CompoundInterest cmp=new CompoundInterest();
//        cmp.CompoundInterest(num1,num2,num);
//        EditCalculatedInterest.setText((CharSequence) cmp);
    }
}
