/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifer.mathutil.main;

import com.cifer.mathutil.core.MathUtil;

/**
 *
 * @author Cifer
 */
public class Main {

    public static void main(String[] args) {
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println(expected);
        System.out.println(actual);
    }
}
