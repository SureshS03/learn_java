public class Generics {
    public static void main(String[] args) {

        // generics is a type that can be filled with any reference data type (not
        // primitive data type)
        // beacuse generics use a erasure, which make everything in object at runtime
        // beacuse of primitive data type is not an object it cant use it
        // generics can be a method or class that take generics data and work on

        Integer[] intarr = { 1, 2, 3, 4, 5 };
        Double[] doublearr = { 2.2, 3.4, 4.5, 56.5 };
        Character[] chararr = { '@', '!', '%' };
        String[] strarr = { "hello", "broo" };

        // if we dont use generice means we need to write 4 different override method
        // with same name and diff data type as paramaters
        // but with use generic we cam do things likw this..

        arrPrinter(intarr);
        arrPrinter(doublearr);
        arrPrinter(chararr);
        arrPrinter(strarr);

        System.out.println(getLast(chararr));

        GenericsClass c = new GenericsClass('@'); // this will work but with a warring beacause we just using it raw,
        System.out.println(c.getValue()); // and by using it raw maybe cause some problems soo...

        GenericsClass<Character> c2 = new GenericsClass<>('#'); // this is good and best pratice
        System.out.println(c2.getValue());

        GenericsClassWithTwoValue<Integer, String> c3 = new GenericsClassWithTwoValue<>(12, "broo"); // this is the
                                                                                                     // syntax for two
                                                                                                     // generic class

        // if u take a look means, both ArrayList and HashMap are both generic classess

        // bounded generics class

        GenericsBoundedClass<Integer, Double> cb = new GenericsBoundedClass<>(12, 30.3); // this will work beacuse both
                                                                                         // Interger and Double is sub
                                                                                         // class of Number Class
        // and we use generics type as that they can extends Number class

        System.out.println(cb.addvalue()); // 42

        TextTypeGenerics<TextChar> tgc = new TextTypeGenerics<>(new TextChar('@')); // works no err
        TextTypeGenerics<TextString> tgs = new TextTypeGenerics<>(new TextString("suresh"));
        tgc.printres(); // this will print the address of the TextChar class
        // but we can override the toString method in class to actually print something,
        // which i implemented in TextString class
        tgs.printres(); // this will print the value of the string prestent in the TextString class //
                        // suresh

    }

    public static <T> void arrPrinter(T[] arr) { // we need to spefic the generics before the return type of the methods
        for (T x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static <T> T getLast(T[] arr) { // we can also return a generics type too
        return arr[arr.length - 1];
    }
}

class GenericsClass<E> { // this is sytnax for generic class
    E x;

    public GenericsClass(E x) {
        this.x = x;
    }

    public E getValue() { // we return the generic it self
        return x;
    }
}

class GenericsClassWithTwoValue<E, T> { // using two generics
    E x;
    T y;

    public GenericsClassWithTwoValue(E x, T y) {
        this.x = x;
        this.y = y;
    }

    public E getValue() { // we return the generic it self
        return x;
    }
}

class GenericsBoundedClass<E extends Number, T extends Number> { // we bounded the generics but extends the generic type
                                                                 // with a class, we can even use our own custom class
                                                                 // too, below i have example

    E x;
    T y;

    public GenericsBoundedClass(E x, T y) {
        this.x = x;
        this.y = y;
    }

    public Number addvalue() {
        return x.intValue() + y.intValue();
    }
}

// custom generics type example
// in java we cant bounded the generic only with strings and character
// so we use custom type

interface TextType {
}

class TextString implements TextType {
    String x;

    public TextString(String x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return x;
    }
}

class TextChar implements TextType {
    Character x;

    public TextChar(Character x) {
        this.x = x;
    }

}

class TextTypeGenerics<T extends TextType> { // we extends TextType which implements TextChar and TextString which are
                                             // class that take string and char while creating
    T x;

    public TextTypeGenerics(T x) {
        this.x = x;
    }

    public void printres() {
        System.out.println(x);
    }
}
// see the main method to implementation