package org.example;

import org.example.domain.Player;
import org.example.domain.Variant;
import org.example.util.Game;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(Variant.PAPER, "alex");
        Game game = new Game(player);
        System.out.println(game.whoWins());
    }
}