package com.example.intermediatejavaprogramming3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ArrayAsArguments extends AppCompatActivity {

    private TextView txtArrayValues,txtAverageValues;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_as_arguments);

        txtArrayValues=findViewById(R.id.txtArrayListValues);
        txtAverageValues=findViewById(R.id.txtAverageValue);
        String oldTxtArrayValues;

        int[] intArray={2,4,54,6,7,43,23,75,7,8,4,22,89};

        for(int index=0;index<intArray.length;index++){
            oldTxtArrayValues=txtArrayValues.getText().toString();
            txtArrayValues.setText(oldTxtArrayValues+intArray[index]+"     ");
        }

         //txtAverageValues.setText(getTheAverageValue(intArray)+"");
        txtAverageValues.setText(getTheAverageValue(4,5,7)+"");
    }

    public int getTheAverageValue(int... numbers){

        int totalValue=0;
        for(int value:numbers){
            totalValue+=value;
        }
        return totalValue/numbers.length;
    }
}