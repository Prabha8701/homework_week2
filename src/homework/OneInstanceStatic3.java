package homework;

public class OneInstanceStatic3 {

    /**
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the programme.
     */
    int a = 100;
    static int b = 200; // one instance and one static variable.

    public static void s1(){
        OneInstanceStatic3 s = new OneInstanceStatic3();
        System.out.println(s.a);
        System.out.println(b);

    }
    public void i1(){
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        s1();
        OneInstanceStatic3 m = new OneInstanceStatic3();
        m.i1();

    }
}
