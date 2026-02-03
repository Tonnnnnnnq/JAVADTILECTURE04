package ai.sau;

public class Dti01 {
    //static member
    public static int dataA = 10;
    public int dataB = 20;

    //static method member
    public static void show1(){
        System.out.println(111);
    }
    public void show4(){
        System.out.println(444);
    }

    public void show2(){
        System.out.println(222);
        show4(); show1(); show3();
        System.out.println(dataB);
        System.out.println(dataA);
    }

    public static void show3(){
        System.out.println(333);
        show1();
        System.out.println(dataA);
        //show2(); Error
        //System.out.println(dataB); Error
    }
}
