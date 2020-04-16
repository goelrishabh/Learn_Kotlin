package java;

import kotlin.Foo;

public class Functions {

    public static void main(String[] args) {

        Foo foo = new kotlin.Foo();
        foo.memberFun();

        System.out.println(sumJava(5));
        System.out.println(sumJava(5.00d));
        System.out.println(sumJava(5, 5.00d));

    }

    //region Method Overloading

    public static double sumJava(int aInt, double aDouble) {
        return aInt + aDouble;
    }

    public static double sumJava(int aInt) {
        return sumJava(aInt, 0.00);
    }

    public static double sumJava(double aDouble) {
        return sumJava(0, aDouble);
    }

    //endregion

}
