/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3_a;

/**
 *
 * @author melvi
 */
public class question1 {
    public double calculateNet(int hours, double rate, double tax){
        
        double gross = hours*rate;
        return gross - tax;
    }
}
