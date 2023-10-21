package org.example.material;

public class Iron implements Material{
    @Override
    public void make(String figure) {
        System.out.println(figure + " made of iron.");
    }
}
