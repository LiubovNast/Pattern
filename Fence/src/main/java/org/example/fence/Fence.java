package org.example.fence;

public class Fence {

    private final int width;

    public Fence(int width) {
        this.width = width;
    }

    public void count(int widthOfBoard) {
        System.out.printf("You need %d pieces, for this fence\n", width/widthOfBoard);
    }
}
