package com.mycompany.proyectofinal;
import java.io.*;
import java.util.*;
public class Direccion {
    private String calle, nomenclatura, barrio, ciudad, edificio, apto;
    
    public Direccion(){
    }
    
    public String getCalle(){
        return calle;
    }
    public String getNomenclatura(){
        return nomenclatura;
    }
    public String getBarrio(){
        return barrio;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getEdificio(){
        return edificio;
    }
    public String getApto(){
        return apto;
    }
    
    public String toString() {
        return calle+" "+nomenclatura+" "+barrio+" "+ciudad+" "+edificio+" "+apto;
    }
    
    public void setCalle(String c){
        calle=c;
    }
    public void setNomenclatura(String n){
        nomenclatura=n;
    }
    public void setBarrio(String b){
        barrio=b;
    }
    public void setCiudad(String ci){
        ciudad=ci;
    }
    public void setEdificio(String e){
        edificio=e;
    }
    public void setApto(String a){
        apto=a;
    }
    
    
    
}
