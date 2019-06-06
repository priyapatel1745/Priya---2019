public class TwoLargest {
	public static void main(String[] args) {
		System.out.println("Enter the terminating value: ");
		double term = IO.readDouble();
		System.out.println("Keep entering numbers until you wish to stop: ");
		double a = IO.readDouble();
		boolean flag = true;
		int count = 0, count2 = 0;
		if (a == term) {
			IO.reportBadInput();
			//System.out.println("Keep entering numbers until you wish to stop: ");
		}
		double max = Integer.MIN_VALUE;
		double max2 = max;

		while (flag) {
			if (a == term && count2 != 0) {
				IO.reportBadInput();
			}
			count2++;
			if (a != term) {
				count++;
			}
			if (a >= max && a!=term) {
				max2 = max;
				max = a;
			}
			else if(a > max2 && a!=term) {
				max2 = a;
			}
			a = IO.readDouble();
			if (a == term && count > 0) {
				flag = false;
			}
		}

		if (count == 1) {
			max2 = max;
		}

		IO.outputDoubleAnswer(max);
		IO.outputDoubleAnswer(max2);
	}
}