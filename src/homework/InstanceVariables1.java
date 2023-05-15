package homework;

public class InstanceVariables1 {
    /**
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */
    int a=10;
    int b =20;  // 1.1

    // following is instance method
    public void m1() { // 1.2
        System.out.println(a);
        System.out.println(b); // 1.3 called both instance variables in to instance method
    }

    public static void main(String[] args) { // 1.4 main method
        InstanceVariables1 p = new InstanceVariables1();
        p.m1(); // 1.5 object to call instance method


    }

}
