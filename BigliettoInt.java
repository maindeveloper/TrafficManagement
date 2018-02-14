package com.company.util;

import com.company.data.Biglietto;

public interface BigliettoInt {

    public boolean validita(Biglietto bigliettoGenerale, int giorno, int mese, int anno);
    public void prezzo(int km, Biglietto bigliettoGenerico);

}
