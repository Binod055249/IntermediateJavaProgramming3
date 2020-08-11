package com.example.intermediatejavaprogramming3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EnhancedForLoop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enhanced_for_loop);

        TextView txtCountryNames=findViewById(R.id.txtCountryNames);

        String[] countryNames={"Afghanistan\n", "Albania\n", "Algeria\n","Andorra\n","Angola\n","Antigua\n",
                "Argentina\n","Armenia\n","Australia\n","Austria\n","Austrian Empire\n","Azerbaijan\n"," Baden\n",
                "Bahamas\n","Barbuda\n","Bahrain\n","Bangladesh\n","Barbados\n","Belarus\n","Belgium\n","Belize\n",
                "Bolivia\n",
                "Cambodia\n","Cameroon\n","Canada\n","Central American Federation\n",
                " Chad\n","Chile\n","China\n","Colombia\n","Cuba\n","Cyprus\n",
                "Denmark\n","Dominican Republic\n","Duchy of Parma\n","Egypt\n","Eswatini\n","Ethiopia\n"};

        String allCountryName="";

        for(String countryName:countryNames){

            allCountryName=allCountryName+countryName;
        }
        txtCountryNames.setText(allCountryName);

    }
}