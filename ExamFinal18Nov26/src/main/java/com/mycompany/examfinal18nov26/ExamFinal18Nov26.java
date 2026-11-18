/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examfinal18nov26;

import java.util.Scanner;

/**
 *
 * @author kesao
 */
public class ExamFinal18Nov26 {

    private static final int MONTHS = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String[] productNames = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = new int[productNames.length][MONTHS];

 
        for (int p = 0; p < productNames.length; p++) {
            for (int m = 0; m < MONTHS; m++) {
                sales[p][m] = readSales(input, m + 1, productNames[p]);
            }
            System.out.println();
        }

 
        Product product = new Product(productNames, sales);
        PrintProduct printer = new PrintProduct(product);
        printer.printHeader();
        printer.printTotalProductSales();
        printer.printAverageProductSales();
        printer.printMostPopularProduct();
    }
    
    private static int readSales(Scanner input, int month, String productName) {
        while (true) {
            System.out.print("Enter number of sales for month " + month
                    + " for " + productName + " mattress: ");
            String text = input.nextLine().trim();
            try {
                int value = Integer.parseInt(text);
                if (value >= 0) {
                    return value;
                }
            } catch (NumberFormatException ex) {
                
            }
            System.out.println("Invalid input. Please enter a whole number of 0 or more.");
               
        }
    }
}
