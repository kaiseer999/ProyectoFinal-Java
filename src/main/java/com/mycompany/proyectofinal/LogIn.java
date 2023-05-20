
package com.mycompany.proyectofinal;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LogIn {
    
    private long Id;
    private String password;
    private DoubleList registroE, registroP;
    
    
    public LogIn(){
    
        Id=0;
        password=null;
        registroE = new DoubleList();
        registroP = new DoubleList();
    
    }
    
    public void ImportE(String fileName){
    
        try{
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;     
        DoubleNode temp = registroE.first();
        while ((line = br.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            Usuario usuario = new Usuario();
            
            usuario.setNombre(tokenizer.nextToken());
            System.out.println("Nombre del usuario: " + usuario.getNombre());
            usuario.setId(Long.parseLong(tokenizer.nextToken()));
            System.out.println("ID del usuario: " + usuario.getId());
            Fecha f = new Fecha(Short.parseShort(tokenizer.nextToken()),Short.parseShort(tokenizer.nextToken()),Short.parseShort(tokenizer.nextToken()));
            usuario.setFecha_nacimiento(f);
            System.out.println("Fecha de nacimiento del usuario: " + usuario.getFecha_nacimiento());
            usuario.setCiudad_nacimiento(tokenizer.nextToken());
            System.out.println("Ciudad de nacimiento del usuario: " + usuario.getCiudad_nacimiento());
            usuario.setTel(Long.parseLong(tokenizer.nextToken()));
            System.out.println("Numero de telefono del usuario: " + usuario.getTel());
            usuario.setEmail(tokenizer.nextToken());
            System.out.println("Correo electronico del usuario: " + usuario.getEmail());
            Direccion d = new Direccion();
                d.setCalle(tokenizer.nextToken());
                d.setNomenclatura(tokenizer.nextToken());
                d.setBarrio(tokenizer.nextToken());
                d.setCiudad(tokenizer.nextToken());
                d.setEdificio(tokenizer.nextToken());
                d.setApto(tokenizer.nextToken());
                usuario.setDir(d);
                System.out.println("Direccion del usuario: " + usuario.getDir());
                
            
            registroE.addFirst(usuario);
            System.out.println("Usuario agregado.");
            
            System.out.println("**********************"+ "\n");
            
        }

         
        System.out.println("El archivo fue importado con exito.");

        br.close();
        }
        catch(IOException e){
            System.out.println("Ha ocurrido un error al crear el archivo " + fileName + ": " + e.getMessage());
        }
    }
    
     public void ImportP(String fileName){
    
        try{
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;     
        DoubleNode temp = registroP.first();
        while ((line = br.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            Usuario Password = new Usuario();
           
            Password.setId(Long.parseLong(tokenizer.nextToken()));
            System.out.println("ID del usuario: " + Password.getId());
            Password.setPassword(tokenizer.nextToken());
            System.out.println("Nombre del usuario: " + Password.getPassword());
            Password.setTipo_us(tokenizer.nextToken());
            System.out.println("Nombre del usuario: " + Password.getTipo_us());  
            
            registroP.addFirst(Password);
            System.out.println("Contraseña agregada.");
            
            System.out.println("**********************"+ "\n");
            
        }
        System.out.println("El archivo fue importado con exito.");

        br.close();
        }
        catch(IOException e){
            System.out.println("Ha ocurrido un error al crear el archivo " + fileName + ": " + e.getMessage());
        }
    }
    
    public boolean Ingresar(long i, String p) {
        DoubleNode n = registroE.first();

        if (registroE.isEmpty()) {
            return false;
        } else {
            while (n != null) {
                if (i == ((Usuario) n.getData()).getId() && p==(((Usuario) n.getData()).getPassword())) {
                    System.out.println("Ingreso exitoso como empleado.");
                    return false;
                }
                n = n.getNext();
            }

            if (2345902 == i && "c4100l485Cal$".equals(p)) {
                System.out.println("Ingreso exitoso como administrador.");
                return true;
            }
        }
        System.out.println("ID o contraseña incorrecta.");
        return false;
    }
}
    
    
    

