public class WarrperClasses {
    @SuppressWarnings("UnnecessaryUnboxing")
    public static void main(String[] args) {
        
        /*
            wrapper classes, its provide a way to use the primitive data type as reference(non primitive) data type

            - reference data type have usefull methods that can be usefull
            - reference can be used with collection (eg:- ArrayList)

        */

        /*
            primitive       reference (non primitive)
            ---------       ------------------------
            boolean         (   Boolean
            char                Character
            int                 Integer
            double              Double  ) //these are wrapper classes

                            String
                            class
                            DataType[] (array)
                            Enums (struct like in go)

        */

        /*
            primitive types
                - fized size
                - very fast
                - not object
                - stored as value (not address)

            non-primitive(reference) types
                - slow, beacuse need extra steps to work on
                - stores address
                - once change, everything in same address changes
                - eg:-
                    int[] a = {1, 2};
                    b[0] = 99;
                    int[] b = a;
                   ( a[0] is now 99 )
                   
        /*
            java use boxing (autoboxing, unboxing)
                
                - autoboxing, its automatically convert the primitive to with their corresponding object wrapper class
                - unboxing, its reverse of autoboxing, object wrapper class to primitive
        */

        Boolean b = true; //reference type(B in caps and its "public final class Boolean extends Object implements Serializable, Comparable<Boolean>, Constable"), this is important. see docs for all types
        Character c = '@';
        Integer i = 67;
        Double d = 67.67;
        String s = "suresh";
        // all above things are autoboxing, converts to his corresponding wrapper class, this done by java complier

        //unboxing
        int res = i + 3; //even "i" is reference type, it can be still used as primitive type, its called unboxing, this is also done by java complier
        System.out.println("primitive res is " + res);
        

        b.booleanValue();
        c.notify();
        i.byteValue();
        d.isInfinite();
        s.codePoints();

        //example
        int ii = 76; 
        boolean bb = true;
        // these normal, primitive data type dont have any methods to use




    }
}
