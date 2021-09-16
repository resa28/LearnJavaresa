public class Aritmath {
    public static void main(String[] args) {
        int value1 = 8;
        int value2 = 10;

        int indecrement = 9;

        System.out.println( value1 + value2 );
        System.out.println( value1 - value2 );
        System.out.println( value1 * value2 );
        System.out.println( value1 / value2 );
        System.out.println( value1 % value2 );

        //operator ++ (Increment)
        System.out.println("Increment: ");
        System.out.println(indecrement++);
        System.out.println(indecrement);
        System.out.println(++indecrement);
        System.out.println(indecrement);

        //operator ++ (Decrement)
        System.out.println("Decrement: ");
        System.out.println(indecrement--);
        System.out.println(indecrement);
        System.out.println(--indecrement);
        System.out.println(indecrement);

    }
}
