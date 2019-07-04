package com.stackroute.projectexercise_4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurences {
    public List<String> multiplematch(String input, String pat) {
        String output = "";
        List<String> list = new ArrayList<String>();
        Pattern pattern = Pattern.compile(pat);//create a pattren to search
        Matcher matcher = pattern.matcher(input);//search the above pattren in input string
            while (matcher.find()) {
                output = "Found at: " + matcher.start() +
                        " - " + (matcher.end());
                list.add(output);//add elements into list
            }
            matcher=matcher.reset();//reset the matcher to starting of the string
            if(matcher.find()) {
                return list;
            }
         else {
            return null;
        }

    }
}
