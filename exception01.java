import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class A implements Cloneable {
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class exception01{
    public static void main(String[] args){
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("InterruptedException");

        }
        try {
            Class<?> cls = Class.forName("non.existent.ClassName");
        }
        catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException");
        }
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            isr.read();
        }
        catch(IOException e){
            System.out.println("IOException");
        }
        try {

            FileInputStream fis = new FileInputStream("text.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }
        try{
            A a1 = new A();
            A a2 = (A)a1.clone();

        }
        catch(CloneNotSupportedException e){
            System.out.println("CloneNotSupportedException");
        }


        }



    }