package net.dti.sau;

public class TestB extends TestA {

    public TestB(){
        super(156);
        //super(); Error
        System.out.println(333);
    }

    public TestB(int x, int y){
        System.out.println(444);
        super();
    }

}