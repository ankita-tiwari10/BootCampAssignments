package gl.com.session8navigationproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class AppVersionFrag extends Fragment {
    public static AppVersionFrag newInstance(String text) {

        AppVersionFrag f = new AppVersionFrag();
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
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_app_version, container, false);
        TextView tv = (TextView) v.findViewById(R.id.tv1);
        tv.setText(getArguments().getString("msg"));
        return v;
    }


}
