package patientinfo.gl.com.session5customlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class CustomList extends AppCompatActivity {
    ListView lst;
    Button button;
    String[] tv ={
            "List 1","List 2",
            "List 3","List 4",
            "List 5",
    };
    Integer[] image={
            R.drawable.arrow4,R.drawable.arrow2,
            R.drawable.arrow3,R.drawable.arrow4,
            R.drawable.arrow2,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
button=findViewById(R.id.but);
        MyAdapter myAdapter=new MyAdapter(this,tv,image);
        lst=(ListView)findViewById(R.id.listview);
        lst.setAdapter(myAdapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }

            }
        });
        PatientInfo();
    }
    public  void PatientInfo(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),PatientInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
