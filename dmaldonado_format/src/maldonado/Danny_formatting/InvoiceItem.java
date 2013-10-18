package maldonado.Danny_formatting;

public class InvoiceItem 
{
	String invoiceItem;
	int quantity;
	double price;
	int itemCounter=0, quantityCounter=0, priceCounter =0;

	String[] invoiceItems = new String[3];
//	int[] numOfItems = new int[3];
	double[] pricing = new double[3];

	public InvoiceItem()
	{
		invoiceItem = "Hard Drive";
		invoiceItemArray(invoiceItem);
		invoiceItem = "HDMI Cable";
		invoiceItemArray(invoiceItem);
		invoiceItem = "SATA Cable";
		invoiceItemArray(invoiceItem);
	}

	public void invoiceItemArray(String invoiceItem)
	{
		invoiceItems[itemCounter] = invoiceItem;
		itemCounter++;
	}
	
	public void printArray()
	{
		System.out.println("Item     Quantity Price" );
		System.out.println("----     -------- -----");
		quantity = 1;
		price = 19.99;
		System.out.format("[%s %d %s]\n" ,invoiceItems[0],quantity, price);
		quantity = 2;
		price = 22.43;
		System.out.format("[%s %d %s]\n" ,invoiceItems[1],quantity, price);
		quantity = 9;
		price = 11.99;
		System.out.format("[%s %d %s]\n" ,invoiceItems[2],quantity, price);
	}
}
