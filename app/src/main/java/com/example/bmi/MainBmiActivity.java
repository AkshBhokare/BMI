package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainBmiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bmi);

      TextView BMI,Result = null;
      EditText Weight, HeightFT,HeightIN;
      Button BtnCal;

      Weight = findViewById(R.id.Weight);
      HeightFT=findViewById(R.id.HeightFT);
      HeightIN=findViewById(R.id.HeightIN);
      BtnCal =findViewById(R.id.BtnCal);
      Result =findViewById(R.id.Result);

        TextView finalResult = Result;
        BtnCal.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
             int wt= Integer.parseInt( Weight.getText().toString());
             int htft= Integer.parseInt(HeightFT.getText().toString());
             int htin= Integer.parseInt(HeightIN.getText().toString());

             int TotalIN = htft*12 + htin;
             double TotalCM = TotalIN*2.53 ;
             double TotalM =TotalCM/100;
             double bmi = wt/(TotalM*TotalM);

             if (bmi>25){
                 finalResult.setText("You Are Overwaight");
             } else if (bmi<18) {
                 finalResult.setText("Your are Underwaight");
             }else {
                 finalResult.setText("You are Healthy!");
             }
          }
      });






    }
}