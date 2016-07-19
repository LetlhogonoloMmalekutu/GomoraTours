package com.timotiusoktorio.tourguide.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.timotiusoktorio.tourguide.R;
import com.timotiusoktorio.tourguide.fragment.PlacesFragment;

/**
 * Created by Timotius on 2016-07-18.
 */

public class TopicsAdapter extends FragmentPagerAdapter {

    private String[] mTopics;

    public TopicsAdapter(FragmentManager fm, Context context) {
        super(fm);
        mTopics = context.getResources().getStringArray(R.array.topics);
    }

    @Override
    public Fragment getItem(int position) {
        return PlacesFragment.newInstance(mTopics[position]);
    }

    @Override
    public int getCount() {
        return mTopics.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTopics[position];
    }

}