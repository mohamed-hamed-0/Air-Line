
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*passenger f=30 , b=25 , e=20
    if passenger have an overweight
    the cost in 1kg is 10 (Dollar,E.G,Reyal)
     */

        char degree;
        int weight;
        Scanner in = new Scanner(System.in);

        System.out.println("Entre the number of groups ");
        int numg = in.nextInt();

        for (int i = 1; i <= numg; i++) {

           System.out.println("Enter the number of Passengers G " + i );
           int nump=in.nextInt();
           for (int j =1; j <= nump; j++) {
               System.out.println("Welcome to Saudi Arabian AirLines ! ");
               System.out.println("HI Passenger Number : " + j );
               System.out.println("Entre Your class : ");
               System.out.println("(F)  (B)  (E)");
               degree = in.next().charAt(0);

               switch (degree) {

                   case 'f', 'F':
                       System.out.println("What is the weight of the bags ?");
                       System.out.println("Weight is : ");
                       weight = in.nextInt();
                       if (weight > 30) {
                           int overweight = weight - 30;
                           System.out.println("The weight of the bags is greater than 30kg.");
                           System.out.println("overweight:" + overweight);
                           System.out.println("The cost = " + overweight * 10 + " SAR");

                       } else {
                           System.out.println("Thank You (:");
                       }
                       ;
                       break;
                   case 'b', 'B':
                       System.out.println("What is the weight of the bags ?");
                       System.out.println("Weight is : ");
                       weight = in.nextInt();
                       if (weight > 25) {
                           int overweight = weight - 25;
                           System.out.println("The weight of the bags is greater than 25kg.");
                           System.out.println("overweight:" + overweight);
                           System.out.println("The cost = " + overweight * 10 + " SAR");

                       } else {
                           System.out.println("Thank You (:");
                       }
                       ;
                       break;

                   case 'e', 'E':
                       System.out.println("What is the weight of the bags ?");
                       System.out.println("Weight is : ");
                       weight = in.nextInt();
                       if (weight > 20) {
                           int overweight = weight - 20;
                           System.out.println("The weight of the bags is greater than 20kg.");
                           System.out.println("overweight:" + overweight);
                           System.out.println("The cost = " + overweight * 10 + " SAR");

                       } else {
                           System.out.println("Thank You (:");
                       }
                       ;
                       break;
                   default:
                       System.out.println("Invalid Input");
               }
           }
       }
    }
}