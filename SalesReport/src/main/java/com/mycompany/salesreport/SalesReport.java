/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class SalesReport {

    public static void main(String[] args) {

        String[] mattresses = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = {
            {25, 15, 18},
            {18, 10, 15},
            {20, 12, 20}
        };

        System.out.print("PRODUCT SALES REPORT - 2026");

        int overallTotal = 0;
        int highest = 0;
        int index = 0;

        for (int row = 0; row < sales.length; row++) {
            int total = 0;

            for (int col = 0; col < sales[row].length; col++) {

                overallTotal += sales[row][col];

                if (sales[row][col] > highest) {
                    highest = sales[row][col];
                    index = row; // To keep track of which mattress is the popular one instead of hardcoding.
                }
            }
        }

        int total = overallTotal;
        int count = 0;

        for (int r = 0; r < sales.length; r++) {
            count += sales[r].length;
        }

        System.out.print("\n************************************************");
        System.out.print("\nTOTAL PRODUCT SALES: " + overallTotal);
        System.out.print("\nAVERAGE PRODUCT SALES: " + (double) total / count);
        System.out.print("\nMOST POPULAR PRODUCT: " + mattresses[index] + "(" + highest + ")");
    }
}
