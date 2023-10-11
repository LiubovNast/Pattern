package org.example;

import org.example.fence.Board;
import org.example.fence.Fence;
import org.example.fence.Pag;
import org.example.fence.PagFenceAdapter;

/**
 * You can build fence only if you know width of board.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fence fence = new Fence(100);
        Board board = new Board(15);

        fence.count(board.getWidth());

        Pag pag = new Pag(15);
        PagFenceAdapter adapter = new PagFenceAdapter(pag);

        fence.count(adapter.getWidth());
    }
}
