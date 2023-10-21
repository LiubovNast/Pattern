package org.example.material;

public class Rubber implements Material{
    @Override
    public void make(String figure) {
        System.out.println(figure + " made of rubber");
    }
}
