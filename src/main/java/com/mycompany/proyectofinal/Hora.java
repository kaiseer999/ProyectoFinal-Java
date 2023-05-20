
package com.mycompany.proyectofinal;
public class Hora {
    private short hh, mm, ss;

    public Hora() {
    }

    public Hora(short hh, short mm, short ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    public short getHh() {
        return hh;
    }

    public void setHh(short h) {
        hh = h;
    }

    public short getMm() {
        return mm;
    }

    public void setMm(short m) {
        mm = m;
    }

    public short getSs() {
        return ss;
    }

    public void setSs(short s) {
        ss = s;
    }
    
    
}
