package com.sunbeam.myexception.NegativeDiameterException;

class NegativeDiameterException extends Exception {
    public NegativeDiameterException() {
        super("Negative diameter is not allowed");
    }
}

public class Circlenew  extends Exception{
	private double myX;
	private double myY;
	private double myDiameter;
	
	public Circlenew()
	{
		myX= 0;
		myY=0;
		myDiameter = 100;
	}
	public Circlenew(double myX, double myY, double myDiameter) throws
	NegativeDiameterException
	{
		if(myDiameter < 0)
		{
			throw new NegativeDiameterException();
			
		}
		this.myX = myX;
		this.myY=myY;
		this.myDiameter=myDiameter;
	}
	
	public double getmyX()
	{
		return myX;
	}
	public void setmyX(double myX)
	{
		this.myX=myX;
	}
	public double getMyY() {
		return myY;
	    }

	    public void setMyY(double myY) {
		this.myY = myY;
	    }

	    public double getMyDiameter() {
		return myDiameter;
	    }

	    public void setMyDiameter(double myDiameter) throws NegativeDiameterException {
		if (myDiameter < 0)
		    throw new NegativeDiameterException();
		this.myDiameter = myDiameter;
	    }
	    public void displayData()
	    {
	    	System.out.println("myX: " +myX);
	    	System.out.println("myX: " +myY);
	    	System.out.println("myX: " +myDiameter);
	    	System.out.println("-------------------------");
	    }


	
}
