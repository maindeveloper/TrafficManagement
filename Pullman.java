package com.company.tpl;

import com.company.data.Biglietto;
import com.company.util.MezzoDiTrasportoInt;
import com.company.util.Orari;

public class Pullman implements MezzoDiTrasportoInt,Orari {

    private int numeroDiPosti=50;
    private int oraInizio, minutiInizio;

    public Pullman(){}

    public Pullman(int numeroDiPosti) {

    }



    @Override
    public void stato(int numeroDiPosti) {

    }

    @Override
    public void fermata() {

    }

    @Override
    public void guasto() {

    }

    @Override
    public void tragitto() {

    }

    @Override
    public void avanti() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean validita(Biglietto bigliettoGenerale, int giorno, int mese, int anno) {
        return false;
    }

    @Override
    public void prezzo(int km, Biglietto bigliettoGenerico) {

    }

    @Override
    public void orarioInizioServizio() {

    }

    @Override
    public void orarioFineServizio() {

    }




    public boolean rifornimento() {
        return false;
    }

    public void controllore(){/*richiama validita' sul biglietto di tutte le persone, se non e' valido richiama multa*/}

    public void multa(){}

    public int getOraInizio() {
        return oraInizio;
    }

    public void setOraInizio(int oraInizio) {
        this.oraInizio = oraInizio;
    }

    public int getMinutiInizio() {
        return minutiInizio;
    }

    public void setMinutiInizio(int minutiInizio) {
        this.minutiInizio = minutiInizio;
    }


}
