
public class BuyingTomatoes {

    public static void main (String[] args) {

	System.out.print("Please enter cost per pound of tomatoes");
	double costt = IO.readDouble();
	double total = 0;
	if (costt<0)
	{
		System.out.print("Please enter a positive number");
		IO.reportBadInput();
	}else{
		System.out.print("Please enter how many pound(s) of tomatoes");
		double poundt = IO.readDouble();
		if (poundt<0)
		{
			System.out.print("Please enter a positive number");
			IO.reportBadInput();
		}
		total = costt * poundt;

	}
	IO.outputDoubleAnswer(total);    
}
}
