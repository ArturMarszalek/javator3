package main.java.service;

import main.java.models.ItemsEnumerator;

import java.util.Random;
import java.util.Scanner;

public class PlayerService {
    private Scanner scanner = new Scanner(System.in);

    public ItemsEnumerator playerMove() throws Exception {
        System.out.println("----------------------------");
        System.out.println("-     CHOICE YOUR WEAPON   -");
        System.out.println("----------------------------");
        System.out.println("-1. ROCK                   -");
        System.out.println("-2. PAPER                  -");
        System.out.println("-3. SCISSOR                -");
        System.out.println("-Other. Exit               -");
        System.out.println("----------------------------");
        switch (scanner.nextInt()) {
            case 1:
                return ItemsEnumerator.ROCK;
            case 2:
                return ItemsEnumerator.PAPER;
            case 3:
                return ItemsEnumerator.SCISSOR;
        }
        throw new Exception();
    }

    public ItemsEnumerator AIMove() throws Exception {
        Random move = new Random();
        System.out.println("----------------------------");
        System.out.println("-         AI CHOICE        -");
        System.out.println("----------------------------");
        switch (move.nextInt(3) + 1) {
            case 1:

                return AIChoice(ItemsEnumerator.ROCK);
            case 2:

                return AIChoice(ItemsEnumerator.PAPER);
            case 3:

                return AIChoice(ItemsEnumerator.SCISSOR);
        }
        throw new Exception();
    }

    private ItemsEnumerator AIChoice(ItemsEnumerator item) {
        System.out.println("----------------------------");
        System.out.println("-         " + item + "      -");
        System.out.println("----------------------------");
        return item;
    }

    public String winnerIs(ItemsEnumerator player1, ItemsEnumerator player2) throws Exception {
        switch (ItemsEnumerator.compare(player1, player2)) {
            case -1:
                return "Player 2 Wins!";
            case 0:
                return "Draw";
            case 1:
                return "Player 1 Wins";
        }
        throw new Exception();
    }

}
