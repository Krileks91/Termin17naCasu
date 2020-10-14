package com.example.termin17nacasu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MasterFragment.OnNameClickListener {

    private boolean landscape = false;
    private DetailsFragment detailsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showList();
        if (findViewById(R.id.flDetail) != null){
            landscape = true;
            detailsFragment = new DetailsFragment();
            detailsFragment.setId(0);
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flDetail,detailsFragment)
                    .commit();
        }
    }
        //metoda koja ce prikazati listu svih imena
        private void showList(){
            MasterFragment masterFragment = new MasterFragment();
            //extends AppCompatActivity
            //Mora se proslediti klasa instance masterFragment
            //Kada se stavi extend Activity
            //mora da se import android.app.fragment u MasterFragmetn.class
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFrame, masterFragment)
                    .addToBackStack(null)
                    .commit();
        }

        private void showName(int id) {
            if (landscape) {
            detailsFragment.updateId(id);
            } else {
                DetailsFragment fragment = new DetailsFragment();
                fragment.setId(id);
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFrame, fragment)
                        //.addToBackStack(null) zakomentarisano je da na back dugme ide unaza i izadje iz app
                        .commit();
            }
        }
    @Override
    public void OnNameClicked(int id) {
        showName(id);
    }
}
