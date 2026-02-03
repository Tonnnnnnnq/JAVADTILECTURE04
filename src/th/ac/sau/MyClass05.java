//Interface Class (เอาไป new ไม่ได้)
package th.ac.sau;

public interface MyClass05 {
    //data member ต้องเป็น static final เท่านั้น
    public static final int dataA = 100;
    public int dataB = 222;

    //abstract method member ได้เท่านั้น
    public abstract void showWow();
    public void showWoo();
}
