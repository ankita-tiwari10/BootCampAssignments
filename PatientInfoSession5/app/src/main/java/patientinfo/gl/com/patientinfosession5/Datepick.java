package patientinfo.gl.com.patientinfosession5;

import android.app.DatePickerDialog;

import android.content.Intent;

import android.support.v4.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Datepick extends FragmentActivity implements DatePickerDialog.OnDateSetListener {
    EditText edittext;
    GridView simpleGrid;
    int logos[] = {R.drawable.arrow4, R.drawable.arrow3, R.drawable.arrow2, R.drawable.arrow3,
            R.drawable.arrow4, R.drawable.arrow2, R.drawable.arrow4, R.drawable.arrow3, R.drawable.arrow2,
            R.drawable.arrow2, R.drawable.arrow3, R.drawable.arrow4, R.drawable.arrow3};
    final Calendar myCalendar = Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepick);


        edittext= (EditText) findViewById(R.id.date1);
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };
        edittext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(Datepick.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        simpleGrid = (GridView) findViewById(R.id.simpleGridView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), logos);
        simpleGrid.setAdapter(customAdapter);
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Datepick.this, SecondActivity.class);
                intent.putExtra("image", logos[position]);
                startActivity(intent);
            }
        });
    }

    private void updateLabel() {
        String myFormat = "MM/dd/yy";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        edittext.setText(sdf.format(myCalendar.getTime()));
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

    }


}
