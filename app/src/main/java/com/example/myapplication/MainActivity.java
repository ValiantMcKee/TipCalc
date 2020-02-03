package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText costBox;
    private EditText percentBox;
    private EditText totalBox;
    private RadioButton radioSingle;
    private RadioButton radioDouble;
    private TextView groupTitle;
    private EditText groupText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        costBox = findViewById(R.id.costBox);
        percentBox = findViewById(R.id.percentBox);
        totalBox =  findViewById(R.id.totalBox);
        radioSingle = findViewById(R.id.radioSingle);
        radioDouble = findViewById(R.id.radioDouble);
        groupTitle = findViewById(R.id.groupTitle);
        groupText = findViewById(R.id.groupText);

        //groupTitle.setVisibility(View.GONE);
        //groupText.setVisibility(View.GONE);





    }


    public void percentage(View v) {

        String inputCost = costBox.getText().toString();
        String inputPercentage = percentBox.getText().toString();

        double costVal = Double.parseDouble(inputCost);
        double percentVal = Double.parseDouble(inputPercentage);

        if(radioSingle.isChecked()){

            //groupTitle.setVisibility(View.GONE);
            //groupText.setVisibility(View.GONE);

            double totalVal = costVal * (percentVal/100);

            totalBox.setText(totalVal+"");

        } else if(radioDouble.isChecked()){
            //groupTitle.setVisibility(View.VISIBLE);
            //groupText.setVisibility(View.VISIBLE);

            String groupInput =groupText.getText().toString();
            double groupVal = Double.parseDouble(groupInput);

            double totalVal = (costVal * (percentVal/100)) / groupVal; // Cost is divided between group members

            totalBox.setText(totalVal+"per person");
        }

    }
}
