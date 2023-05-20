package com.mycompany.proyectofinal;
public class List {
    private Node head, tail;
    private int size;
    
    public List(){
        head=null;
        tail=null;
        size=0;
    }
    
    public int size(){
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public Node First(){
        return head;
    }
    
    public Node Last(){
        return tail;
    }
    
    public void addFirst(Object e){
        Node n= new Node(e);
        if(isEmpty()){
            head=n;
            tail=n;
        }else{
            n.setNext(head);
            head=n;
        }
        size++;
    }
    
    public void addLast(Object e){
        Node n=new Node(e);
        if(isEmpty()){
            head=n;
            tail=n;
        }else{
            tail.setNext(n);
            tail=n;
        }
        size++;
    }
    
    public Object removeFirst(){
        if(isEmpty()){
            return null;
        }else{
            Object temp = head.getData();
            Node n=head;
            head= head.getNext();
            n.setNext(null);
            size--;
            return temp;
        }
    }
    
    public Object removeLast(){
        if(size <=1){
            return removeFirst();
        }else{
            Object temp = tail.getData();
            Node anterior =head;
            while(anterior.getNext()!=tail){
                anterior=anterior.getNext();
            }
            anterior.setNext(null);
            tail=anterior;
            size--;
            return temp;
        }
    
    }
    
}
