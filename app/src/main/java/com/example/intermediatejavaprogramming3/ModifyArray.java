package com.example.intermediatejavaprogramming3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ModifyArray extends AppCompatActivity {

  TextView txtModifiedArrayElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_array);


        TextView txtOriginalValuesOfArray=findViewById(R.id.txtOriginalValuesOfArray);
        TextView txtValuesOfModifiedArray=findViewById(R.id.txtValuesOfModifiedArray);
        TextView txtOriginalArrayElement=findViewById(R.id.txtOriginalArrayElement);
         txtModifiedArrayElement=findViewById(R.id.txtModifiedArrayElement);
        TextView txtArrayElementAfterModification=findViewById(R.id.txtArrayElementAfterModification);


        String[] stringArray={"A\n","B\n","C\n","D\n","E\n","F\n","G\n","H\n","I\n","J\n","k\n","L\n",
                "M\n","N\n","O\n","P\n","Q\n","R\n","S\n","T\n", "U\n","V\n","W\n","X\n","Y\n","Z\n"};
        String totalOriginalValues="";

        for(String value:stringArray){
            totalOriginalValues+=value;
        }
        txtOriginalValuesOfArray.setText(totalOriginalValues);

        //Now we want to modify the Array
            letsModifyTheArray(stringArray);

            String totalModifiedValue="";
            for(String value:stringArray){
                totalModifiedValue+=value;
            }
            txtValuesOfModifiedArray.setText(totalModifiedValue);

            txtOriginalArrayElement.setText(stringArray[5]);

            letsModifyElement(stringArray[5]);

            txtArrayElementAfterModification.setText(stringArray[5]);


    }
    public void letsModifyTheArray(String[] array){

        for(int index=0;index<array.length;index++){

            array[index]="$"+array[index];

        }

    }

    public void letsModifyElement(String element){

        element="@#"+element;
        txtModifiedArrayElement.setText(element);
    }
}