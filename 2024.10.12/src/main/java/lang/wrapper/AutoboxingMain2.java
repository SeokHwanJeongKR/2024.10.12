package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {

        //primitive -> wrapper
        int value = 7;
        Integer boxedValue = value; //오토 박싱 (Auto-Boxing)

        //wrapper -> primitive
        int unboxedValue = boxedValue; // 오토 언박싱 (Auto-UnBoxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

        int a = 10;
        Integer b = a;
        int c = b;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

    }
}
