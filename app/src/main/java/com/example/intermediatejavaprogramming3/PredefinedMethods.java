package com.example.intermediatejavaprogramming3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PredefinedMethods extends AppCompatActivity {

    private TextView txtArrayDoubleValues,txtArrayIntegerNumbers,txtIntArray1Copy,txtLocarionArrayElement,txtIntArray1;
    private Switch swtEqual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predefined_methods);

        txtArrayDoubleValues=findViewById(R.id.txtArrayDoubleValues);
        txtArrayIntegerNumbers=findViewById(R.id.txtArrayIntegerNumbers);
        txtIntArray1=findViewById(R.id.txtIntArray1);
        txtIntArray1Copy=findViewById(R.id.txtIntArray1Copy);
        txtLocarionArrayElement=findViewById(R.id.txtLocationArrayElement);

        swtEqual=findViewById(R.id.swtEqual);

        double[] doubleValuesArray={6.3,1.2,3.8,2.7,9.1,4.3,56.4,34.2,90.1,12.4,54.2,79.1,10.2};

        Arrays.sort(doubleValuesArray);
        String oldTxtArrayDoubleValues;
        for(int index=0;index<doubleValuesArray.length;index++){

            oldTxtArrayDoubleValues=txtArrayDoubleValues.getText().toString();
            txtArrayDoubleValues.setText(oldTxtArrayDoubleValues+doubleValuesArray[index]+"    ");
        }

        int[] intNumbersArray=new int[20];
        Arrays.fill(intNumbersArray,1);
        outputArrayToTheScreen(intNumbersArray,txtArrayIntegerNumbers);

        int[] integerArray1={100,200,300,400,500,600,700,800,900,1000};
        int[] integerArray1Copy=new int[integerArray1.length];

        System.arraycopy(integerArray1,0,integerArray1Copy,0,integerArray1.length);
        outputArrayToTheScreen(integerArray1,txtIntArray1);
        outputArrayToTheScreen(integerArray1Copy,txtIntArray1Copy);

        boolean isEqual=Arrays.equals(integerArray1,integerArray1Copy);
        swtEqual.setChecked((isEqual ? true: false));
        swtEqual.setText((isEqual?" The Values Of These Arrays are Equal ":" not equal "));


        int arrayElement= Arrays.binarySearch(doubleValuesArray,2.7);
        if(arrayElement>=0){
            txtLocarionArrayElement.setText(String.format("we found 2.7 at element %d in DoubleValuesArray",
                    arrayElement));
        }else{
            txtLocarionArrayElement.setText("couldn't find the value in that element");
        }

    }

    public void outputArrayToTheScreen(int[] array,TextView textView){
        String oldTxtViewValue;
        for(int number:array){
            oldTxtViewValue=textView.getText().toString();
            textView.setText(oldTxtViewValue+number+"    ");
        }
    }
}