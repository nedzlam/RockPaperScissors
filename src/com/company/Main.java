package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<RockPaperScissors> rockPaperScissors = new ArrayList<>();
        rockPaperScissors.add(new RockPaperScissors(0, "kamen"));
        rockPaperScissors.add(new RockPaperScissors(1, "makaze"));
        rockPaperScissors.add(new RockPaperScissors(2, "papir"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 0-2");
        int userNumber, computerNumber;
        userNumber = scanner.nextInt();
        Random random = new Random();
        computerNumber = random.nextInt(3);
        System.out.println("\nUser Number: " +rockPaperScissors.get(userNumber).getNumber() + " - " +rockPaperScissors.get(userNumber).getMeaning());
        System.out.println("Computer Number: " +rockPaperScissors.get(computerNumber).getNumber() + " - " +rockPaperScissors.get(computerNumber).getMeaning());

            if (userNumber == computerNumber) System.out.println("THERE IS NO WINNER!");
            else if(userNumber == rockPaperScissors.get(0).getNumber() && computerNumber == rockPaperScissors.get(2).getNumber()){
            System.out.println("COMPUTER IS WINNER :(");}
            else if(computerNumber == rockPaperScissors.get(0).getNumber() && userNumber == rockPaperScissors.get(2).getNumber()){
                System.out.println("USER IS WINNER :)");}
            else if(userNumber == rockPaperScissors.get(1).getNumber() & computerNumber == rockPaperScissors.get(2).getNumber()){
                System.out.println("USER IS WINNER :)");}
            else if(computerNumber == rockPaperScissors.get(1).getNumber() & userNumber == rockPaperScissors.get(2).getNumber()){
            System.out.println("COMPUTER IS WINNER :(");}
            else if(userNumber == rockPaperScissors.get(1).getNumber() && computerNumber == rockPaperScissors.get(0).getNumber()){
                System.out.println("COMPUTER IS WINNER :(");
            }
            else if(computerNumber == rockPaperScissors.get(1).getNumber() && userNumber == rockPaperScissors.get(0).getNumber()){
                System.out.println("USER IS WINNER :)");
            }
    }
}
