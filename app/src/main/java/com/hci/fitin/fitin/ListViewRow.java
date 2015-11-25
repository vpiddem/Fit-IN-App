package com.hci.fitin.fitin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Vikas on 11/23/2015.
 */
public class ListViewRow {

    // This is a reference to the layout we defined above
    public static final int LAYOUT = R.layout.custom_all_listview;

    private final Context context;


    private final TextView tv_CategoryName;
    private final TextView tv_Percentage;
    private final ImageView img_Category;
    private final ImageView img_Fav;
    private final ImageView img_CheckIn;

    public ListViewRow(Context context, View convertView) {
        this.context = context;
        this.img_Category = (ImageView) convertView.findViewById(R.id.listView_categoryImage);
        this.img_Fav = (ImageView) convertView.findViewById(R.id.listView_FavoriteImg);
        this.img_CheckIn = (ImageView) convertView.findViewById(R.id.listView_CheckInImg);

        this.tv_CategoryName = (TextView) convertView.findViewById(R.id.listView_categoryTitle);
        this.tv_Percentage = (TextView) convertView.findViewById(R.id.listView_PercentageText);
    }

    public void bind(CustomListViewModel customListViewModel) {
        this.tv_CategoryName.setText(customListViewModel.getTxt_CategoryName());
        this.tv_Percentage.setText(customListViewModel.getTxt_Percentage());

        Picasso.with(this.context).load(customListViewModel.getImg_CategoryResourceId())
                .error(R.drawable.icon)
                .resize(128,128)
                .transform(new CircleTransform())
                .into(this.img_Category);

        Picasso.with(this.context).load(customListViewModel.getImg_CheckInResourceId())
                .error(R.drawable.icon)
                .resize(96,96)
                .transform(new CircleTransform())
                .into(this.img_CheckIn);
        Picasso.with(this.context).load(customListViewModel.getImg_FavReourceId())
                .error(R.drawable.icon)
                .resize(128,128)
                .transform(new CircleTransform())
                .into(this.img_Fav);
    }
}