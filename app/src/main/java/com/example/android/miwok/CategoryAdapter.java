package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mikem on 2/24/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    //integer to count number of tabs
    int tabCount;

    private String tabTitles[] = new String[] { "Numbers", "Family", "Colors", "Phrases" };

    public CategoryAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }


    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                NumbersFragment numbersFragment = new NumbersFragment();
                return numbersFragment;
            case 1:
                FamilyFragment familyFragment = new FamilyFragment();
                return familyFragment;
            case 2:
                ColorsFragment colorsFragment = new ColorsFragment();
                return colorsFragment;
            case 3:
                PhrasesFragment phrasesFragment = new PhrasesFragment();
                return phrasesFragment;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
