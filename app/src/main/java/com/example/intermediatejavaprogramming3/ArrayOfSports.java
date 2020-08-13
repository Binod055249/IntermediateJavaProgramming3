package com.example.intermediatejavaprogramming3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ArrayOfSports extends AppCompatActivity {

    private TextView txtSportName,txtScores,txtScoresAverage,txtHighestScore,txtLowestScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_of_sports);

        txtSportName=findViewById(R.id.txtSportName);
        txtScores=findViewById(R.id.txtScores);
        txtScoresAverage=findViewById(R.id.txtScoresAverage);
        txtHighestScore=findViewById(R.id.txtHighestScore);
        txtLowestScore=findViewById(R.id.txtLowestScore);

        int[] scoresArray={87,34,56,23,65,98,35,21,48,56,45,86,37};

        Sport mySport=new Sport("Boxing",scoresArray);
        txtSportName.setText(mySport.getSportName());
        mySport.letsOutputTheScore(txtScores);
        txtScoresAverage.setText(mySport.getTheAverageValue()+"");
        txtHighestScore.setText(mySport.getTheMaximum()+"");
        txtLowestScore.setText(mySport.getTheMininmumValue()+"");
    }
}