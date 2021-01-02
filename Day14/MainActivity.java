package com.example.magicidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //for auto-complete functionality, added text component
    EditText etID;
    Button btnSubmit;
    TextView tvResults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finds View objects given ID number
        etID = findViewById(R.id.etID);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResults = findViewById(R.id.tvResults);

        //to not see TextView text
        tvResults.setVisibility(View.GONE);

        //button component
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //trim method takes away leading and trailing whitespace
                String idNumber = etID.getText().toString().trim();

                //string to extract date of birth(only want first 6 characters)
                String dob = idNumber.substring(0,6);

                //next ID number based on gender (at index 6), convert to string then integer
                int gender = Integer.parseInt(Character.toString(idNumber.charAt(6)));

                String sGender;

                if (gender < 5)
                    sGender = getString(R.string.female);
                else
                    sGender = getString(R.string.male);

                //next ID number based on nationality (at index 10), convert to string then integer
                int nationality = Integer.parseInt(Character.toString(idNumber.charAt(10)));

                String sNationality;

                if (nationality ==0)
                    sNationality = getString(R.string.sacitizen);
                else
                    sNationality = getString(R.string.permanent);

                String text =getString(R.string.dob) + dob + "\n" +
                        getString(R.string.gender) + sGender + "\n" +
                        getString(R.string.nationality) + sNationality;

                //shows data
                tvResults.setText(text);
                tvResults.setVisibility(View.VISIBLE);
            }


        });




    }
}
