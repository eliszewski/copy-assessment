package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public boolean isPal(String str){
        StringBuilder sb = new StringBuilder(str).reverse();
        if(sb.toString().equals(str)){
            return true;
        }else {
            return false;
        }
    }

    public Integer countPalindromes(String input){ //aaa
        String current = "";
        int palCounter = 0;
        for(int i = 0; i < input.length(); i++){
            for(int j = i + 1; j<=input.length(); j++){ // i never reaches length
                if(isPal(input.substring(i,j))){
                     //compares all substrings starting from i
                    palCounter++;
                }
            } //maybe a better time complexity can be achieved
        }


        return palCounter;
    }
}
