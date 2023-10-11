package org.example.filter;

public class GreenColored extends Filter {

    @Override
    void doBefore() {
        System.out.println("Toy will be green");
        getContext().add("color", "green");
    }

    @Override
    void doAfter() {
        System.out.println("Toy is green colored");
    }
}
