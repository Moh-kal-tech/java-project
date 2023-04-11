package com.wipro.eb.entity;

public class Domestic extends Connection{

	public Domestic(int currentReading, int previousReading, float[] slabs) {
		super(currentReading, previousReading, slabs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float computeBill() {
		// TODO Auto-generated method stub
		int m=currentReading-previousReading;
		float n=0;
		int i=0;
		float a=0;
		while(i<2)
		{
			if(m<50)break;
				a+=(slabs[i]*50);
				i++;
				m-=50;
		}
		return a+=(slabs[i]*m);
	}

}
