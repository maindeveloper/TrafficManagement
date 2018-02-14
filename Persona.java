package com.company.data;

public class Persona {

    private String nome;
    private String cognome;
    private int eta;
    private int soldi;


    public Persona(String nome, String cognome, int eta, int soldi) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.soldi = soldi;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getSoldi() {
        return soldi;
    }

    public void setSoldi(int soldi) {
        this.soldi = soldi;
    }

    public void acquistaBiglietto(int prezzoBiglietto, int soldiPersona){}

    public void convalida(Biglietto bigliettoGenerale, int giorno, int mese, int anno){}

}
