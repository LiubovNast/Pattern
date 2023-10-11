package org.example.filter;

public class GlowAdder extends Filter{

    @Override
    void doBefore() {
        System.out.print("Toy is glowing. ");
        colorGlowing();
    }

    private void colorGlowing() {
        if (getContext().get("color")!= null) {
            System.out.printf("Color glowing is %s.",getContext().get("color"));
        }
        System.out.println("");
    }

    @Override
    void doAfter() {
        System.out.println("Toy stopped glowing.");
    }
}
