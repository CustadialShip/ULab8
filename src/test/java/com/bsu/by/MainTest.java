package com.bsu.by;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void isIPv4() {
        Assert.assertEquals(true, Main.isIPv4("99.198.122.146"));
        Assert.assertEquals(false, Main.isIPv4("256.256.256.256"));
        Assert.assertEquals(false, Main.isIPv4("1"));
    }
}