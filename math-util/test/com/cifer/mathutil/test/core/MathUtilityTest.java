/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cifer.mathutil.test.core;

import com.cifer.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Cifer
 */
public class MathUtilityTest {

    public MathUtilityTest() {
        //đây là class sẽ sử dùng các hàm của thư viện/framwwork junit
        //để kiểm tra code chính hàm getExponent() ở core.MathUtil

    }

    //Có nhiều quy tắc đặt tên hàm kiểm thử
    //Thường là mục đích
    //@Test phía sau chính là psvm
    //có nhiều @Test với nhiều case khác nhau để kiểm thử hàm getFactorial()
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 1; //test thử
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        Assert.assertEquals(expected, actual);
        //So sánh 2 giá trị có giống nhau không 
        //xanh hoặc đỏ

        //so sánh nhiều case
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        long total = 1;
        for (int i = 1; i <= 20; i++) {
            total *= i;
            Assert.assertEquals(total, MathUtil.getFactorial(i));
        }

        //Hàm getFactorial() có 2 tình huống xử lí
        //1. Đưa data trong [0..20] -> Tình huống đúng
        //2. Đưa data ngoài [0..20] -> Ném ngoại lệ
        //Kì vọng ngoại lệ xuất hiện khi n < 0 || n > 20
        //Nếu hàm nhận vào n < 0 || n > 20, ném ra ngoại lệ -> Đúng theo thiết kế -> Xanh
    }

    //Tình huống bất thường, IllegalArgumentException xuất hiện khi input -5
    //Ngoại lệ, không thể đo lường so sánh kiểu expected - actual
    //assertEquals() ko dùng để so sánh 2 ngoại lệ
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
}
