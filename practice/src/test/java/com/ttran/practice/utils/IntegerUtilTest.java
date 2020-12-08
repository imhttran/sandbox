package com.ttran.practice.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerUtilTest {


    @Test
    public void testStrToInt(){
        int zero = IntegerUtil.strToInt("0");
        Assertions.assertEquals(0, zero);

        int neg = IntegerUtil.strToInt("-1");
        Assertions.assertEquals(-1, neg);

        int one = IntegerUtil.strToInt("1");
        Assertions.assertEquals(1, one);

        int num = IntegerUtil.strToInt("348");
        Assertions.assertEquals(348, num);

    }


    @Test
    public void testIntToString(){
        String zero = IntegerUtil.intToString(0);
        Assertions.assertEquals("0", zero);

        String neg = IntegerUtil.intToString(-1);
        Assertions.assertEquals("-1", neg);

        String one = IntegerUtil.intToString(1);
        Assertions.assertEquals("1", one);

        String num = IntegerUtil.intToString(348);
        Assertions.assertEquals("348", num);

    }


}
