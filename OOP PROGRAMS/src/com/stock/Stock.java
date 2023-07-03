package com.stock;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String stockName;
    private int stockprice;

    private int noOfStock;

    public Stock(String stockName, int stockprice, int noOfStock) {
        this.stockName = stockName;
        this.stockprice = stockprice;
        this.noOfStock = noOfStock;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getStockprice() {
        return stockprice;
    }

    public void setStockprice(int stockprice) {
        this.stockprice = stockprice;
    }

    public int getNoOfStock() {
        return noOfStock;
    }

    public void setNoOfStock(int noOfStock) {
        this.noOfStock = noOfStock;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", stockprice=" + stockprice +
                ", noOfStock=" + noOfStock +
                '}';
    }
}

class StockPortfoilo {
    List<Stock> list = new ArrayList<>();


    public void addStocks(Stock s) {
        list.add(s);


    }

    public void gettotal() {
        int total = 0;
        for (Stock s : list) {
            total = total + s.getStockprice();
        }
        System.out.println("Total Stock Price is:" + total);

    }

    public List<Stock> getStockReport() {
        return list;
    }

    public static void main(String[] args) {
        Stock s1 = new Stock("Tata motor", 122, 1010);
        Stock s2 = new Stock("Axis Bank", 142, 1030);
        Stock s3 = new Stock("Nifty50", 1232, 1020);
        Stock s4 = new Stock("Lic", 1242, 1030);
        StockPortfoilo stockPortfoilo = new StockPortfoilo();
        stockPortfoilo.addStocks(s1);
        stockPortfoilo.addStocks(s2);
        stockPortfoilo.addStocks(s3);
        stockPortfoilo.addStocks(s4);

        stockPortfoilo.gettotal();

        List<Stock> ls = stockPortfoilo.getStockReport();
        for (Stock s : ls) {
            System.out.println(s);
        }


    }

}

