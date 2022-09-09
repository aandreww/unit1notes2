public class Main {
    public static void main(String[] args) {
        System.out.println( 5 + " " + 6 + 7);
        // a primitive data type
        // 6-ish numeric
        // 1-ish character
        //1 switch flagger

        // integers -- 4 kinds
        byte tinyNums = 42;                 // 8-bits       -128 to 127
        short mediumSizedNums = -23846;      // 16-bits      -32768 to 32767
        int normalSizedNums = 2843965;       // 32-bits      -2147483648 to 2147483647       (MOST USED)
        long hugeishNums = 83785499472L;     // 64-bits      -9quintillion to 9quintillion
        
        // reals -- decimals!
        float lessAccurateNumbers = 39.627F;     // 32-bits      ~7 digits of accuracy (sigfigs);
        double moreAccurateNumbers = 847956.736485983;       // 64-bits     ~15 digits of accuracy  MOST USED;

        // characters       characters are really integers
        char singleletter = '&';        // 16-bits      65535 characters in the bank (UNICODE)
                                        // 'A' == 65    'a' == 97   '0' == 48

        // boolean
        boolean lightSwitch = true;         //  true or false


        String wordsAndPhrases = "What's good gang";
                
    }
}