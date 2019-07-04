package com.stackroute.projectexercise_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortParagraphTest {
    SortParagraph testobj;
    @Before
    public void setUp(){
        testobj=new SortParagraph();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void testSort(){
        String[] result=testobj.sortString("java is a platform independent programming language @");
        assertArrayEquals(new String[]{"@","a","independent","is","java","language","platform","programming"},result);
    }
    @Test
    public void testSortWithRepeatedString(){
        String[] result=testobj.sortString("App appleapple apple app");
        assertArrayEquals(new String[]{"App","app","apple","appleapple"},result);
    }
    @Test
    public void testSortWithSpaces(){
        String[] result=testobj.sortString(" ");
        assertArrayEquals(new String[]{},result);
    }

}