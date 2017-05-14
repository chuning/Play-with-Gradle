package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chuningluo on 5/9/17.
 */
public class JokeTellingProviderTest {
    @Test
    public void testGetJoke() throws Exception {
        JokeTellingProvider joker = new JokeTellingProvider();
        assert joker.getJoke().length() != 0;
    }

}