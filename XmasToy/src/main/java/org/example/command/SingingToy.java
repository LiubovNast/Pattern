package org.example.command;

import org.example.entity.Toy;

public class SingingToy implements ToyCommand{
    private Toy toy;

    public SingingToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void execute() {
        toy.sing();
    }
}
