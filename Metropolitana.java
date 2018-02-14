package com.company.tpl;

import com.company.data.Biglietto;
import com.company.util.MezzoDiTrasportoInt;
import com.company.util.Orari;

public class Metropolitana implements MezzoDiTrasportoInt,Orari {

    private int numeroDiPosti=50;
    private int numeroMetro, oraInizio, minutiInizio;

    public Metropolitana(){}

    public Metropolitana(int numeroDiPosti){

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




    public boolean ritardo(int numeroMetro){
        return true;
        //stampa ci scusiamo per il disagio! lol
    }

    public int getNumeroMetro() {
        return numeroMetro;
    }

    public void setNumeroMetro(int numeroMetro) {

    }

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
