package com.wipro.eb.service;

import com.wipro.eb.entity.*;
import com.wipro.eb.exception.*;
//import com.wipro.eb.exception.InvalidReadingException;

public class ConnectionService {
	public boolean validate(int	currentReading, int previousReading,String type) throws InvalidReadingException,InvalidConnectionException
	{
		if(currentReading<previousReading||(currentReading<0||previousReading<0)) throw new InvalidReadingException();
		if(!(type.equals("Domestic"))&&!(type.equals("Commercial"))) throw new InvalidConnectionException();
		return true;
	}
	
	public float calculateBillAmt(int currentReading, int previousReading,String type)
	{
		float result=0;
		try 
		{
			if(validate(currentReading ,previousReading, type))
			{
					if(type.equals("Domestic"))
					{
						float a[]= {2.3f,4.2f,5.5f};
						Domestic d=new Domestic(currentReading ,previousReading, a);
						result=d.computeBill();
					}
					if(type.equals("Commercial"))
					{
						float a[]= {5.2f,6.8f,8.3f};
						Commercial c=new Commercial(currentReading ,previousReading, a);
						result=c.computeBill();
					}
			}
		}
		catch(InvalidReadingException e)
		{
			return -1;
		}
		catch(InvalidConnectionException e)
		{
			return -2;
		}
		return result;
	}
	public String generateBill(int currentReading, int previousReading,String type)
	{
		float a=calculateBillAmt(currentReading ,previousReading, type);
		if(a==-1)return "Incorrect Reading";
		if(a==-2)return "Invalid ConnectionType";
		return "Amount to be paid:"+a;
	}
}
