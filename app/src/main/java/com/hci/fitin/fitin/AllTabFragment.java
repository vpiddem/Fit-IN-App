package com.hci.fitin.fitin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AllTabFragment extends Fragment {

    ListView allDrawerList;
    public View myFragmentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        //Load ListView Data
        /**
         * AllList View
         */
        myFragmentView=inflater.inflate(R.layout.all_layout, container, false);
        allDrawerList = (ListView) myFragmentView.findViewById(R.id.taball_drawer);
        allDrawerList.setOnItemClickListener(new DrawerItemClickListener());



        int imgCategoryResourceId = getResources().getIdentifier(
                "tread", "drawable", getActivity().getPackageName());

        int imgFavoriteResourceId = getResources().getIdentifier(
                "favorites", "drawable", getActivity().getPackageName());
;
        int imgCheckInResourceId=getResources().getIdentifier(
                "checkin", "drawable", getActivity().getPackageName());


        CustomListViewModel firstRow = new CustomListViewModel("First","90%", imgCategoryResourceId,imgFavoriteResourceId,imgCheckInResourceId);
        CustomListViewModel secondRow = new CustomListViewModel("Second", "25%",imgCategoryResourceId,imgFavoriteResourceId,imgCheckInResourceId);
        CustomListViewModel thirdRow = new CustomListViewModel("Third", "45%",imgCategoryResourceId,imgFavoriteResourceId,imgCheckInResourceId);


        List<CustomListViewModel> viewModels = new ArrayList<CustomListViewModel>();
        viewModels.add(firstRow);
        viewModels.add(secondRow);
        viewModels.add(thirdRow);

        ListViewAdapter adapter = new ListViewAdapter(getActivity(), viewModels);
        allDrawerList.setAdapter(adapter);

        return myFragmentView;
    }

    /* The click listner for ListView in the navigation drawer */
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //selectItem(position);
        }
    }
}
