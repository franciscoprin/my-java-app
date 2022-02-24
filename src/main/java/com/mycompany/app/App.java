package com.mycompany.app;

class App 
{
    public static void main(String[] args) {
       App.myMeth(1);
       int c = App.sum(6, 2);
       System.out.println(c);
       int d = (int) App.multi(3, 4);
       System.out.println(d);
       int e = App.operation(3, 3);
       System.out.println(e);
    }

    static void myMeth(int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println("hello world");
        }       
    }
        
    private static int sum(int a, int b) {
        return a + b;
    }
    
    public static double multi(int a, int b) {
        return a * b;
    }

    private static int operation(int a, int b) {
        if(a==b){
            return a - b;
        }
        return a * b;
       
    }
    
}
