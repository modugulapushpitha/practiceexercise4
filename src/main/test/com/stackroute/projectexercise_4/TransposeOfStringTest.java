package com.stackroute.projectexercise_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfStringTest {
    TransposeOfString testobj;
    @Before
    public void setUp(){
        testobj=new TransposeOfString();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void testTransposeString(){
        String result=testobj.reverseStr("a quick brown");
        assertEquals("a kciuq nworb",result);
    }
    @Test
    public void testTransposeSpace(){
        String result=testobj.reverseStr("              ");
        assertEquals("",result);
    }
    @Test
    public void testTransposePalindrome(){
        String result=testobj.reverseStr("madam");
        assertEquals("madam",result);
    }
    @Test
    public void testTransposeStringWithoutSpaces(){
        String result=testobj.reverseStr("aquickbrownfoxjumpsoverthelazydog");
        assertEquals("godyzalehtrevospmujxofnworbkciuqa",result);
    }

}