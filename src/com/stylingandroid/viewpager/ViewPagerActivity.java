package com.stylingandroid.viewpager;

import com.jakewharton.android.viewpagerindicator.TitlePageIndicator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class ViewPagerActivity extends Activity
{
	@Override
	public void onCreate( Bundle savedInstanceState )
	{
	    super.onCreate( savedInstanceState );
	    setContentView( R.layout.main );
	 
	    ViewPagerAdapter adapter = new ViewPagerAdapter( this );
	    ViewPager pager =
	        (ViewPager)findViewById( R.id.viewpager );
	    TitlePageIndicator indicator =
	        (TitlePageIndicator)findViewById( R.id.indicator );
	    pager.setAdapter( adapter );
	    indicator.setViewPager( pager );
	}
}