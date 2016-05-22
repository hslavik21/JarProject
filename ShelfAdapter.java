package com.example.hillaryslavik.jarproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class ShelfAdapter extends ArrayAdapter<Shelf>
{

    Context context;
    int layoutResourceId = R.layout.shelf_image;
    Shelf data[] = null;

    public ShelfAdapter(Context context, int layoutResourceId, Shelf[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ShelfHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE));
            row = inflater.inflate(R.layout.shelf_image, null);


        }
        /*
        else
        {
            holder = (ShelfHolder)row.getTag();
        }
*/
        holder = new ShelfHolder();
        holder.shelfIcon = (ImageView)row.findViewById(R.id.imgIcon);
        holder.jarIcon1 = (ImageView)row.findViewById(R.id.jarIcon1);
        holder.jarIcon2 = (ImageView)row.findViewById(R.id.jarIcon2);
        holder.jarIcon3 = (ImageView)row.findViewById(R.id.jarIcon3);



        row.setTag(holder);
        Shelf shelves = data[position];
        holder.jarIcon1.setImageResource(shelves.jarPic1);
        holder.jarIcon2.setImageResource(shelves.jarPic2);
        holder.jarIcon3.setImageResource(shelves.jarPic3);
        holder.shelfIcon.setImageResource(shelves.shelfPic);

        return row;
    }

    public class ShelfHolder
    {
        ImageView shelfIcon;
        ImageView jarIcon1;
        ImageView jarIcon2;
        ImageView jarIcon3;
    }
}

