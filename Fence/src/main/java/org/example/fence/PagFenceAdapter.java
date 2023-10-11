package org.example.fence;

public class PagFenceAdapter extends Board {

    private Pag pag;

    public PagFenceAdapter(Pag pag) {
        this.pag = pag;
    }

    @Override
    public int getWidth() {
        return pag.getRadius() * 2;
    }
}
