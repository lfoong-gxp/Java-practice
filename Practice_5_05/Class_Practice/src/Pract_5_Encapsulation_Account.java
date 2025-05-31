//Encapsulation practice

class Account{
    private int balance;
    private int accNo;

    //Balance
    public long getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    //Acc
    public long getAccNo(){
        return accNo;
    }
    public void setAccNo(int accNo){
        this.accNo=accNo;
    }

    public int deposit(int amount, int accNo){
        if (this.accNo == accNo){
            balance= amount+balance;

        }
        else{
            System.out.println("Acc does not exist!");
        }
        return balance;
    }

    public int withdraw (int amount , int accNo){
        if(this.accNo== accNo){
            balance = balance - amount;
            if (balance <0){
                System.out.println("This is not possible!");
            }
            else{
                System.out.println("This is remaining balance: " + balance);
            }
        }
        return balance;
    }


}

public class Pract_5_Encapsulation_Account {
    public static void main(String [] args){
        Account acc= new Account();
        acc.setAccNo(9811);
        acc.setBalance(2222);
        System.out.println("Your acc no: " + acc.getAccNo());
        System.out.println("You balance: "+ acc.getBalance());

        acc.deposit(1,9811);
        System.out.println(acc.getBalance());

        acc.withdraw(1000, 9811);


    }
}