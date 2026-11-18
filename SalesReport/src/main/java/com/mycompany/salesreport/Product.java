/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct {

    private String[] products;
    private int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int row = 0; row < sales.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {

                total += sales[row][col];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();
        int count = 0;

        for (int row = 0; row < sales.length; row++) {
            count += sales[row].length;
        }

        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {

        int highest = 0;
        int index = 0;

        for (int row = 0; row < sales.length; row++) {

            int total = 0;

            for (int col = 0; col < sales[row].length; col++) {

                total += sales[row][col];

                if (sales[row][col] > highest) {
                    highest = sales[row][col];
                    index = row;
                }
            }
        }

        return products[index] + "(" + highest + ")";
    }

}
