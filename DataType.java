public class DataType {
    @SuppressWarnings("unused") //added anotation for unused warring
        public static void main(String[] args) {

            int x; //4 bytes -2 billon to 2 billon
            x = 10;
            System.out.println(x);

            long l = 634453562457647657L; //8 bytes store upto -9 to 9quintillon, need L at end like foalt
            System.out.println(l);


            String y = "suresh"; //vaires depends on how many letter
            System.out.println(y);

            char z = 'Ž'; //2 bytes, store letter or ascci words
            System.err.println(z);

            float a = 3.123456f; //4 bytes, store upto 6 digits only and need to put 'f' at last or lese error
            System.out.println(a);
            
            double b = 3.123456789012345; //8 bytes only store upto 15 digits 
            System.err.println(b);


            boolean f = true; //1bit store 0 or 1 
            byte d = 100; //1 bytes store -128 to 128
            short n = 32767; //2 bytes store - to + 32,768

        }
}
