package org.example.figure;

import org.example.color.Color;
import org.example.material.Material;

public abstract class Figure {
    protected Color color;
    protected Material material;

    public Figure(Color color, Material material) {
        this.color = color;
        this.material = material;
    }
    abstract String getName();

    public void howColored(){
        color.colored(getName());
    }

    public void fromWhatMaterial(){
        material.make(getName());
    }
}
