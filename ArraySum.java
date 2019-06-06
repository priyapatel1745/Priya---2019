public class ArraySum
{
  public static void main(String args[] )
  {
      // Test your arraySum method.
      // Use other test cases as well.
      
      int[] inputArray = {1, -24, 9, 345, 176, 78, -7};
      int sum = arraySum(inputArray);
      System.out.println(sum);
  }
    
  public static int arraySum(int[] sumArray)
  {
  	int sum;
  		for(i=0;i<(sumArray.length-1);i++)
  		{
  			sum+=sumArray[i];
    	}
    return sum;
  }
}
