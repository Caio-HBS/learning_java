public class Main {
    public static void main(String[] args) {
        // INTEGERS, nothing special other than them having a minimum and maximum number.
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("\nMinimum integer value is: " + minIntValue + "\nMaximum integer value is: " + maxIntValue);

        // BYTES, same as above.
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum byte value is: " + minByteValue + "\nMaximum byte value is: " + maxByteValue);

        // LONG, used to deal with numbers bigger than the maximum (or lower than the minimum) for integers.
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum long value is: " + minLongValue + "\nMaximum long value is: " + maxLongValue);
        // How to create a Long:
        // long longExample = 2147483648L; The "L" at the end tells Java it is a Long.

        // SHORT, used to create small integers, similar to Longs.
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("\nMinimum short value is: " + minShortValue + "\nMaximum short value is: " + maxShortValue);

        // FLOAT, less precise than Doubles.
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum float value is: " + minFloatValue + "\nMaximum float value is: " + maxFloatValue);
        // How to create a Float:
        // float floatExample = 11.2F; The "F" at the end tells Java it is a Float.

        // Doubles, serve the same purpose as Floats, but are more precise.
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum float value is: " + minDoubleValue + "\nMaximum float value is: " + maxDoubleValue);
        // How to create a Double:
        // float floatExample = 11.2; No need to indicate to Java the data type, also much more precise than Float.

        // Char, similar to Strings, but only accept ONE single character. NEED SINGLE QUOTES.
        char letter = 'F';
        System.out.println("\nThis is an example for Chars: '" + letter + "'");

        // Boolean, nothing special.
        boolean isActive = true;
        System.out.println("Current status for 'isActive' boolean is: " + isActive);
    }
}