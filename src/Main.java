public class Main {
    public static void main(String[] args) {
        System.out.println("somma di due int: " + add(3,4));
        System.out.println("stampa di un char: " + printChar('z'));
        System.out.println("somma di due Integer: " + sum(19, 3));
        System.out.println("stampa di un Character: " + newChar('g'));
        System.out.println(autoboxing(6,4.5, 'g'));
        System.out.println(unboxing(7, 42.684,'r'));
    }

    public static int add (int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static char printChar(char aChar){
        return aChar;
    }

    public static Integer sum (Integer num1, Integer num2){
        return num1 + num2;
    }

    public static Character newChar (Character aChar){
        return aChar;
    }

    public static String autoboxing (int num, double num2, char aChar) {
        num = new Integer(7);
        num2 = new Double (22.0623);
        aChar = new Character('z');

        return "autoboxing:" + "\nInteger -> " + num + "\nDouble -> " + num2 + "\nCharacter -> " + aChar;
    }

    public static String unboxing (Integer num, Double num2, Character aChar) {
        int num1 = num = 3;
        double num3 = num2 = 5.0967;
        char newChar = aChar = 'g';
        return "unboxing:" + "\nint -> " + num + "\ndouble -> " + num2 + "\nchar -> " + aChar;
    }
}