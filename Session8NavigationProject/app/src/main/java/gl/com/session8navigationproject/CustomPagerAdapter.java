package gl.com.session8navigationproject;

import android.content.Context;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomPagerAdapter extends FragmentPagerAdapter {
    protected Context mContext;
    public CustomPagerAdapter(FragmentManager fm) {
        super(fm);

    }



    @Override
    public Fragment getItem(int position) {
        switch(position) {

            case 0: return DeviceInfoFrag.newInstance("Device Information");
            case 1: return MobileInfoFrag.newInstance("Mobile Information");
            case 2: return AppVersionFrag.newInstance("Application Version");

            default: return AppVersionFrag.newInstance("Application Version");
        }


    }

    @Override
    public int getCount() {
        return 3;
    }
}
