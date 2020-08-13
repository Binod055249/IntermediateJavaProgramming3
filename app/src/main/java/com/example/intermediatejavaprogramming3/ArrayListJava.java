package com.example.intermediatejavaprogramming3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ArrayListJava extends AppCompatActivity {

    private TextView txtInitialCapacity,txtArrayListValues,txtArrayListCapacityAfterAddingValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list_java);

        txtArrayListCapacityAfterAddingValues=findViewById(R.id.txtArrayListCapacityAfterAddingValues);
        txtInitialCapacity=findViewById(R.id.txtInitialCapacity);
        txtArrayListValues=findViewById(R.id.txtArrayListValues);

        ArrayList<String> animals=new ArrayList<String>();
        txtInitialCapacity.setText(animals.size()+"");

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Panther");
        animals.add("Cat");
        animals.add("Bear");
        animals.add("Bird");
        animals.add("Fox");
        animals.add("Dog");

        String oldTxtArrayListValues;
     /*  // for(String animal:animals)
         for(int index=0;index<animals.size();index++){

            oldTxtArrayListValues=txtArrayListValues.getText().toString();
            txtArrayListValues.setText(oldTxtArrayListValues+animals.get(index)+"    ");
        }*/

         txtArrayListCapacityAfterAddingValues.setText(animals.size()+" ");

         animals.add("Crow");
          txtArrayListCapacityAfterAddingValues.setText(animals.size()+"");
         //outputTheArrayListValuesToTheScreenByUsingEnhanceForLoops(animals,txtArrayListValues);

         animals.add(0,"wolf");
//         outputTheArrayListValuesToTheScreenByUsingEnhanceForLoops(animals,txtArrayListValues);

        // animals.remove(2);
         outputTheArrayListValuesToTheScreenByUsingEnhanceForLoops(animals,txtArrayListValues);

         if(animals.contains("Tiger")){
             txtArrayListValues.setText("Tiger Does Exist");
         }
         else{
             txtArrayListValues.setText("tiger Does not exist" );
         }
    }

    public void outputTheArrayListValuesToTheScreenByUsingEnhanceForLoops(ArrayList<String> values,
                                                                          TextView textView){

        String oldTextViewValue;
        for(String value:values) {

            oldTextViewValue=textView.getText().toString();
            textView.setText(oldTextViewValue+value+"     ");
          }
        }
}