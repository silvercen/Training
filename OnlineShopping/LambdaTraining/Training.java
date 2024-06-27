package LambdaTraining;

interface StringOperation{
    String apply(String str);
}

public class Training {
    public static void main(String[] args)
    {
        StringOperation toUpper = s -> s.toUpperCase();
        StringOperation toLower = s -> s.toLowerCase();
        StringOperation Trim = s -> s.trim();
        StringOperation Reverse = s -> {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            return sb.toString();
        };

        System.out.println(toUpper.apply("hello"));
        System.out.println(toLower.apply("HELLO"));
        System.out.println(Trim.apply("heloooo    "));
        System.out.println(Reverse.apply("hello"));

    }
}
