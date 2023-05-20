
package com.mycompany.proyectofinal;
public class Correo {
    private Usuario empleado;
    private DoubleList mensajeLeido;
    private Stack borrador;
    private DoubleList bandeja;

    public Correo() {
        DoubleList bandeja= new DoubleList();
        DoubleList mensajeLeido= new DoubleList();
        Stack borrador= new Stack();
        
    }
    
    public Object BuscarMensaje(long id){
        if(!bandeja.isEmpty()){
            DoubleNode temp = bandeja.first();
            while(temp!= null && id!=((Usuario)temp.getData()).getId()){
                temp=temp.getNext();
            }
            if(temp==null){
                return null;
            }else{
                return temp.getData();
            }
        }else{
            return null;
        }
    }
    
    
    public void CrearMensaje(MensajeCorreo m){
    
    
    }
    
    public void LeerMensaje(MensajeCorreo m) {
       boolean encontrado = false;
       DoubleNode temp = bandeja.first();

       while (temp != null) {
           if (((MensajeCorreo) temp.getData()).getIdRem() == m.getIdRem()) {
               encontrado = true;
               break;
           }
           temp = temp.getNext();
       }

       if (encontrado) {
           bandeja.remove(temp);
           mensajeLeido.addFirst(temp.getData());
       }
   }

    
    
}
