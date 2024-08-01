package ATMPROCESS;

import java.util.HashMap;
import java.util.Map;

public class Atmoperation implements  Atminter {
    Atmmain atm = new Atmmain();
    Map<Double,String> minilist = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available balance is : " +atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0){
            if(withdrawAmount<=atm.getBalance()){
                minilist.put(withdrawAmount , "Amount is Withdrawn ");
                System.out.println(withdrawAmount+"Collect The Cash ");
                atm.setBalance(atm.getBalance() -withdrawAmount);
                viewBalance();
            }
            else {
                System.out.println("Insufficient Balance ");
            }
        }
        else {
            System.out.println("Please Enter the amount in the Multiple of 500 /-");
        }


    }

    @Override
    public void depositAmount(double depositAmount) {
        minilist.put(depositAmount, "Amount is Deposited ");
        System.out.println( depositAmount +"Deposited Successfully !! :) ");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
          for(Map.Entry<Double, String> m: minilist.entrySet()){
              System.out.println(m.getKey() + "" +m.getValue());
          }
    }
}
