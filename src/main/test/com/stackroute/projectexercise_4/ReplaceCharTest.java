package com.stackroute.projectexercise_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {
    ReplaceChar testobj;
    @Before
    public void setUp(){
        testobj=new ReplaceChar();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void testReplaceChar(){
        String output=testobj.replaceString("daily dry");
        assertEquals("faity fry",output);
    }
    @Test
    public void testString(){
        String output=testobj.replaceString("pushpitha");
        assertEquals("pushpitha",output);
    }
    @Test
    public void testRepeatedString(){
        String output=testobj.replaceString("ddddd");
        assertEquals("fffff",output);
    }
    @Test
    public void testEmptyString(){
        String output=testobj.replaceString("");
        assertEquals("",output);
    }
    @Test
    public void testPattern(){
        String output=testobj.replaceString("dldldl");
        assertEquals("ftftft",output);
    }



}