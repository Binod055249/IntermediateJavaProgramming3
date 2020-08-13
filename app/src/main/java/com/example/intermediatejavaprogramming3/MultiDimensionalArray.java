package com.example.intermediatejavaprogramming3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MultiDimensionalArray extends AppCompatActivity {

    private TextView txtArray1,txtArray2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_dimensional_array);

        txtArray1=findViewById(R.id.txtArray1);
        txtArray2=findViewById(R.id.txtArray2);

        int[][] intArray1={{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15},{16,17,18},{19,20,21},{22,23,24}};

         int[][] intArray2={{101,102,103},{104,105,106},{107,108,109},{110,111,112},{113,14,15},{116,117,118},{119,120,121},{122,123,124}};

           letsOutputTheArrayToTheScreen(intArray1,txtArray1);
           letsOutputTheArrayToTheScreen(intArray2,txtArray2);
    }


    public void letsOutputTheArrayToTheScreen(int[][] intArray, TextView textView){

        String oldColumnsValue;

        for(int row=0;row<intArray.length;row++){

            for(int column=0;column<intArray[row].length;column++){

                oldColumnsValue=textView.getText().toString();
                textView.setText(oldColumnsValue+intArray[row][column]+" - ");
            }
        }
    }
}