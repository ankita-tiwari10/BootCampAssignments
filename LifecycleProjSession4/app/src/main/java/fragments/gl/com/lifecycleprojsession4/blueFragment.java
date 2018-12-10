package fragments.gl.com.lifecycleprojsession4;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;


public class blueFragment extends Fragment {
    View view;
    Button btn;





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_blue, container, false);
        btn=(Button) view.findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();

             fr.add(R.id.My_Container_3_ID,new  greenFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });
        return view;

    }

}
