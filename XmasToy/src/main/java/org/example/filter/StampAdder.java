package org.example.filter;

public class StampAdder extends Filter {

    @Override
    void doBefore() {
        System.out.println("Stamp will be add");
    }

    @Override
    void doAfter() {
        System.out.println("Toy already has a stamp");
    }
}
