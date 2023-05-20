package com.mycompany.proyectofinal;
public class MensajeCorreo {
    private long IdRem;
    private Fecha FechaRecep;
    private Hora HoraMen;
    private String AsuntoMen, CuerpoMen;
    
    public MensajeCorreo(){
    }

    public MensajeCorreo(long IdRem, String AsuntoMen) {
        this.IdRem = IdRem;
        this.AsuntoMen = AsuntoMen;
    }

    public long getIdRem() {
        return IdRem;
    }

    public void setIdRem(long IdRem) {
        this.IdRem = IdRem;
    }

    public Fecha getFechaRecep() {
        return FechaRecep;
    }

    public void setFechaRecep(Fecha FechaRecep) {
        this.FechaRecep = FechaRecep;
    }

    public Hora getHoraMen() {
        return HoraMen;
    }

    public void setHoraMen(Hora HoraMen) {
        this.HoraMen = HoraMen;
    }

    public String getAsuntoMen() {
        return AsuntoMen;
    }

    public void setAsuntoMen(String AsuntoMen) {
        this.AsuntoMen = AsuntoMen;
    }

    public String getCuerpoMen() {
        return CuerpoMen;
    }

    public void setCuerpoMen(String CuerpoMen) {
        this.CuerpoMen = CuerpoMen;
    }


    public String toString() {
        return IdRem +" "+ FechaRecep +" "+ HoraMen +" "+ AsuntoMen +" "+ CuerpoMen;
    }
    
    
    
    
    
    
}
