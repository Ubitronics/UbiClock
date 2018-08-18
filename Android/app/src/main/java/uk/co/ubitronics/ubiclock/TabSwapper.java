package uk.co.ubitronics.ubiclock;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabSwapper extends FragmentPagerAdapter {

        private Context mContext;

        public TabSwapper(Context context, FragmentManager fm) {
            super(fm);
            mContext = context;
        }

        // This determines the fragment for each tab
        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new ClockTab();
            } else if (position == 1){
                return new StopwatchTab();
            } else if (position == 2){
                return new TimerTab();
            } else {
                return null;
            }
        }

        // This determines the number of tabs
        @Override
        public int getCount() {
            return 3;
        }

        // This determines the title for each tab
        @Override
        public CharSequence getPageTitle(int position) {
            // Generate title based on item position
            switch (position) {
                case 0:
                    return mContext.getString(R.string.tab1);
                case 1:
                    return mContext.getString(R.string.tab2);
                case 2:
                    return mContext.getString(R.string.tab3);
                default:
                    return null;
            }
        }

}
