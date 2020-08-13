package com.example.intermediatejavaprogramming3;

import android.widget.TextView;

public class Game {

    private String gameName;
    private int[][] scores;

    public Game(String gameName,int[][] scores){
        this.gameName=gameName;
        this.scores=scores;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getMinimumScore(){

        int lowestScore=scores[0][0];
        for(int[] gameScore:scores) {
            for (int score : gameScore) {
                if (score<lowestScore){
                    lowestScore=score;
                }
            }
        }
        return lowestScore;
    }

    public int getTheMaximum(){

        int highestScore=scores[0][0];
        for(int[] gamesScore:scores){
            for(int score:gamesScore){

                if(score>highestScore){
                    highestScore=score;
                }
            }
        }
        return highestScore;
    }

    public double getTheAverageValueOfScores(int[] scores){

        int total=0;

        for(int score:scores){
            total+=score;
        }
        return (double)total/scores.length;
    }

    public void letsOutputTheScoresToTheScreen(TextView textView){

        String oldTextViewValue;

        for(int gameIndex=0;gameIndex<scores.length;gameIndex++){

            for(int gameScore:scores[gameIndex]){
                oldTextViewValue=textView.getText().toString();

                textView.setText(String.format(oldTextViewValue+"Game Number %2d:  %3d\n\n\n",
                        (gameIndex+1),gameScore));
            }
        }
    }
}
