package homework;

public class TwoInstanceStatic4 {
    /**
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme.
     */
    int a = 25;
    int b = 30; //4.1
    static int c = 40;
    static int d = 50; //4.1.1

    public void i2(){  // 4.2
        System.out.println(a); //4.4
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    public static void s2(){ // 4.3
 TwoInstanceStatic4 t= new TwoInstanceStatic4(); //4.4
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) { //4.5
        s2();
        TwoInstanceStatic4 obj = new TwoInstanceStatic4(); //4.6
        obj.i2();
    }

}
