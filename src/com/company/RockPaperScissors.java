package com.company;

public class RockPaperScissors {
    int number;
    String meaning;

    RockPaperScissors (int number, String meaning) {
        this.number = number;
        this.meaning = meaning;
    }

    public int getNumber(){
        return number;
    }

    public String getMeaning(){
        return meaning;
    }
}
