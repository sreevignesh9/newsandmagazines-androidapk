package com.example.newsandmagazines.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsandmagazines.MainActivity;
import com.example.newsandmagazines.R;
import com.example.newsandmagazines.ui.home.News;
import com.example.newsandmagazines.ui.home.Newsadapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    RecyclerView courseRV;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    // Arraylist for storing data
    ArrayList<News> courseModelArrayList;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }
    @Override
    public void onViewCreated (View view, Bundle savedInstanceState) {
        Context context=getActivity();
        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new News("Why Chinese rocket's crash should alert us to the problem of space junk", "The crash of a 22-tonne, 33-metre Chinese rocket last weekend highlighted, once again, the problem of space junk. The Long March 5B Rocket splashed down safely into the sea near the Maldives.But this sort of incident will keep happening and each one poses some risks. There are literally millions of bits and pieces of defunct satellites and rockets floating in orbit around the Earth.", R.drawable.rocket));
        courseModelArrayList.add(new News("Elon Musk Sends Bitcoin Tumbling With Stunning U-Turn On Payments", "In a post on Twitter Wednesday, Elon Musk cited concerns about \"rapidly increasing use of fossil fuels for Bitcoin mining and transactions,\" while signaling that Tesla might accept other cryptocurrencies if they are much less energy intensive.", R.drawable.elonmusk));
        courseModelArrayList.add(new News("What Happens When You Mix 2 Vaccine Shots? A Study Has Found This", "Researchers and public health officials are examining strategies such as blending two different shots as many low- and middle-income nations try to figure out how to cope with vaccine scarcity.", R.drawable.vaccine));
        courseModelArrayList.add(new News("Government to buy 1.5 lakh units of DRDO O2 system for Rs 322 crore", "New Delhi: The government on Wednesday approved the procurement of 1,50,000 units of the Oxycare system developed by the Defence Research and Development Organisation (DRDO) to help in the treatment of COVID-19 patients.", R.drawable.oxygen));
        courseModelArrayList.add(new News("Redmi Note 10S launch in India today at 12 pm", "Xiaomi Redmi Note 10S launch in India is scheduled to begin today at 12 pm. The new budget smartphone is Xiaomi’s fourth smartphone under the Note 10 series. Xiaomi had previously launched the Redmi Note 10, Note 10 Pro, and Note 10 Pro Max in India in March. Redmi Note 10S price in India is expected to be under Rs 15,000. The pricing and availability details will be announced at the Redmi Note 10S launch event.", R.drawable.redmi));
        courseModelArrayList.add(new News("Dell Precision Laptop Models, Alienware m15 R6 Gaming Laptop With Latest Intel Processors Launched", "Dell Precision 3561, Precision 5560, Precision 5760, Precision 7560, and Precision 7760 laptop models have been refreshed with the latest Intel processors. The models in the series can be fitted with either Intel's 11th Gen Core H-series CPUs or Intel Xeon W CPUs. Dell has recently updated many of its laptop models with the latest processors and better configurations and the Precision series workstation laptops have got the same treatment.", R.drawable.dell));
        courseModelArrayList.add(new News("Religious, political events among factors behind Covid-19 spike in India", "The World Health Organisation has said a recent risk assessment of the situation in India found that “resurgence and acceleration” of COVID-19 transmission in the country had several potential contributing factors, including “several religious and political mass gathering events which increased social mixing”.", R.drawable.politics));
        courseModelArrayList.add(new News("Karnataka To Suspend Vaccination For 18-44 Age Group", "Bengaluru (Karnataka): Karnataka Government will temporarily suspend the COVID-19 vaccination for the age group of 18 to 44 years from May 14, said officials.", R.drawable.banglore));
        courseModelArrayList.add(new News("Atletico Madrid see off Real Sociedad to edge closer to La Liga title", "Atletico Madrid homed in on the La Liga title with a 2-1 win over Real Sociedad at the Wanda Metropolitano on Wednesday to move four points clear at the top. Diego Simeone's side made an aggressive start and after spurning a few early chances they deservedly went ahead with a low finish from Yannick Carrasco in the 16th minute, doubling their lead in the 28th through Argentine forward Angel Correa.", R.drawable.football));
        courseModelArrayList.add(new News("Government panel suggests increasing gap between two doses of Covishield to 12-16 weeks", "New Delhi: The gap between two doses of the Covishield COVID-19 vaccine can be increased to 12-16 weeks, a government panel recommended Thursday. No changes were suggested in dosage interval for Covaxin, the second of two vaccines in use in India at this time, which remains at four to six weeks.", R.drawable.vac12));

        courseRV = getView().findViewById(R.id.idRVCourse);
        layoutManager = new LinearLayoutManager(context);
        courseRV.setLayoutManager(layoutManager);
        courseRV.setHasFixedSize(true);
        adapter=new Newsadapter(context, courseModelArrayList);
        courseRV.setAdapter(adapter);

    }
}