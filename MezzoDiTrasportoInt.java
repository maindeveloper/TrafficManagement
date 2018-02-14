package com.company.util;

public interface MezzoDiTrasportoInt extends BigliettoInt {

    public void stato(int numeroDiPosti);
    public void fermata();
    public void guasto();
    public void tragitto();
    public void avanti();
    public void stop();

}
