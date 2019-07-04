package com.stackroute.projectexercise_4;

public class TransposeOfString {
        public String reverseStr (String input){
            String output = "";
            String[] array = input.split(" ");//split a string using spaces
            String word;
            for (int i = 0; i < array.length; i++) {
                word = array[i];
                output = output +reverseWord(word)+" ";//call another method to reverse the word
            }
            return output.trim();
        }
        public String reverseWord (String word){//method to reverse a string
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);

            }
            return reverse;
        }
}