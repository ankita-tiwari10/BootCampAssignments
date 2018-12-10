package fragments.gl.com.lifecycleprojsession4;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class greenFragment extends Fragment {

    View view;
    TextView display_text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_green, container,false);
        display_text=(TextView) view.findViewById(R.id.textView1);
        return view;
       // return inflater.inflate(R.layout.fragment_green, container, false);
    }
    public void setName(String Name){
        display_text.setText("Result::" + Name);
    }


}
