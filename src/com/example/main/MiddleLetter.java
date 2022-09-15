package com.example.main;

public class MiddleLetter {
    String word;
    public MiddleLetter(String word) {
        this.word = word;
    }

    public String middleText(){
        if(evenLength()){
            return evenMiddleText();
        }
        return oddMiddleText();
    }

    public String evenMiddleText(){
        return word.substring(word.length()/2-1,word.length()/2+1);
    }

    public int oddWordStartLength(){
        return word.length()/2;

    }

    public String oddMiddleText(){
        return word.substring(oddWordStartLength(),oddWordEndLength());
    }

    public boolean evenLength() {
        return this.word.length() % 2 == 0;
    }

    public int oddWordEndLength() {
        return word.length()/2+1;
    }
}
