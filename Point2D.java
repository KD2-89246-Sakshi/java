package com.app.geometry;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D(double x, double y)
	{
		this .x=x;
		this.y=y;
	}
	
	public String getDetails()
	{
		return "("+x +", "+y+")";
	}
	
	//method to check of two points are equal
	public boolean isEqual(Point2D otherPoint)
	{
		return this.x == otherPoint.x && this.y==otherPoint.y;
	}
	
	//method to calculate distance formula
	public double calculateDistance(Point2D otherPoint)
	{
		return Math.sqrt(Math.pow(this.x-otherPoint.x,2) + Math.pow(this.y-otherPoint.y,2));
	}
}


	
