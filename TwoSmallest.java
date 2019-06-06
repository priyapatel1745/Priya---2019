public class TwoSmallest{
    public static void main(String [] args){

	int times = 0;
	double first;
	double sec;
	double small;


	System.out.println("Please enter your terminating value");
	double terminate = IO.readDouble();
	System.out.println("Please enter your other values");
	double num = IO.readDouble();

	if (num!=terminate){
	    first = num;
	    sec = num;
	}
	else{
	    while(num==terminate);
			IO.reportBadInput();
			num = IO.readDouble();
	    	first = num;
	    	sec = num;
	}

	num = IO.readDouble();
	if(num!=terminate){
		times = 1;
	}
	else
	{
	    while(num==terminate)
	    {
			IO.reportBadInput();
			num = IO.readDouble();
			times = 1;
		}
	}

	if(num < first){ 
	    small = first;
	    first = num;
	    sec = small;
	}
	else
	{
		sec = num;
	}
	
	if(times == 1){
	    num = IO.readDouble();
	    while(num != terminate){
			if(first>num){
		 	   small = first;
		 	   first = num;
			   sec = small;
			}
			else if (sec>num){
				sec = num;
			}
		num = IO.readDouble();
	    }
	}

	IO.outputDoubleAnswer(first);
	IO.outputDoubleAnswer(sec);
	
    }
}
