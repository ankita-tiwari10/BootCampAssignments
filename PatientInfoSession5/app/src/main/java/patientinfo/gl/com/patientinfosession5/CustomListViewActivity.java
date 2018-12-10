package patientinfo.gl.com.patientinfosession5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class CustomListViewActivity extends AppCompatActivity {
ListView lst;
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
        setContentView(R.layout.activity_custom_list_view);
        MyAdapter myAdapter=new MyAdapter(this,tv,image);
        lst=(ListView)findViewById(R.id.listview);
        lst.setAdapter(myAdapter);

    }

}
