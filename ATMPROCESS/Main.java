package ATMPROCESS;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Atminter op = new Atmoperation();

        int atmnum = 12345;
        int atmpin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Atm Machine ");
        System.out.print("Enter a Atm Number : ");
        int atmnumber = in.nextInt();
        System.out.println("Enter a Atm Pin : ");
        int atmpinnum = in.nextInt();
        if((atmnum==atmnumber)&&(atmpin==atmpinnum)){
            while(true){
                System.out.println("1.Available Balance \n 2.Withdraw Amount \n 3.Deposit Amount \n 4.View Ministatement \n 5.Exit ");
                System.out.println("Enter a Choice : ");
                int choice =  in.nextInt();
                if(choice==1){
                      op.viewBalance();
                }
                else if(choice==2){
                    System.out.println("Enter A amount : ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(choice ==3){
                    System.out.println("Enter Amount to Deposit ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(choice ==4){
                       op.viewMiniStatement();
                }
                else if(choice==5){
                    System.out.println("Collect Your Atm Card ");
                    System.exit(0);
                }
                else {
                    System.out.println("Please  Enter the Correct Choice ");
                }
            }
        }
        else {
            System.out.println("Invalid Atm or pin ");
            System.exit(0);
        }
    }
}
