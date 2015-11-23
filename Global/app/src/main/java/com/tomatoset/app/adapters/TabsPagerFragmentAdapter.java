package com.tomatoset.app.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tomatoset.app.fragments.MapFragment;
import com.tomatoset.app.fragments.MenuFragment;
import com.tomatoset.app.fragments.PaymentFragment;


public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Карта",
                "Меню",
                "Оплата"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return MapFragment.getInstance();
            case 1:
                return MenuFragment.getInstance();
            case 2:
                return PaymentFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
