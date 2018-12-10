package fragments.gl.com.lifecycleprojsession4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

public class FragActivity extends FragmentActivity {
blueFragment fragmentblue;
greenFragment fragmentgreen;
EditText editText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);
        editText=findViewById(R.id.ed);
        blueFragment frg=new blueFragment();
        greenFragment frg1=new greenFragment();

        FragmentManager manager=getSupportFragmentManager();

        FragmentTransaction transaction=manager.beginTransaction();

        transaction.add(R.id.My_Container_1_ID, frg);
//        transaction.add(R.id.My_Container_3_ID, frg1);
//        transaction.addToBackStack(null);

        transaction.commit();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String str=editText.getText().toString();
        outState.putString("Text1",str);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        editText.setText(savedInstanceState.getString("Text1"));
    }
}
