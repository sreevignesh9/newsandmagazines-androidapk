package com.example.newsandmagazines.ui.dashboard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsandmagazines.R;

import java.util.ArrayList;


class ViewHolder extends RecyclerView.ViewHolder {
    private TextView titleTextView;
    private ImageView thumbnailImageView;
    private TextView trailTextView;
    private CardView cardView;

    ViewHolder(View itemView) {
        super(itemView);
        titleTextView = itemView.findViewById(R.id.magazine_title_card);
        thumbnailImageView = itemView.findViewById(R.id.magazine_image_card);
//        trailTextView = itemView.findViewById(R.id.trail_text_card);
        cardView = itemView.findViewById(R.id.mag_card_view);
    }
}

public class Dashboardadapter extends RecyclerView.Adapter<Dashboardadapter.Viewholder> {


    private Context context;
    private ArrayList<Magazine> courseModelArrayList;
    private SharedPreferences sharedPrefs;

    // Constructor
    public Dashboardadapter(Context context, ArrayList<Magazine> courseModelArrayList) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
    }

    @NonNull
    @Override
    public Dashboardadapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.magazinecard, parent, false);
        return new Viewholder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull Dashboardadapter.Viewholder holder, int position) {

        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        // to set data to textview and imageview of each card layout
        Magazine model = courseModelArrayList.get(position);
        holder.courseNameTV.setText(model.gettitle());
//        holder.courseRatingTV.setText(model.gettail_text());
        holder.courseIV.setImageResource(model.getcur_image());
    }



    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return courseModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView courseIV;
        private TextView courseNameTV, courseRatingTV;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            courseNameTV = itemView.findViewById(R.id.magazine_title_card);
//            courseRatingTV = itemView.findViewById(R.id.trail_text_card);
            courseIV = itemView.findViewById(R.id.magazine_image_card);
        }
    }

}
