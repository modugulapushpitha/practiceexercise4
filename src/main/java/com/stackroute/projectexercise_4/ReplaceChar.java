package com.stackroute.projectexercise_4;

public class ReplaceChar {
    public  String replaceString(String input){
        //convert character to String as replaceAll() accepts string only
        String temp=input.replaceAll(Character.toString('d'),Character.toString('f'));
        String output=temp.replaceAll(Character.toString('l'),Character.toString('t'));
        return output;
    }
}
/*Write a program to replace all d with f and all l with t in the given ​ String
Input: daily dry
Output: faity fry
Original ​ string​ : daily dry
New ​ String​ : faity fry*/