package homework;

public class AreaPeriRec14 {
    /**
     * a Java program to print the area and perimeter of a rectangle.
     */
    public void apr() {
        float ar =  (float)(5.6 * 8.5);
        float pr = (float) (2 * (5.6 + 8.5));
        System.out.println("Area is 5.6 * 8.5 = " + ar);
        System.out.println("Perimeter is 2 * (5.6 + 8.5) =  " + pr);
    }

    public static void main(String[] args) {
        AreaPeriRec14 obj = new AreaPeriRec14();
        obj.apr();
    }
}
