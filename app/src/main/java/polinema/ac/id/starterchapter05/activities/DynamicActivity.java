package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.BlueFragment;
import polinema.ac.id.starterchapter05.fragments.RedFragment;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);

    }

    public void handleClickLoadBlueFragment(View view) {

        /*FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment());
        fragmentTransaction.commit();*/
        /*getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                .replace(R.id.dynamic_fragment_placeholder,new BlueFragment(),"Blue Fragment")
                .addToBackStack(null).commit();*/

        BlueFragment blueFragment = (BlueFragment) getSupportFragmentManager().findFragmentByTag("BLUE_FRAGMENT");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if(blueFragment != null && blueFragment.isVisible()){
//            fragmentTransaction.commit();
        }
        else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.enter_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment(),"BLUE_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }

    public void handlerClickLoadRedFragment(View view) {
        /*FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        //fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment(),"Red Fragment");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();*/

        RedFragment redFragment = (RedFragment) getSupportFragmentManager().findFragmentByTag("RED_FRAGMENT");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if(redFragment != null && redFragment.isVisible()){
//            fragmentTransaction.commit();
        }
        else{
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right,R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment(),"RED_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
