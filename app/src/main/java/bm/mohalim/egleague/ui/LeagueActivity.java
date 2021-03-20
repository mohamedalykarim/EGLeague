package bm.mohalim.egleague.ui;

import android.databinding.DataBindingUtil;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import bm.mohalim.egleague.R;
import bm.mohalim.egleague.databinding.ActivityLeagueBinding;
import bm.mohalim.egleague.ui.adapter.MainPagerAdapter;

public class LeagueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLeagueBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_league);

        ViewPager viewPager = binding.vpPager;
        MainPagerAdapter mainPagerAdapter = new MainPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(mainPagerAdapter);

    }
}
