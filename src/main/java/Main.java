package main.java;

import main.java.controller.GameController;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        try {
            gameController.gameLoop();
        } catch (Exception ignore) {
            System.out.println("BYE BYE");
        }
    }

}
