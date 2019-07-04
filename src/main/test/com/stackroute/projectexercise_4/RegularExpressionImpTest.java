package com.stackroute.projectexercise_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionImpTest {
    RegularExpressionImp testobj;
    @Before
    public void setUp(){
        testobj=new RegularExpressionImp();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void testString(){
        String result=testobj.matchstring("This is Harry");
        assertEquals("Is Harry here ?true",result);
    }
    @Test
    public void testStringFailure(){
        String result=testobj.matchstring("This is Henry");
        assertNotEquals("Is Harry here ?true",result);
    }
    @Test
    public void testStringWithOutSpaces(){
        String result=testobj.matchstring("ThisisHarry");
        assertEquals("Is Harry here ?true",result);
    }
    @Test
    public void testStringWithLowerCase(){
        String result=testobj.matchstring("Thisisharry");
        assertNotEquals("Is Harry here ?true",result);
    }
    @Test
    public void testStringWithSpace(){
        String result=testobj.matchstring(" ");
        assertEquals("Is Harry here ?false",result);
    }


}