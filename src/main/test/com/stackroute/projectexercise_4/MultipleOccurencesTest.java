package com.stackroute.projectexercise_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MultipleOccurencesTest {
    MultipleOccurences testobj;
    @Before
    public void setUp(){
        testobj=new MultipleOccurences();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void CheckMultipleOccurences(){ //check for a string
        List<String> result=testobj.multiplematch("She sells seashells by the seashore","se");
        List<String > list =new ArrayList<>();
        list.add("Found at: 4 - 6");
        list.add("Found at: 10 - 12");
        list.add("Found at: 27 - 29");
        assertEquals(list,result);
    }
    @Test
    public void CheckMultipleOccurencesWithOutSpaces(){ //check for a string with out spaces
        List<String> result=testobj.multiplematch("Shesellsseashellsbytheseashore","se");
        List<String > list =new ArrayList<>();
        list.add("Found at: 3 - 5");
        list.add("Found at: 8 - 10");
        list.add("Found at: 22 - 24");
        assertEquals(list,result);
    }
    @Test
    public void CheckMultipleOccurencesSpaces(){ //check for space occurences in a string
        List<String> result=testobj.multiplematch("She sells seashells by the seashore"," ");
        List<String > list =new ArrayList<>();
        list.add("Found at: 3 - 4");
        list.add("Found at: 9 - 10");
        list.add("Found at: 19 - 20");
        list.add("Found at: 22 - 23");
        list.add("Found at: 26 - 27");
        assertEquals(list,result);
    }

}