package gl.com.session8customapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomApp customApp= (CustomApp) getApplicationContext();
        customApp.onCreate();
        Log.d("oncreateActivity","oncreateActivity");
    }

}
