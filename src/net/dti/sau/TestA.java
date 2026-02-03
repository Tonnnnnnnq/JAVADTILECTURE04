package net.dti.sau;

public class TestA {
    public int aa = 10;

    public void showHi(){
        //this.(); Error
    }
    public TestA(){
        System.out.println(111);
    }

    public TestA(int data1){
        System.out.println(data1);
        this(123.456);
    }

    public TestA(double data2){
        this();
        //this(555); Error
        System.out.println(data2);
    }
}
