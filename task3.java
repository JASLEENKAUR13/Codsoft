import java.util.Scanner;


//class for user's bank account.
class user_account{
    static Scanner sc = new Scanner(System.in);
    
    private int acc_balance;
    public user_account(int BALANCE){
        acc_balance = BALANCE;

    }


    //function for money withdrawl
    public void withdraw_amount(){
        System.out.println("YOUR REMAINING BALANCE ACCOUNT SHOULD BE GREATER THAN  RS.500");
        System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW.");
        int amount = sc.nextInt();
        if(acc_balance<amount){
            System.out.println("OOPS! AMOUNT CAN'T BE WITHDRAWN AS YOU DONT HAVE SUFFICIENT BANK BALANCE.");
        }
        else{
            acc_balance = acc_balance-amount;
            System.out.println("TRANSCATION DONE.");
        }
        System.out.println("THANK YOU!");
    }


    //function for money deposit
    public void deposit_amount(){

        System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT.");
        int amount = sc.nextInt();
        
        
        if(amount>0){
            acc_balance = acc_balance+amount;
            System.out.println("amount deposited.");

        }else{
            System.out.println("INVALID DEPOSIT AMOUNT.");
        }
        System.out.println("THANK YOU!");

    }


    // function for account balance checking.
    public void check_balance(){
        System.out.println("YOUR BANK BALANCE IS: "+acc_balance);
        System.out.println("THANK YOU!");
    }


}

//class for user interface of atm machine.
class atm_Machine{
    static int action;
    static Scanner sc = new Scanner(System.in);
    private static user_account account;
    
    public atm_Machine(user_account account){
        this.account = account;
    }
    public static void run(){

        
        System.out.println("please enter user name");
        String user_name = sc.nextLine();
        do{

        System.out.println("WELCOME  " + user_name);
        System.out.println("INPUT 1 TO WITHDRAW");
        System.out.println("INPUT 2 TO DEPOSIT");
        System.out.println("INPUT 3 TO CHECK BALANCE");
        System.out.println("INPUT 4 TO EXIT");
        
       
        
        action = sc.nextInt();
       
       switch(action){
        case 1:
        account.withdraw_amount();
        break;
        case 2: 
        account.deposit_amount();
        break;
        case 3:
        account.check_balance();
        break;
       }
    }while(action!=4);
    }  
   
}



public class task3 {
    
    public static void main(String args[]){
        user_account User = new user_account(10000);
        atm_Machine ATM = new atm_Machine(User);
        ATM.run();
        
    }
    
}
