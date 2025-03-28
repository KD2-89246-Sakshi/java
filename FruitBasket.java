package com.app.fruits;
import java.util.Scanner;

abstract class Fruit
{
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;
	
	public Fruit(String name, double weight, String color)
	{
		this.name=name;
		this.weight=weight;
		this.color=color;
		this.isFresh=true;
	}
	public String getName()
	{
		return name;
	}
	public boolean isFresh()
	{
		return isFresh;
	}
	public void setFresh(boolean fresh)
	{
		isFresh = fresh;
	}
	@Override
	public String toString()
	{
		return "Fruit{name = '" + name + "', color='" + color+"' , weight=" + weight + "}";
	}
	public abstract String taste();
}

class Apple extends Fruit
{
	public Apple(String name, double weight, String color)
	{
		super(name, weight, color);
	}
	@Override
	public String taste()
	{
		return "Sweet and sour";
	}
}

class Mango extends Fruit
{
	public Mango(String name, double weight, String color)
	{
		super(name, weight, color);
	}
	@Override
	public String taste()
	{
		return "Sweet";
	}
}

class Orange extends Fruit
{
	public Orange(String name, double weight, String color)
	{
		super(name, weight, color);
	}
	@Override
	public String taste()
	{
		return "Sour";
	}
}



public class FruitBasket {

	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.println("Enter basket size:");
	   int size = sc.nextInt();
	   Fruit[]basket = new Fruit[size];
	   int counter = 0;
	   
	   while(true)
	   {
		   System.out.println(">>>Menu<<<<");
		   System.out.println("0.Exit");
		   System.out.println("1.Add mango");
		   System.out.println("2.Add Orange");
		   System.out.println("3.Add Apple");
		   System.out.println("4.Display all fruits names");
		   System.out.println("5.Display all fresh fruits with details");
		   System.out.println("6.Mark a fruit as stale");
		   System.out.println("7.mark all sour fruits as stale");
		   System.out.print("Choose an option");
		   int choice = sc.nextInt();
		   
		   switch (choice)
		   {
		   case 0: 
			   System.out.println("Exiting...");
			  return;
			  
		   case 1 :
			   if(counter < size)
			   {
				   System.out.println("Enter weight:");
				   double weight = sc.nextDouble();
				   System.out.println("Enter color:");
				   String color = sc.next();
				   basket[counter++]= new Mango("mango", weight, color);
			   }else
			   {
				   System.out.println("Basket is full");
						   
			   }
			   break;
			   
		   case 2:
			   if(counter < size)
			   {
				   System.out.println("Enter weight");
				   double weight = sc.nextDouble();
				   System.out.println("Enter color:");
				   String color = sc.next();
				   basket[counter++]=new Orange("Orange", weight, color);
			   }else
			   {
				   System.out.println("Basket is full");
			   }
			   break;
			   
		   case 3:
			   if(counter < size)
			   {
				   System.out.println("Enter weight");
				   double weight = sc.nextDouble();
				   System.out.println("Enter color:");
				   String color = sc.next();
				   basket[counter++]=new Apple("Apple", weight, color);
			   }else
			   {
				   System.out.println("Bakset is full");
			   }
			   break;
			   
		   case 4:
			   System.out.println("Fruits in basket:");
			   for(Fruit fruit : basket)
			   {
				   if(fruit != null)
				   {
					   System.out.println(fruit.getName());
				   }
			   }
			   
			   break;
			   
		   case 5:
			   System.out.println("Fresh fruits :");
			   for(Fruit fruit: basket)
			   {
				   if(fruit !=null && fruit.isFresh())
				   {
					   System.out.println(fruit + ", Taste:" + fruit.taste());
				   }
			   }
			   break;
			   
		   case 6:
			   System.out.println("enter index to mark as stale:");
			   int index = sc.nextInt();
			   if(index >=0 && index < counter && basket[index]!=null)
			   {
				   basket[index].setFresh(false);
				   
				   System.out.println("Marked as stale");
			   }else
			   {
				   System.out.println("invalid index");
			   }
			   break;
			   
		   case 7:
			   for(Fruit fruit:basket)
			   {
				   if(fruit !=null && fruit.taste().equals("sour"))
				   {
					   fruit.setFresh(false);
				   }
			   }
			   System.out.println("All sour fruits marked as stale.");
			   break;
			   
			   default:
				   System.out.println("invalid choice");
		   }
	   }
	}

}
