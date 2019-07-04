package com.stackroute.projectexercise_4;

public class CharCount {
        public int charCount(String input,char ch){
            String countchar=Character.toString(ch);//change character to String
            String temp=input.replaceAll(countchar,"");//replace the char in the string with ""
            int count=input.length()-temp.length(); //find the character count
            return count;
        }

}
