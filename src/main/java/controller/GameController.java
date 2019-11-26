package main.java.controller;


import main.java.service.PlayerService;

import java.util.Scanner;

public class GameController {
    private PlayerService playerService = new PlayerService();

    private void PvALoop() {
        while (true) {
            try {
                System.out.println(playerService.winnerIs(playerService.playerMove(), playerService.AIMove()));
            } catch (Exception ignored) {
                break;
            }
        }
    }

    private void PvPLoop() {
        while (true) {
            try {
                System.out.println(playerService.winnerIs(playerService.playerMove(), playerService.playerMove()));
            } catch (Exception ignored) {
                break;
            }
        }
    }

    public void gameLoop() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("-   CHOSE GAME MODE:       -");
        System.out.println("-   1. PLAYER VS AI        -");
        System.out.println("-   2. PLAYER VS PLAYER    -");
        System.out.println("-   Other. TO EXIT         -");
        System.out.println("----------------------------");
        switch (scanner.nextInt()) {
            case 1:
                PvALoop();
                break;
            case 2:
                PvPLoop();
                break;
            default:
                throw new Exception();
        }
    }
}
