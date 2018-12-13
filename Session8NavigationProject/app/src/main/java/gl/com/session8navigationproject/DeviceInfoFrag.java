package gl.com.session8navigationproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DeviceInfoFrag extends Fragment {

    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    public static final DeviceInfoFrag newInstance(String paramString)
    {
        DeviceInfoFrag f = new DeviceInfoFrag();
        Bundle localBundle = new Bundle();
        localBundle.putString("msg", paramString);
        f.setArguments(localBundle);
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
        View rootView = inflater.inflate(R.layout.fragment_device_info, container, false);

        // Get the arguments that was supplied when
        // the fragment was instantiated in the
        // CustomPagerAdapter
        TextView tv = (TextView) rootView.findViewById(R.id.text);
        tv.setText(getArguments().getString("msg"));

//        Bundle args = getArguments();
//        ((TextView) rootView.findViewById(R.id.text)).setText("Page " + args.getInt("page_position"));

        return rootView;
    }




}
