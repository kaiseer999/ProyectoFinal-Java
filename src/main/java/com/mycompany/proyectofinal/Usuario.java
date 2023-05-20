package com.mycompany.proyectofinal;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;

public class Usuario {
    private String nombre, ciudad_nacimiento, email, Password, tipo_us;
    private long tel, id;
    private Fecha fecha_nacimiento;
    private Direccion dir;
    
    public Usuario(){
    
    }
    
    public Usuario(String n, long id){
    
    }
    public String getNombre(){
        return nombre;
    }
    public long getId(){
        return id;
    }    
    public Fecha getFecha_nacimiento(){
        return fecha_nacimiento;
    }
    public String getCiudad_nacimiento(){
        return ciudad_nacimiento;
    }
    public long getTel(){
        return tel;
    }
    public String getEmail(){
        return email;
    }
    public Direccion getDir(){
        return dir;
    }
    public String getPassword(){
        return Password;
    } 

    public String getTipo_us() {
        return tipo_us;
    }

    public void setTipo_us(String t) {
        tipo_us=t;
    }
    
    
    public String toString(){
        return nombre+" "+id+" "+fecha_nacimiento+" "+ciudad_nacimiento+" "+tel+" "+email+" "+dir; 
    }
    
    public void setNombre(String n){
        nombre=n;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setFecha_nacimiento(Fecha f){
        fecha_nacimiento=f;
    }
    public void setCiudad_nacimiento(String c){
        ciudad_nacimiento=c;
    }
    public void setTel(long t){
        tel= t;
    }
    public void setEmail(String e){
        email=e;
    }
    public void setDir(Direccion d){
        dir=d;
    }
    public void setPassword(String p){
        Password=p;
    }
    
    public void toFile(String fileName){
        try{
            FileWriter output=new FileWriter(fileName);
            output.write(toString());
            output.close();
             System.out.println("El archivo " + fileName + " ha sido creado exitosamente.");
        
        }
        catch(IOException e){
            System.out.println("Ha ocurrido un error al crear el archivo " + fileName + ": " + e.getMessage());
        }
        
    }
    
    public void toImport(String fileName){
        try{
            FileReader input= new FileReader(fileName);
            BufferedReader lec= new BufferedReader(input);
            String S= lec.readLine();
            StringTokenizer token = new StringTokenizer(S);
            
            nombre = token.nextToken();
            id = Long.parseLong(token.nextToken());
            Fecha f= new Fecha(Short.parseShort(token.nextToken()),Short.parseShort(token.nextToken()),Short.parseShort(token.nextToken()));
            fecha_nacimiento = f;
            ciudad_nacimiento = token.nextToken();
            tel = Long.parseLong(token.nextToken());
            email = token.nextToken();
            Direccion d= new Direccion();
            d.setCalle(token.nextToken());
            d.setNomenclatura(token.nextToken());
            d.setBarrio(token.nextToken());
            d.setCiudad(token.nextToken());
            d.setEdificio(token.nextToken());
            d.setApto(token.nextToken());
            dir=d;
       
            input.close();
        }
        catch(IOException e){
            System.out.println("Error de lectura");
        
        }
        
//    public void toFile(String Datos, String texto){
//        try{
//            FileWriter output1 = new FileWriter("Datos.txt", true);
//            output1.write(toString()+ "\n");
//            output1.write(texto);
//            output1.close();
//        
//        }
//        catch(IOException e){
//            System.out.println("Error de escritura de archivo");
//        }
//        
//    }

    }
    
}