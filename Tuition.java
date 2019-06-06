public class Tuition {

    public static void main (String[] args) {
    	double tuition = 0;
    	int credits = 0;
		System.out.print("How many credits are you taking?");
		int answer = IO.readInt();
			if (answer<0)
			{
				IO.reportBadInput();
			}else{
				credits = answer * 35;
			}
		System.out.print("Are you paying in Installments?");
		boolean install = IO.readBoolean();

		System.out.print("Are you an employee?");
		boolean employee = IO.readBoolean();

			if (employee == true)
			{
				System.out.print("Are you a university employee?");
				boolean uni = IO.readBoolean();
				if (uni == true){
					if (install == false)
					{
						tuition = 5.75;
					}else{
						tuition = 5.75 + (5.75 * 0.02);
					}
				}else{
					if (install == false)
					{
						tuition =  5.75 + (0.2*credits);
					}else{
						tuition = 5.75+(0.2*credits) + (0.02*(5.75+(0.2*credits)));
					}
				}
			}else{
				if (install == true)
				{
					tuition =  5.75 + credits + (0.02*(5.75 + credits));
				}else{
					tuition = 5.75 + credits;
				}	

			}


		IO.outputDoubleAnswer(tuition);
}
}
