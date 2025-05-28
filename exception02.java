class C {}
class D extends C {}

public class exception02 {
    public static void main(String[] args) {
        try{System.out.println(6/3);
        C c = new C();
        D d = (D) c;

        int[] array = {1,2,3,4,5};
        System.out.println(array[7]);

        String str = null;
        System.out.println(str.charAt(2));

        }

        catch(ArithmeticException e){
            System.out.println("ArithemeticException");
        }

        catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        catch(ClassCastException e){
            System.out.println("ClassCastException");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException");
        }

        finally{
            System.out.println("프로그램을 종료합니다.");
        }
    }
    public static void myException() throws Exception{
        throw new Exception("예외 발생");
    }
}
