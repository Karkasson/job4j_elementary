package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RbThen3Dlr() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert15EuroThen1050Rb() {
        int in = 15;
        int expected = 1050;
        int out = Converter.euroToRubles(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void whenConvert35DlrThen2100Rb() {
        int in = 35;
        int expected = 2100;
        int out = Converter.dollarToRubles(in);
        Assert.assertEquals(expected, out);

    }
}