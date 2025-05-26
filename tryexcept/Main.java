package tryexcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class A implements Cloneable {
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class C {}
class D extends C {}

class AA {
    void abc() {
        try {
            bcd();
        } catch (ClassNotFoundException e) {
            System.out.println("(예외 전가)예외 발생");
        }
    }

    void bcd() throws ClassNotFoundException {
        Class cls = Class.forName("java.lang.Object1");
    }
}

public class Main {
    public static void main(String[] args) {

        AA aa = new AA();
        aa.abc();

        // 일반 예외 클래스
        // InterryptedException
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted Exception");
        }

        // ClassNotFoundException
        try {
            Class cls = Class.forName("java.lang.Object1");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        }

        // IOException
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            isr.read();
        } catch (IOException e) {
            System.out.println("IOException");
        }

        // FileNotFoundException
        try {
            FileInputStream fis = new FileInputStream("text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }

        // CloneNotSupportedException
        try {
            A a1 = new A();
            A a2 = (A)a1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException");
        }


        // 실행 예외 클래스
        // ArithmeticException
        try{
            System.out.println(3/0); // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        // ArithmeticException
        try {
            C c1 = new C();
            D d1 = (D)c1;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        // NumberFormatException
        try {
            int num = Integer.parseInt("10!!!");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        // NullPointerException
        try {
            String str = null;
            System.out.println(str.charAt(3));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

    }
}
