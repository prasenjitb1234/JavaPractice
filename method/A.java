package com.method;

class A{
    
    // instance variable
    int a = 10;
    // static variable
    static int b = 20;
    
    public static void main (String[] args) {
        
        A r = new A();
        A.Show();
        r.Disp();
    }
    static void Show(){
        
        System.out.println(b);
        
    }
    void Disp(){
        
        System.out.println(a+" "+b);
    }
    
}