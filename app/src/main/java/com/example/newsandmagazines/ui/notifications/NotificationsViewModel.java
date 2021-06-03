package com.example.newsandmagazines.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Mobile application for NEWS and Magazines aggregation is an online platform that collects and displays news stories and other information as that information is published and organizes the information in a specific manner. News aggregator plays a very important role in reducing time consumption, as all of the news that would be explored through more than one website will be placed only in a single location. Also, summarizing this aggregated content absolutely will save reader’s time. This app collects daily news and weekly magazines and group them together using a user-friendly interface and the graphical user interface of such applications. Primarily group the data from the url's by using Application programming Interface(API) and retrieve data to display or populate the data in the user interface(UI) with the help of java.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}