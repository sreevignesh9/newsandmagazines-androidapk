package com.example.newsandmagazines.ui.dashboard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsandmagazines.R;
import com.example.newsandmagazines.ui.dashboard.Dashboardadapter;
import java.util.ArrayList;

public class DashboardFragment extends Fragment {


    RecyclerView courseRV;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    // Arraylist for storing data
    ArrayList<Magazine> courseModelArrayList;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        return root;
    }
    @Override
    public void onViewCreated (View view, Bundle savedInstanceState) {
        Context context=getActivity();
        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new Magazine("Reimagining capitalism",  R.drawable.ma1));
        courseModelArrayList.add(new Magazine("SuperStar",  R.drawable.ma2));
        courseModelArrayList.add(new Magazine("Success",  R.drawable.ma));
        courseModelArrayList.add(new Magazine("Entrepreneur",  R.drawable.ma4));
        courseModelArrayList.add(new Magazine("Person of the year",  R.drawable.ma5));
        courseModelArrayList.add(new Magazine("Men's Fashion",  R.drawable.ma6));
        courseModelArrayList.add(new Magazine("Brown Book",  R.drawable.ma7));
        courseModelArrayList.add(new Magazine("Empire",  R.drawable.ma8));
        courseModelArrayList.add(new Magazine("Elon Musk",  R.drawable.ma9));
        courseModelArrayList.add(new Magazine("The Cricketer",  R.drawable.ma10));

        courseRV = getView().findViewById(R.id.magazineview);
        layoutManager = new LinearLayoutManager(context);
        courseRV.setLayoutManager(layoutManager);
        courseRV.setHasFixedSize(true);
        adapter=new Dashboardadapter(context, courseModelArrayList);
        courseRV.setAdapter(adapter);

    }
}