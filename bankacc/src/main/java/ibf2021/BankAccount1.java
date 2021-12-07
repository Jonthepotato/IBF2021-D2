// package ibf2021;

// import java.util.Calendar;
// import java.util.Date;
// import java.util.List;

// public class BankAccount1 {
// /* Members - all members are private. You should provide getters and setters.
// o account holder’s name - string. This is a read only property viz. cannot be changed once it is set
// o randomly generated account number - string
// o account balance - float
// o transactions for operations performed on the account - a list of strings
// o closed to indicate if this account has been closed - boolean
// o account creating date
// o account closing date*/
    

// private String name;
// private String accountnumber;
// private float accountbalance;
// private List<String> transaction;
// private boolean accountisclosed;
// private String accountCreatedDate;
// private String accountClosedDate;

// }

// public BankAccount(String name, float accountbalance){
//     this.name = name;
// }

// public BankAccount(String name) {
//     this.name = name;
//     this.accountbalance = 0f;
//     this.accountnumber = Integer.toString((int)Math.random()*1000000000);
//     transactions = new Arraylist<>();
// } 

// public void deposit(float amount){
//     if (amount<0 || accountisclosed false)
//     throw new IllegalArgumentException();
//     String transaction = "" + amount + Calendar.getInstance().getTimeInMillis();
//     transactions.add(transaction);
//     //this.accoutnbalance = this.accountbalance + amount;
//     this.accountbalance += amount;
// }

// public void setAccountCloseddate(){


// }

// public void withdraw(float amount){
//     if (amount<0 || amount> this.accountbalance)
//         throw new IllegalArgumentException();

//     String transaction = "withdraw" + amount + " at "+ Calendar.getInstance().getTimeInMillis();
//     transactions.add(transaction);
//     //this.accountBalance = this.accountBalace - amount;
//     this.accountbalance -= amount;
// }


// }