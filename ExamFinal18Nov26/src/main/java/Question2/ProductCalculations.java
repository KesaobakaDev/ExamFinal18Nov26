/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author kesao
 */
public class ProductCalculations implements IProductCalculations{
    private static final double VAT_RATE = 0.15;        
    private static final double COMMISSION_RATE = 0.05;

    private final double price;

    public ProductCalculations(double price) {
        this.price = price;
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    @Override
    public double GetVat() {
        return round(price * VAT_RATE);
    }

    @Override
    public double GetCommission() {
        return round(price * COMMISSION_RATE);
    }


    @Override
    public double GetTotal() {
        return round(price + GetVat() + GetCommission());
    }
}
