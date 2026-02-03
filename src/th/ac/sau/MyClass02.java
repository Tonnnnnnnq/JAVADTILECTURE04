//Abstract Class
//คลาสที่เป็น abstract เอาไป new ไม่ได้
package th.ac.sau;

public abstract class MyClass02 {
    //data member
    public int dataB;

    //method member
    public void showHi(){
        System.out.println("Hi...");
    }

    //abstract method member
    public abstract void showHey();

    public abstract void showHum();
}
