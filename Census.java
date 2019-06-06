public class Census {

    public static void main (String[] args) {

        System.out.print("How many apartment buildings?");
        int num = IO.readInt();
        int count = 1;
        int sumSenior = 0;
        int sumAdult = 0;
        int sumChild = 0;


        while (count <=num)
        {
            System.out.println("How many children in apartment "  + count + "?");
                int children = IO.readInt();
                sumChild = sumChild + children; 
            System.out.println("How many seniors in apartment "  + count + "?");
                int seniors = IO.readInt();
                sumSenior = sumSenior + seniors; 
            System.out.println("How many adults in apartment "  + count + "?");
                int adults = IO.readInt();
                sumAdult = sumAdult + adults; 

            count++;
        }

        double avgChild = (double)sumChild/(double)num;
        double avgSenior = (double)sumSenior/(double)num;
        double avgAdult = (double)sumAdult/(double)num;

        IO.outputIntAnswer(sumChild); 
        IO.outputIntAnswer(sumSenior); 
        IO.outputIntAnswer(sumAdult);    
        IO.outputDoubleAnswer(avgChild); 
        IO.outputDoubleAnswer(avgSenior); 
        IO.outputDoubleAnswer(avgAdult); 


    }
}

//IO.readInt();
//IO.reportBadInput();
//System.out.println("");
//IO.output[type]Answer();
//IO.readInt();
//IO.reportBadInput();
//System.out.println("");
//IO.output[type]Answer();