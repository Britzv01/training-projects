package WrapperClasses;

public class Main {
    public static void main(String [] args){

        // Autoboxing - wrapping primitive variables into objects
        Integer a = 123;
        Double b = 15.0;
        Character c = '$';
        Boolean d = true;
        String e = new String("Pizza");

        // Unboxing - unwrapping objects into primitive variables
        int f = a;
        double g = b;
        char h = c;
        boolean i = d;

        // Utility methods

        // Convert primitive data types into other data types
        String j = Integer.toString(123);
        String k = Double.toString(Math.PI);
        String l = Character.toString('%');
        String m = Boolean.toString(true);

        System.out.println(j + k + l + m);

        // Convert wrapper types into primitive
        int n = Integer.parseInt("123");
        double o = Double.parseDouble("3.14");
        char p = "hello".charAt(0);
        boolean q = Boolean.parseBoolean("true");

        // Verifying
        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
