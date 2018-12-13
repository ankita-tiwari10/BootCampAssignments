package gl.com.session8navigationproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MobileInfoFrag extends Fragment {

    public static MobileInfoFrag newInstance(String text) {

        MobileInfoFrag f = new MobileInfoFrag();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_mobile_info, container, false);
        // Inflate the layout for this fragment

        TextView tv = (TextView) v.findViewById(R.id.tv);
        tv.setText(getArguments().getString("msg"));
        return v;
    }


}
