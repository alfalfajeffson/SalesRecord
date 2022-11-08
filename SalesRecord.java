/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.salesrecord;

/**
 *
 * @author ks
 */
import java.util.Scanner;
public class SalesRecord {
    public static void main(String[]args){
        Scanner selling = new Scanner(System.in);
        
        double purchase;
        double stateSalesTax = 0.04;
        double countySaleTax = 0.02;
        double totalSalesTax;
        double totalSale;
        
        // INFO ON PURCHASES
        System.out.println(" Enter the amount of the purchase made ");
        purchase = selling.nextDouble();
        
        //COMPUTATIONS OF SALES
        totalSalesTax = stateSalesTax + countySaleTax;
        totalSale = purchase + totalSalesTax;
        
        //RESULTS OOUTPUT
        //PURCHASE
        System.out.println("Purchase = " + purchase);
        
        //STATE SALES TAX
        System.out.println("Stae Sales Tax = " + stateSalesTax);
        
        //COUNTY SALE TAX
        System.out.println("County Sales Tax = " + countySaleTax);
        
        //TOTAL SALES TAX RECEIVED
        System.out.println("The Total Sales Tax = " + totalSalesTax);
        
        //TOTAL SALES MADE
        System.out.println("Finally, The Total Sales = " + totalSale);
        
    }
}
