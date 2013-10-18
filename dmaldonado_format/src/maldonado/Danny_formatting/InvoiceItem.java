package maldonado.Danny_formatting;

public class InvoiceItem 
{
	String invoiceItem;
	int quantity;
	double price;
	int itemCounter=0, quantityCounter=0, priceCounter =0;
	int longest, length1, length2, length3;

	String[] invoiceItems = new String[3];

	public InvoiceItem()
	{
		invoiceItem = "Hard Drive Cable";
		invoiceItemArray(invoiceItem);
		invoiceItem = "HDMI Cable";
		invoiceItemArray(invoiceItem);
		invoiceItem = "SATA Cable";
		invoiceItemArray(invoiceItem);
		findLargestWord();
	}

	public void invoiceItemArray(String invoiceItem)
	{
		invoiceItems[itemCounter] = invoiceItem;
		itemCounter++;
	}
	
	public void findLargestWord()
	{
		length1 = invoiceItems[0].length();
		length2 = invoiceItems[1].length();
		length3 = invoiceItems[2].length();
		longest = length1;
		if(length2 > length1)
		{
			longest = length2;
			if(length3 > length2)
			{
				longest = length3;
			}
		}
		if(length3 > length1)
		{
			longest = length3;
		}
		
	}
	
	public void printArray()
	{
		System.out.println("Item     Quantity Price" );
		System.out.println("----     -------- -----");
		quantity = 1;
		price = 19.99;
		System.out.format("[%"+longest+ "s %"+10+"d %s]\n" ,invoiceItems[0],quantity, price);
		quantity = 2;
		price = 22.43;
		System.out.format("[%"+longest+ "s %"+10+"d %s]\n" ,invoiceItems[1],quantity, price);
		quantity = 9;
		price = 11.99;
		System.out.format("[%"+longest+ "s %"+10+"d %s]\n" ,invoiceItems[2],quantity, price);
	}
}
