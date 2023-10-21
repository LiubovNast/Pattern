package org.example.figure;

import org.example.color.Color;
import org.example.material.Material;

public class Cube extends Figure{
    public Cube(Color color, Material material) {
        super(color, material);
    }

    @Override
    String getName() {
        return "Cube";
    }
}
