package com.example.lab3milestone2;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the reference of buttons
        firstFragment = findViewById(R.id.firstFragment);
        secondFragment = findViewById(R.id.secondFragment);

        // perform setOnClickListener event on first button
        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // load first fragment
                loadFragment(new FirstFragment());
            }
        });

        // perform setOnClickListener event on Second Button
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // load second fragment
                loadFragment(new SecondFragment());
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        // create a fragment manager
        FragmentManager fm = getFragmentManager();
        // create a fragment transaction to begin the transaction and replace the fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        // replace the frame layout with new fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}
