package patientinfo.gl.com.session5customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class GestureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesture);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        final int action = event.getAction();
        switch (action & MotionEvent.ACTION_MASK) {

            case MotionEvent.ACTION_DOWN: {

                Log.d("X---",Integer.toString((int) event.getX()));

                Log.d("y---",String.valueOf((int) event.getY()));

                break;
            }

            case MotionEvent.ACTION_MOVE:{


                Log.d("X---",String.valueOf((int) event.getX()));
                Log.d("y---",String.valueOf((int) event.getY()));

                break;
            }
        }
        return true;
    }
}
