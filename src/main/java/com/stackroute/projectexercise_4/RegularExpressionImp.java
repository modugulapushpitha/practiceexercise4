package com.stackroute.projectexercise_4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpressionImp {
    public String matchstring(String input){
        Pattern pattern=Pattern.compile("Harry");//create a pattren to search
        Matcher matcher=pattern.matcher(input);//search the above pattren in string
        boolean result=matcher.find();
        return "Is Harry here ?"+result; //return thr result
    }
}
