package org.example.util;

import org.example.domain.Player;
import org.example.domain.Variant;

public class Game {
    private final Player bot;
    private final Player user;

    public Game(Player user) {
        this.bot = new Player();
        this.user = user;
    }

    public String whoWins() {
        if (bot.getVariant() == user.getVariant()) {
            return "Ничья";
        }
        String winMessage = "Победил игрок с именем: ";
        winMessage = winMessage + switch (bot.getVariant()) {
            case ROCK -> user.getVariant() == Variant.PAPER ? user.getName() : bot.getName();
            case PAPER -> user.getVariant() == Variant.SCISSORS ? user.getName() : bot.getName();
            default -> user.getVariant() == Variant.ROCK ? user.getName() : bot.getName();
        };
        return winMessage;
    }
}
