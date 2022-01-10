package ru.vsu.cs.sviridov_d_v;

import org.junit.Test;
import org.junit.Assert;

public class TestOfFindingMaxSumOfConsecutiveElements {

    @Test

    public void testArray1() {
        int[] arrayTest = {1, 0, 1, 0, 1, 1, 1};
        int expectedResult = 5;
        int realResult = FindMaxSumOfConsecutiveElements.findMaxSumOfConsecutiveElements(arrayTest);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test

    public void testArray2() {
        int[] arrayTest = {5, 7, 7, 8, -1, 7, 9};
        int expectedResult = 42;
        int realResult = FindMaxSumOfConsecutiveElements.findMaxSumOfConsecutiveElements(arrayTest);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test

    public void testArray3() {
        int[] arrayTest = {1, 1, 1, 1, 1, 1, 1};
        int expectedResult = 7;
        int realResult = FindMaxSumOfConsecutiveElements.findMaxSumOfConsecutiveElements(arrayTest);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test

    public void testArray4() {
        int[] arrayTest = {-1, -5, -169, -2, -38, -17, -224};
        int expectedResult = -1;
        int realResult = FindMaxSumOfConsecutiveElements.findMaxSumOfConsecutiveElements(arrayTest);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test

    public void testArray5() {
        int[] arrayTest = {3, 33, 3, 33, 3, 33, 3};
        int expectedResult = 111;
        int realResult = FindMaxSumOfConsecutiveElements.findMaxSumOfConsecutiveElements(arrayTest);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test

    public void testArray6() {
        int[] arrayTest = {2, 2, 14, 2, 1, 19};
        int expectedResult = 40;
        int realResult = FindMaxSumOfConsecutiveElements.findMaxSumOfConsecutiveElements(arrayTest);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test

    public void testArray7() {
        int[] arrayTest = {-4, -6, -2, -2, -2, -8, -10};
        int expectedResult = -2;
        int realResult = FindMaxSumOfConsecutiveElements.findMaxSumOfConsecutiveElements(arrayTest);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test

    public void testArray8() {
        int[] arrayTest = {14, -2, 0, 2, 6, 7, 3};
        int expectedResult = 30;
        int realResult = FindMaxSumOfConsecutiveElements.findMaxSumOfConsecutiveElements(arrayTest);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test

    public void testArray9() {
        int[] arrayTest = {-1, 2, 3, 3, 4, 5, 6};
        int expectedResult = 23;
        int realResult = FindMaxSumOfConsecutiveElements.findMaxSumOfConsecutiveElements(arrayTest);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test

    public void testArray10() {
        int[] arrayTest = {1, 11, 11, 11, 11, 11, 1};
        int expectedResult = 57;
        int realResult = FindMaxSumOfConsecutiveElements.findMaxSumOfConsecutiveElements(arrayTest);
        Assert.assertEquals(expectedResult, realResult);
    }

}
