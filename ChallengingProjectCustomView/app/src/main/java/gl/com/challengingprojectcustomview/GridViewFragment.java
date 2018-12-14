package gl.com.challengingprojectcustomview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridViewFragment extends Fragment {
    GridView grid;
    String narrowTopic;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.gridview_fragment, container,
                false);

        grid = (GridView) rootView.findViewById(R.id.simpleGridView);

        String[] letters = new String[] { "glassware", "cookbooks", "grocery/plastic", "stockpiled food", "fridge",
                "Dianing Table", "platform", "vegetables", "fruits", "tiffins",
                "bottles", "exhaust", "crane", "knife", "things",
                "mat", "utensils", "pan", "vegetables", "fruits",
                "material", "kitchen items", "things", "utensils", "water purifier", "filter"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, letters);

        grid.setAdapter(adapter);
        return rootView;
    }
}
