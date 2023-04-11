package com.wipro.eb.entity;
public class Commercial extends Connection  {
	

	public Commercial(int currentReading, int previousReading, float[] slabs) {
		super(currentReading, previousReading, slabs);
		// TODO Auto-generated constructor stub
	}

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
		a+=(slabs[i]*m);
		if(a>=10000)return a+(a*0.09f);
		if(a>=5000)return a+(a*0.06f);
		return a+(a*0.02f);
	}
}
