
package com.android.streetGift.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.android.streetGift.SampleFragment_;

public class ViewPagerAdapter
    extends FragmentPagerAdapter
{

    private String[] locations;

    public ViewPagerAdapter(FragmentManager fm, String[] locations) {
        super(fm);
        this.locations = locations;
    }

    public int getCount() {
        return locations.length;
    }

    public Fragment getItem(int position) {
        Fragment fragment = new SampleFragment_();
        Bundle bundle = new Bundle();
        bundle.putString("label", locations[position]);
        fragment.setArguments(bundle);
        return fragment;
    }

}
