package com.example.newsandmagazines.ui.home;

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
        titleTextView = itemView.findViewById(R.id.title_card);
        thumbnailImageView = itemView.findViewById(R.id.thumbnail_image_card);
        trailTextView = itemView.findViewById(R.id.trail_text_card);
        cardView = itemView.findViewById(R.id.card_view);
    }
}

public class Newsadapter extends RecyclerView.Adapter<Newsadapter.Viewholder> {

    private Context context;
    private ArrayList<News> courseModelArrayList;
    private SharedPreferences sharedPrefs;

    // Constructor
    public Newsadapter(Context context, ArrayList<News> courseModelArrayList) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
    }

    @NonNull
    @Override
    public Newsadapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_card, parent, false);
        return new Viewholder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull Newsadapter.Viewholder holder, int position) {

        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        // to set data to textview and imageview of each card layout
        News model = courseModelArrayList.get(position);
        holder.courseNameTV.setText(model.gettitle());
        holder.courseRatingTV.setText(model.gettail_text());
        holder.courseIV.setImageResource(model.getcur_image());
        // Change the color theme of Title TextView by using the user's stored preferences
        setColorTheme(holder);

        // Change text size of TextView by using the user's stored preferences
        setTextSize(holder);
    }

    @SuppressLint("ResourceAsColor")
    private void setColorTheme(Viewholder holder) {

        // Get the color theme string from SharedPreferences and check for the value associated with the key
        String colorTheme = sharedPrefs.getString(
                context.getString(R.string.settings_color_key),
                context.getString(R.string.settings_color_default));

        // Change the background color of titleTextView by using the user's stored preferences
        if (colorTheme.equals(context.getString(R.string.settings_color_white_value))) {
            holder.courseNameTV.setBackgroundResource(R.color.white);
            holder.courseNameTV.setTextColor(R.color.purple_700);
        }else if (colorTheme.equals(context.getString(R.string.settings_color_sky_blue_value))) {
            holder.courseNameTV.setBackgroundResource(R.color.nav_bar_start);
            holder.courseNameTV.setTextColor(Color.WHITE);
        } else if (colorTheme.equals(context.getString(R.string.settings_color_dark_blue_value))) {
            holder.courseNameTV.setBackgroundResource(R.color.color_app_bar_text);
            holder.courseNameTV.setTextColor(Color.WHITE);
        } else if (colorTheme.equals(context.getString(R.string.settings_color_violet_value))) {
            holder.courseNameTV.setBackgroundResource(R.color.violet);
            holder.courseNameTV.setTextColor(Color.WHITE);
        } else if (colorTheme.equals(context.getString(R.string.settings_color_light_green_value))) {
            holder.courseNameTV.setBackgroundResource(R.color.light_green);
            holder.courseNameTV.setTextColor(Color.WHITE);
        } else if (colorTheme.equals(context.getString(R.string.settings_color_green_value))) {
            holder.courseNameTV.setBackgroundResource(R.color.color_section);
            holder.courseNameTV.setTextColor(Color.WHITE);
        }
    }

    private void setTextSize(Viewholder holder) {
        // Get the text size string from SharedPreferences and check for the value associated with the key
        String textSize = sharedPrefs.getString(
                context.getString(R.string.settings_text_size_key),
                context.getString(R.string.settings_text_size_default));

        // Change text size of TextView by using the user's stored preferences
        if(textSize.equals(context.getString(R.string.settings_text_size_medium_value))) {
            holder.courseNameTV.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    context.getResources().getDimension(R.dimen.sp22));
            holder.courseRatingTV.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    context.getResources().getDimension(R.dimen.sp16));
        } else if(textSize.equals(context.getString(R.string.settings_text_size_small_value))) {
            holder.courseNameTV.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    context.getResources().getDimension(R.dimen.sp20));
            holder.courseRatingTV.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    context.getResources().getDimension(R.dimen.sp14));
        } else if(textSize.equals(context.getString(R.string.settings_text_size_large_value))) {
            holder.courseNameTV.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    context.getResources().getDimension(R.dimen.sp24));
            holder.courseRatingTV.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    context.getResources().getDimension(R.dimen.sp18));
        }
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
            courseNameTV = itemView.findViewById(R.id.title_card);
            courseRatingTV = itemView.findViewById(R.id.trail_text_card);
            courseIV = itemView.findViewById(R.id.thumbnail_image_card);
        }
    }
}
