package org.example.command;

import org.example.entity.Toy;

public class DancingToy implements ToyCommand{

    private Toy toy;

    public DancingToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void execute() {
        toy.dance();
    }
}
