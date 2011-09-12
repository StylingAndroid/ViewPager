package com.stylingandroid.viewpager;


import android.os.Parcel;
import android.os.Parcelable;

public class ScrollState implements Parcelable
{
	private int[] scrollPos;
	
	public static Parcelable.Creator<ScrollState> CREATOR = new Parcelable.Creator<ScrollState>()
	{

		@Override
		public ScrollState createFromParcel( Parcel source )
		{
			int size = source.readInt();
			int[] scrollPos = new int[ size ];
			source.readIntArray( scrollPos );
			return new ScrollState( scrollPos );
		}

		@Override
		public ScrollState[] newArray( int size )
		{
			return new ScrollState[ size ];
		}
	};
	public ScrollState( int[] scrollPos )
	{
		this.scrollPos = scrollPos;
	}

	@Override
	public int describeContents()
	{
		return 0;
	}

	@Override
	public void writeToParcel( Parcel dest, int flags )
	{
		dest.writeInt( scrollPos.length );
		dest.writeIntArray( scrollPos );
	}

	public int[] getScrollPos()
	{
		return scrollPos;
	}
}
