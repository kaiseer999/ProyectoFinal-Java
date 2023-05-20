
package com.mycompany.proyectofinal;


public class DoubleList {
    
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleList() {
        
        head=null;
        tail=null;
        size=0;
        
    }

    
    public int size(){
        
        return size;
    }
    
    public boolean isEmpty(){

        return size==0;
    
    }
    
    public DoubleNode first(){
    
        return head;
    
    }
    
    public DoubleNode last(){
    
        return tail;
        
    }
    
    public void addFirst(Object e){
    
        DoubleNode n = new DoubleNode(e);
            if(isEmpty()){
                head=n;
                tail=n;
            
            }else{
                n.setNext(head);
                head.setPrev(n);
                head=n;
            }
    
            size++;   
    }
    
    
    
    
    public void addLast(Object e){
        
        DoubleNode n = new DoubleNode(e);
            if(isEmpty()){
            
                head=n;
                tail=n;
            }else{
            
                tail.setNext(n);
                n.setPrev(tail);
                tail=n;
            }
    
            size++;
               
    }
    
    public Object removeFirst(){
    
        if(isEmpty()){
            return null;
        }else{
            DoubleNode tem= head;
            head= tem.getNext();
            tem.setNext(null);
            tem.setPrev(null);
            size--;
            return (Object)tem.getData();
        }
    }
    
    public Object removeLast(){
    
        if(!isEmpty()){
        
            Object tem = tail.getData();
            DoubleNode anterior = tail.getPrev();
            anterior.setNext(null);
            tail.setPrev(null);
            tail= anterior;
            size--;
                return tem;
      
        }else{
        
            return null;
        }
    }
    
    public Object remove(DoubleNode n){
    
        if(isEmpty()){
            return null;
        }
    
        if(n==head){
            return removeFirst();
        }
    
        if(n==tail){
        
            return removeLast();
        }
    
     DoubleNode anterior = n.getPrev();
     DoubleNode siguiente = n.getNext();
     anterior.setNext(siguiente);
     siguiente.setPrev(anterior);
     n.setNext(null);
     n.setPrev(null);
     size--;
        return n.getData();
     
    }
    
    public void addBefore(DoubleNode n, Object e) {
    if (isEmpty() || n == head) {
        addFirst(e);
    } else {
        DoubleNode m = new DoubleNode(e);
        DoubleNode previous = n.getPrev();
        m.setNext(n);
        m.setPrev(previous);
        previous.setNext(m);
        n.setPrev(m);
        size++;
    }
}

public void addAfter(DoubleNode n, Object e) {
    if (isEmpty() || n == tail) {
        addLast(e);
    } else {
        DoubleNode m = new DoubleNode(e);
        DoubleNode next = n.getNext();
        m.setPrev(n);
        m.setNext(next);
        n.setNext(m);
        next.setPrev(m);
        size++;
    }
}

    
    
    
}
