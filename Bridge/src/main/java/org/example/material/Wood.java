package org.example.material;

public class Wood implements Material{
    @Override
    public void make(String figure) {
        System.out.println(figure + " made of wood.");
    }
}
