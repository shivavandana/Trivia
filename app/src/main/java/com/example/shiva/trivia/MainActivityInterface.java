package com.example.shiva.trivia;

import android.app.ProgressDialog;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;


/**
 * Created by shiva on 21-09-2016.
 */
public interface MainActivityInterface {

     ProgressBar getProgressBar();

     void setQuestions(List<Question> questions);

     Button getStartButton();

     ImageView getAppImage();

     TextView getReadyLabel();
}
