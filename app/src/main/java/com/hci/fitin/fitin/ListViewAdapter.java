package com.hci.fitin.fitin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vikas on 11/23/2015.
 */
public class ListViewAdapter extends BaseAdapter {

    private final List<CustomListViewModel> viewModels;

    private final Context context;
    private final LayoutInflater inflater;

    public ListViewAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.viewModels = new ArrayList<CustomListViewModel>();
    }

    public ListViewAdapter(Context context, List<CustomListViewModel> viewModels) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.viewModels = viewModels;
    }

    public List<CustomListViewModel> viewmodels() {
        return this.viewModels;
    }

    @Override
    public int getCount() {
        return this.viewModels.size();
    }

    @Override
    public CustomListViewModel getItem(int position) {
        return this.viewModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        // We only need to implement this if we have multiple rows with a different layout. All your rows use the same layout so we can just return 0.
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // We get the view model for this position
        final CustomListViewModel viewModel = getItem(position);

        ListViewRow row;
        // If the convertView is null we need to create it
        if(convertView == null) {
            convertView = this.inflater.inflate(ListViewRow.LAYOUT, parent, false);

            // In that case we also need to create a new row and attach it to the newly created View
            row = new ListViewRow(this.context, convertView);
            convertView.setTag(row);
        }

        // After that we get the row associated with this View and bind the view model to it
        row = (ListViewRow) convertView.getTag();
        row.bind(viewModel);

        return convertView;
    }
}