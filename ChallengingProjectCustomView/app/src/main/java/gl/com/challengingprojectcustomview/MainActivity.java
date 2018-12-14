package gl.com.challengingprojectcustomview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayoutBedroom;
    FrameLayout frameLayoutStoreRoom;
    FrameLayout frameLayoutKitchen;
    FrameLayout frameLayoutHall;
    TextView textView;
    EditText input;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_pet);
        builder = new AlertDialog.Builder(this);
        frameLayoutBedroom = findViewById(R.id.My_Container_1_ID);
        frameLayoutStoreRoom = findViewById(R.id.My_Container_2_ID);
        frameLayoutKitchen = findViewById(R.id.My_Container_3_ID);
        frameLayoutHall = findViewById(R.id.My_Container_4_ID);
        frameLayoutBedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListViewActivity.class);
                startActivity(intent);
            }
        });
        frameLayoutStoreRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SpinnerActivity.class);
                startActivity(intent);
            }
        });
        frameLayoutKitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GridViewActivity.class);
                startActivity(intent);
            }
        });

        frameLayoutHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogue();
            }
        });

    }

    public void dialogue() {

        builder.setMessage("What is your Pet Name");
        builder.setIcon(R.drawable.arrow4);


        input = new EditText(MainActivity.this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        input.setLayoutParams(lp);
        builder.setView(input);

        builder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                textView.setText(input.getText().toString());
                Toast.makeText(getApplicationContext(), "Ok is pressed", Toast.LENGTH_LONG).show();
            }
        });

        //Creating dialog box
        AlertDialog alert = builder.create();

        //Setting the title manually
        alert.setTitle("About Pet");
        alert.show();
    }
}
