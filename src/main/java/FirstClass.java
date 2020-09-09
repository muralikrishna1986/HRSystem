import static javafx.scene.input.KeyCode.T;

public class FirstClass {
    public static void main(String[] args){
        System.out.println("Testing first code in intellij");
        System.out.println("it is working");
        TestMethod(10,20);
    }

    /**
     * @param a first value
     * @param b second value
     */
    public static void TestMethod(int a,int b){
        int c=a+b;
        System.out.println("Value a+b is "+c);
    }
}