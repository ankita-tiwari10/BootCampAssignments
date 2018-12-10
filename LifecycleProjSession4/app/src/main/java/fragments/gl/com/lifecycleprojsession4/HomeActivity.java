package fragments.gl.com.lifecycleprojsession4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "LifeCycle";
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate(Bundle) called");
        Toast toast = Toast.makeText(getApplicationContext(),
                "Create",
                Toast.LENGTH_SHORT);

        toast.show();
       button=findViewById(R.id.buttonforFragment) ;
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getApplicationContext(),FragActivity.class);
               startActivity(intent);
           }
       });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
        Toast toast = Toast.makeText(getApplicationContext(),
                "Start",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
        Toast toast = Toast.makeText(getApplicationContext(),
                "Stop",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
        Toast toast = Toast.makeText(getApplicationContext(),
                "Pause",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
        Toast toast = Toast.makeText(getApplicationContext(),
                "Resume",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
        Toast toast = Toast.makeText(getApplicationContext(),
                "destroy",
                Toast.LENGTH_SHORT);

        toast.show();
    }
}
