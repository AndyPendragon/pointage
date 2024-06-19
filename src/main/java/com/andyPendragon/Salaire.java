package com.andyPendragon;

public final class Salaire {
    private final int brut;
    private final int net;

    public int getBrut() { return brut; }

    public int getNet() { return net; }

    public Salaire(int brut) {
        this.brut = brut;

        double tauxImpotsSurLeRevenue = 0.2;
        this.net = (int) (brut - (brut * tauxImpotsSurLeRevenue));
    }
}
