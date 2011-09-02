package com.stylingandroid.viewpager;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.jakewharton.android.viewpagerindicator.TitleProvider;

public class ViewPagerAdapter extends PagerAdapter implements TitleProvider
{
    private static String[] titles = new String[]
    {
        "Page 1",
        "Page 2",
        "Page 3"
    };
    private final Context context;
 
    public ViewPagerAdapter( Context context )
    {
        this.context = context;
    }
 
    @Override
    public String getTitle( int position )
    {
        return titles[ position ];
    }
 
    @Override
    public int getCount()
    {
        return titles.length;
    }
 
    @Override
    public Object instantiateItem( View pager, int position )
    {
        TextView v = new TextView( context );
        v.setText( titles[ position ] );
        ((ViewPager)pager).addView( v, 0 );
        return v;
    }
 
    @Override
    public void destroyItem( View pager, int position, Object view )
    {
        ((ViewPager)pager).removeView( (TextView)view );
    }
 
    @Override
    public boolean isViewFromObject( View view, Object object )
    {
        return view.equals( object );
    }
 
    @Override
    public void finishUpdate( View view ) {}
 
    @Override
    public void restoreState( Parcelable p, ClassLoader c ) {}
 
    @Override
    public Parcelable saveState() {
        return null;
    }
 
    @Override
    public void startUpdate( View view ) {}
}
