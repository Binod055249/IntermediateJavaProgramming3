package com.example.intermediatejavaprogramming3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SportMultiDimensionalArray extends AppCompatActivity {

    TextView txtGameName,txtGameScores,txtGameLowestScore,txtGameHighestScore,txtGameAverageScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_multi_dimensional_array);

        txtGameName=findViewById(R.id.txtGameName);
        txtGameScores=findViewById(R.id.txtGameScores);
        txtGameHighestScore=findViewById(R.id.txtGameHighestScore);
        txtGameLowestScore=findViewById(R.id.txtGameLowestScore);
        txtGameAverageScore=findViewById(R.id.txtGameAverageScore);


        int [][] gameScoreArray={{45,67,34},{23,56,49},{23,69,88},{17,28,84},{38,54,75},{51,34,71},{15,83,46},
                {36,47,15},{83,94,34},{17,37,0}};

        Game myGame=new Game("God Of War",gameScoreArray);
        txtGameName.setText(myGame.getGameName());
        myGame.letsOutputTheScoresToTheScreen(txtGameScores);
        txtGameHighestScore.setText(myGame.getTheMaximum()+"");
        txtGameLowestScore.setText(myGame.getMinimumScore()+"");

        String oldTxtGameAverageValueOfScores;

        for(int gameIndex=0;gameIndex<gameScoreArray.length;gameIndex++){

            oldTxtGameAverageValueOfScores=txtGameAverageScore.getText().toString()+(gameIndex+1)+" - ";

            double averageValue=myGame.getTheAverageValueOfScores(gameScoreArray[gameIndex]);
            txtGameAverageScore.setText(oldTxtGameAverageValueOfScores+averageValue+"\n ");
        }
    }
}