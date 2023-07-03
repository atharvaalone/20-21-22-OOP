package com.account;

public class Account {
  private  double accountNo;
  private  double totalAmount;

    public Account(double accountNo, double totalAmount) {
        this.accountNo = accountNo;
        this.totalAmount = totalAmount;
    }

    public void debit(double withdrawAmount)
    {

        if(withdrawAmount>totalAmount){
            System.out.println("The Account Balance is low "+totalAmount);
        }else {
           totalAmount -=withdrawAmount;
            System.out.println("The "+withdrawAmount+ "has been Withdraw remaing balance is "+totalAmount);
        }

    }

    public static void main(String[] args) {
        Account account=new Account(182823849,20000);
        account.debit(100000);
        account.debit(2000);


    }

}
