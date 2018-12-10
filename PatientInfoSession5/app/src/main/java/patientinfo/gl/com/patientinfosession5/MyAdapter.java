package patientinfo.gl.com.patientinfosession5;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MyAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] tv;
    private final Integer[] image;
    public MyAdapter(Activity context, String[] tv, Integer[] image) {
        super(context, R.layout.lists, tv);
        this.context=context;
        this.tv=tv;
        this.image=image;
    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View view1=inflater.inflate(R.layout.lists,null,true);
        TextView textView=view1.findViewById(R.id.tv1);
        ImageView imageView=view1.findViewById(R.id.imgView);
        textView.setText(tv[position]);
        imageView.setImageResource(image[position]);
        return view1;
    };


}
