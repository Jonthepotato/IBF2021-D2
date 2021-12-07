package ibf2021;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BankAccount {

    private String Accholdername;
    private String AccNum;
    private float AccBal;
    private List<String> Transaction;
    private boolean AccClosed;
    private String AccCreationDate;
    private String AccCloseDate;

    public BankAccount(String name, String accnumber){
        name = Accholdername;
        accnumber = AccNum;
        accnumber = Integer.toString((int)Math.random()*1000000000);
        ArrayList<String> Transaction = new ArrayList<String>();
        float accbalance = AccBal;
    }

    //setters
    public void getAccHolderName(String Name){
        Accholdername = Name;
    }

    public void getAccNum(String accNum){
        AccNum = accNum;
    }

    public void getAccBal(float accBal){
        AccBal = accBal;
    }

    // Transaction;
    // AccClosed;
    //  AccCreationDate;
    // AccCloseDate;


    public void deposit(float amount){
        Long Depositdate = Calendar.getInstance().getTimeInMillis();
        if (amount < 0 || AccClosed == true) {
            System.out.println("Amount needs to be positive and account must be open");
            throw new IllegalArgumentException();
            
        }
            else{
                AccBal += amount;
                String transaction = "deposit " + amount + " at "+ Depositdate;
                ArrayList<String> Transaction = new ArrayList<String>();
                Transaction.add(transaction);
                System.out.println(transaction);
            }
    }

    public void withdraw(float amount){
        Long Withdrawdate = Calendar.getInstance().getTimeInMillis();

        if (amount <0 || amount > AccBal || AccClosed == false) {
            System.out.println("You can only withdraw available funds in account, account must be open & amount needs to be positive");
            throw new IllegalArgumentException();
            
        }
            else {
                AccBal -= amount;
                String transaction = "withdraw "+amount+" at "+Withdrawdate;
                Transaction.add(transaction);
                System.out.println(transaction);
            }


    }


}
