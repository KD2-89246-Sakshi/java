
class Invoice
{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;


public Invoice(String partNumber,String partDescription, int quantity, double pricePerItem )
{
	this.partNumber= partNumber;
	this.partDescription=partDescription;
	setquantity(quantity);
	setpricePerItem(pricePerItem);
}

public String getpartNumber()
{
	return partNumber;
}
public void setpartNumber(String partNumber)
{
	this.partNumber=partNumber;
}

public String getpartDescription()
{
	return partDescription;
}
public void setpartDescription(String partDescription)
{
	this.partDescription= partDescription;
}
public int getQuantity()
{
	return quantity;
}

public void setQuantity(int quantity)
{
	this.quantity = (quantity > 0) ? quantity : 0;
}

public double getpricePerItem()
{
	return pricePerItem;
}

public void setpricePerItem(double pricePerItem)
{
	this.pricePerItem=(pricePerItem > 0) ? pricePerItem : 0.0;
}

public double getInvoiceAmount()
{
	return quantity * pricePerItem;
}

  public class InvoiceTest{
	public static void main(String[] args) {
		Invoice invoice1 = new Invoice("1234", "Hammer", 5, 15.75);
//		Invoice invoice2= new Invoice("5678", "Screwdriver", -3, -10.50);
		System.out.println("Invoice 1:");
		System.out.println("Partr Number:" +invoice1.getpartNumber());
		System.out.println("Description :"+ invoice1.getpartDescription());
		System.out.println("Quantity : " +invoice1.getQuantity());
		System.out.println("Price per item : " + invoice1.getpricePerItem());
		System.out.println("Total invoice amount :" +invoice1.getInvoiceAmount());
                
                System.out.println("\nInvoice 2:");
                System.out.println("Part Number: " + invoice2.getPartNumber());
                System.out.println("Description: " + invoice2.getPartDescription());
                System.out.println("Quantity: " + invoice2.getQuantity());
                System.out.println("Price per item: " + invoice2.getPricePerItem());
                System.out.println("Total invoice amount: " + invoice2.getInvoiceAmount());
		
	}
		
	}
}


