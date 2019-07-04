package com.stackroute.projectexercise_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCountTest {
    CharCount testobj;
    @Before
    public void setUp(){
        testobj=new CharCount();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void testCharcount(){
        int cnt=testobj.charCount("Java is java again java again",'a');
        assertEquals(10,cnt);
    }
    @Test
    public void testCharcountWithSpace(){
        int cnt=testobj.charCount("Java is java again java again",' ');
        assertEquals(5,cnt);
    }
    @Test
    public void testCharcountWithSpecialChar(){
        int cnt=testobj.charCount("Java is java again java again",'@');
        assertEquals(0,cnt);
    }
    @Test
    public void testCharcountWithRepeatedString(){
        int cnt=testobj.charCount("aaaaa",'a');
        assertEquals(5,cnt);
    }
    @Test
    public void testCharcountWithString(){
        int cnt=testobj.charCount("pushpitha",' ');
        assertEquals(0,cnt);
    }

}