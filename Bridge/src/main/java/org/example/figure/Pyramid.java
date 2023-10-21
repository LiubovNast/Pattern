package org.example.figure;

import org.example.color.Color;
import org.example.material.Material;

public class Pyramid extends Figure{
    public Pyramid(Color color, Material material) {
        super(color, material);
    }

    @Override
    String getName() {
        return "Pyramid";
    }
}
