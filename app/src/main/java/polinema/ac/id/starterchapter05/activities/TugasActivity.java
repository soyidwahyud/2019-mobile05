package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandsFragment;
import polinema.ac.id.starterchapter05.fragments.PushupFragment;

public class TugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
    }

    public void pushupFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        PushupFragment pushupFragment = (PushupFragment) getSupportFragmentManager().findFragmentByTag("Pushup_FRAGMENT");
        if (pushupFragment != null && pushupFragment.isVisible()) {
//            fragmentTransaction.commit();
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right,R.anim.exit_from_right,R.anim.enter_from_right);
            fragmentTransaction.replace(R.id.tugas_fragment_placeholder, new PushupFragment(), "Pushup_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void dipsFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        DipsFragment dipsFragment = (DipsFragment) getSupportFragmentManager().findFragmentByTag("DIPS_FRAGMENT");
        if (dipsFragment != null && dipsFragment.isVisible()) {
//            fragmentTransaction.commit();
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right,R.anim.exit_from_right,R.anim.enter_from_right);
            fragmentTransaction.replace(R.id.tugas_fragment_placeholder, new DipsFragment(), "DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handstandsFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        HandstandsFragment handstandsFragment = (HandstandsFragment) getSupportFragmentManager().findFragmentByTag("Handstands_FRAGMENT");
        if (handstandsFragment != null && handstandsFragment.isVisible()) {
//            fragmentTransaction.commit();
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right,R.anim.exit_from_right,R.anim.enter_from_right);
            fragmentTransaction.replace(R.id.tugas_fragment_placeholder, new HandstandsFragment(), "Handstands_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
