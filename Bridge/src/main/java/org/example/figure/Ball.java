package org.example.figure;

import org.example.color.Color;
import org.example.material.Material;

public class Ball extends Figure{
    public Ball(Color color, Material material) {
        super(color, material);
    }

    @Override
    String getName() {
        return "Ball";
    }
}
