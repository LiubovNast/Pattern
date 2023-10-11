package org.example;

import org.example.command.DancingToy;
import org.example.command.SingingToy;
import org.example.entity.Context;
import org.example.entity.Toy;
import org.example.filter.GlowAdder;
import org.example.filter.GreenColored;
import org.example.filter.StampAdder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Toy toy = new Toy();
        DancingToy dancingToy = new DancingToy(toy);
        SingingToy singingToy = new SingingToy(toy);

        GlowAdder glow = new GlowAdder();
        GreenColored green = new GreenColored();
        StampAdder stamp = new StampAdder();

        green.nextChain(glow);
        glow.nextChain(stamp);
        green.execute(new Context(), singingToy);
    }
}
