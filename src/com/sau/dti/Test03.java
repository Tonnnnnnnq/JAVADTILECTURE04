//Inheritance สืบทอด
//Polymerism
package com.sau.dti;

public class Test03 extends Test02 {
    public int dataB = 20;
    public void showHi(){
        System.out.println("Hi...");
    }
    @Override
    public void showHello(){
        System.out.println("Wow wow wow");
    }
}
