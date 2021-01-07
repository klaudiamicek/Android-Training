package com.example.recyclerviewfragmentschallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CarAdapter.ItemClicked{

    //for auto-complete functionality, added text component
    Button btnCarInfo, btnOwnerInfo;
    ImageView ivMake;
    TextView tvModel, tvName, tvTel;
    FragmentManager fragmentManager;
    Fragment buttonFrag, listFrag, carInfoFrag, ownerInfoFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finds View objects given ID number
        btnCarInfo = findViewById(R.id.btnCarInfo);
        btnOwnerInfo = findViewById(R.id. btnOwnerInfo);
        ivMake = findViewById(R.id.ivMake);
        tvModel = findViewById(R.id.tvModel);
        tvName = findViewById(R.id.tvName);
        tvTel = findViewById(R.id. tvTel);

        fragmentManager = getSupportFragmentManager();

        //finds each fragment by id
        listFrag = fragmentManager.findFragmentById(R.id.listFrag);
        buttonFrag = fragmentManager.findFragmentById(R.id.buttonFrag);
        carInfoFrag = fragmentManager.findFragmentById(R.id.carInfoFrag);
        ownerInfoFrag = fragmentManager.findFragmentById(R.id. ownerInfoFrag);

        //begins transaction and shows all fragments except owner info
        fragmentManager.beginTransaction()
                .show(buttonFrag)
                .show(listFrag)
                .show(carInfoFrag)
                .hide(ownerInfoFrag)
                .commit();

        //create owner info button component
        btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //begins transaction and shows owner info fragment, hides car info fragment
                fragmentManager.beginTransaction()
                        .hide(carInfoFrag)
                        .show(ownerInfoFrag)
                        .commit();
            }
        });

        //create car info button component
        btnCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //begins transaction and shows car info fragment, hides owner info fragment
                fragmentManager.beginTransaction()
                        .show(carInfoFrag)
                        .hide(ownerInfoFrag)
                        .commit();
            }
        });
    }

    @Override
    public void onItemClicked(int index) {

        //displays name, mode, owner tel. on click
        tvName.setText(ApplicationClass.cars.get(index).getOwnerName());
        tvModel.setText(ApplicationClass.cars.get(index).getModel());
        tvTel.setText(ApplicationClass.cars.get(index).getOwnerTel());

        //displays car logo based on model
        if (ApplicationClass.cars.get(index).getMake().equals("Volkswagen")){
            ivMake.setImageResource(R.drawable._80b585b2edbce24c47b2cf2);
        }
        else if (ApplicationClass.cars.get(index).getMake().equals("Nissan")){
           ivMake.setImageResource(R.drawable._80b57fcd9996e24bc43c497);
        }
        else {
            ivMake.setImageResource(R.drawable._604593_middle);
        }

    }
}
