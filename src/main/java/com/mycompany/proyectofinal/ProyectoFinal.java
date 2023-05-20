package com.mycompany.proyectofinal;
import javax.swing.JOptionPane;

public class ProyectoFinal {

    public static void main(String[] args) {
        LogIn u= new LogIn();
        String nomEmp = "Empleados.txt", nomPas="Password.txt";
        
        u.ImportE(nomEmp);
        u.ImportP(nomPas);
        
        long id = Long.parseLong(JOptionPane.showInputDialog(null, "ingrese id"));
        String pas = JOptionPane.showInputDialog(null, "ingrese contraseña");
        
        u.Ingresar(id, pas);
    }
}
