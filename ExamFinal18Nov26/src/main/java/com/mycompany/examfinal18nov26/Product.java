/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examfinal18nov26;

/**
 *
 * @author kesao
 */
public class Product implements IProduct {

    private final String[] productNames;
    private final int[][] monthlySales;
  
    public Product(String[] productNames, int[][] monthlySales) {
        this.productNames = productNames;
        this.monthlySales = monthlySales;
    }
  
    private int getTotalForProduct(int productIndex) {
        int total = 0;
        for (int sale : monthlySales[productIndex]) {
            total += sale;
        }
        return total;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            total += getTotalForProduct(i);
        }
        return total;
    }
 
    @Override
    public double GetAverageProductSold() {
        int entries = 0;
        for (int[] row : monthlySales) {
            entries += row.length;
        }
        if (entries == 0) {
            return 0; 
        }
        return (double) GetTotalProductsSold() / entries;
    }
  
    private int getMostPopularIndex() {
        int bestIndex = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (getTotalForProduct(i) > getTotalForProduct(bestIndex)) {
                bestIndex = i;
            }
        }
        return bestIndex;
    }
 
    @Override
    public String GetMostPopularProduct() {
        return productNames[getMostPopularIndex()];
    }

    public int GetMostPopularProductSales() {
          int best = 0;
          for (int sale : monthlySales[getMostPopularIndex()]) {
          if (sale > best) {
           best = sale;
        }
    }
    return best;
    }
}
