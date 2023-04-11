package com.wipro.eb.entity;
import com.wipro.eb.exception.*;
//import com.wipro.eb.exception.I/nvalidReadingException;
abstract class Connection 
{
	int previousReading;
	int currentReading;
	float[] slabs;
	public Connection(int currentReading,int previousReading,float slabs[])
	{
		this.currentReading=currentReading;
		this.previousReading=previousReading;
		this.slabs=slabs;
	}
	public abstract float computeBill();
}
