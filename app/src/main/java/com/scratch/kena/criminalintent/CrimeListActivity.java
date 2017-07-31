package com.scratch.kena.criminalintent;
import android.support.v4.app.Fragment;
/*
 * Created by kena on 7/31/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
