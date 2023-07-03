package com.stockaccount;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StockAccount {
    private String fileName;

//    private List<StockAccount> sharelist;
//    StockAccount(String fileName){
//        this.fileName=fileName;
//        sharelist=new ArrayList<>();
//
//    }


    public String valueOf() throws IOException {
        FileWriter writer=new FileWriter(fileName);
        writer.write("Atharva");
return fileName;
    }
    public String getFileName(){
        return fileName; }

    public void buy(int amount,String symbol){

    }
    public void sell(int amount,String symbol){

    }
    public void save(String filename){

    }
    public void printReport(){

    }

    public static void main(String[] args) throws IOException {
        StockAccount stockAccount=new StockAccount();
        System.out.println(stockAccount.valueOf());
        System.out.println(stockAccount.getFileName());


    }


}
// create new account from file
//total value of account doller
//add share of stock to the account
//substract share of stock form account
//save account to file
//print a detailed report of stock and values
