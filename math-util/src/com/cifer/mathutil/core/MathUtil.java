/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifer.mathutil.core;

/**
 *
 * @author Cifer
 */
public class MathUtil {
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid input");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product = i * product;
        }
        return product;
    }
}
