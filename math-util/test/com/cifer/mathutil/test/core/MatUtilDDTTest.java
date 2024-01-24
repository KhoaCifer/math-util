/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cifer.mathutil.test.core;

import com.cifer.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Cifer
 */
//Báo rằng cần loop qua tập data để lấy data đưa vào hàm test
@RunWith(value = Parameterized.class)
public class MatUtilDDTTest {

    @Parameterized.Parameters //JUnit chạy loop qua từng dòng,
    //Lấy ra cặp data input/expected
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},};
    }
    @Parameterized.Parameter(value = 0)
    public int n; //Cột 0 của mảng
    @Parameterized.Parameter(value = 1)
    public long expected; //Cột 1 của mảng
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
