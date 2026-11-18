/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {

    public void PrintTotalProductSales(Product p) {
        System.out.println("TOTAL PRODUCT SALES: " + p.GetTotalProductsSold());
    }

    public void PrintAverageProductSales(Product p) {
        System.out.println("AVERAGE PRODUCT SALES: " + p.GetAverageProductSold());
    }

    public void PrintMostPopularProduct(Product p) {
        System.out.println("MOST POPULAR PRODUCT: " + p.GetMostPopularProduct());
    }
}
