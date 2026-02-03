package ai.sau;

public class Dti02 {
    public static void met1(){
        Dti01.show1();
        Dti01.show3();
        System.out.println(Dti01.dataA);

        Dti01 obA = new Dti01();
        obA.show1();
        obA.show2();
        obA.show3();
        obA.show4();
        System.out.println(obA.dataA);
        System.out.println(obA.dataB);
    }

    public void met2(){
        Dti01.show1();
        Dti01.show3();
        System.out.println(Dti01.dataA);
    }

}
