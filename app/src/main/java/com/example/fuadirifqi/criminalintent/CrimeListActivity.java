package com.example.fuadirifqi.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by fuadirifqi on 3/31/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){

        return new CrimeListFragment();

    }

    @Override
    protected int getLayoutResId(){
        return R.layout.activity_twopane;
    }

}
