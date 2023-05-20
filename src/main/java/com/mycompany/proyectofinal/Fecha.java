package com.mycompany.proyectofinal;
import java.io.*;
import java.util.*;
public class Fecha {
    private short dd, mm, aa;
    
    public Fecha(){
        dd=0;
        mm=0;
        aa=0;
    }
    
    //Opcion n1
    public Fecha(short dd, short mm, short aa){
        this.dd=dd;
        this.mm=mm;
        this.aa=aa;
    }
    //Opcion n2
    //    public Fecha(short d, short m, short a){
    //       dd=d;
    //       mm=m; 
    //       aa=a;
    
    public short getDd(){
        return dd;
    }
    public short getMm(){
        return mm;
    }    
    public short getAa(){
        return aa;
    }
    public void setDd(short d){
        dd=d;
    }
    public void setMm(short m){
        mm=m;
    }
    public void setAa(short a){
        aa=a;
    }
 
    public String toString(){
        return dd+" "+mm+" "+aa;   
    }
    
}