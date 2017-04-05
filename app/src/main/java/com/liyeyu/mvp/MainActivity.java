package com.liyeyu.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ashokvarma.bottomnavigation.BadgeItem;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationBar mBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBar = (BottomNavigationBar) findViewById(R.id.bnb_tab);
        mBar.setMode(BottomNavigationBar.MODE_FIXED);
        mBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);

        BadgeItem badgeItem = new BadgeItem()
                .setBorderWidth(1)
                .setText("5")
                .setBorderColor(R.color.colorAccent)
                .setHideOnSelect(true);

        mBar.addItem(new BottomNavigationItem(R.mipmap.ic_home_white_24dp, "Home")
                .setActiveColorResource(R.color.orange).setBadgeItem(badgeItem))
                .addItem(new BottomNavigationItem(R.mipmap.ic_book_white_24dp, "Books").setActiveColorResource(R.color.orange))
                .addItem(new BottomNavigationItem(R.mipmap.ic_music_note_white_24dp, "Music").setActiveColorResource(R.color.orange))
                .addItem(new BottomNavigationItem(R.mipmap.ic_tv_white_24dp, "Movies & TV").setActiveColorResource(R.color.orange))
                .addItem(new BottomNavigationItem(R.mipmap.ic_videogame_asset_white_24dp, "Games").setActiveColorResource(R.color.orange))
                .setFirstSelectedPosition(0)
                .initialise();
        mBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int i) {
            }

            @Override
            public void onTabUnselected(int i) {
            }

            @Override
            public void onTabReselected(int i) {
            }
        });
    }
}
