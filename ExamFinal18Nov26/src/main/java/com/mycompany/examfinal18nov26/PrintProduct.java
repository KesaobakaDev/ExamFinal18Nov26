/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examfinal18nov26;

import java.text.DecimalFormat;

/**
 *
 * @author kesao
 */
public class PrintProduct {
     private final Product product;
    
    private final DecimalFormat averageFormat = new DecimalFormat("0.##");

    public PrintProduct(Product product) {
        this.product = product;
    }

    
    public void printHeader() {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("****************************");
    }

    public void printTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void printAverageProductSales() {
        System.out.println("AVERAGE PRODUCT SALES: "
                + averageFormat.format(product.GetAverageProductSold()));
    }

    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct()
                + "(" + product.GetMostPopularProductSales() + ")");
    }
}
