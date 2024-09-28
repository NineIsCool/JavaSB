package org.example.domain;

public class Player {
    private Variant variant;
    private String name;

    public Player(Variant variant, String name) {
        this.variant = variant;
        this.name = name;
    }

    public Variant getVariant() {
        return variant;
    }

    public String getName() {
        return name;
    }

    public Player() {
        this.variant = Variant.getRandom();
        this.name = "bot";
    }
}
