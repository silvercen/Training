package LambdaTraining;

interface Authentication{
    boolean apply(String str, String str1);
}

public class TwoStringLambda {
    public static void main(String[] args)
    {
        String[][] users = {{"Abel", "123"},{"Mathew", "234"},{"Raj","567"}};

        Authentication authenticate = (user,pass) -> {
            for(int i=0; i<users.length; i++)
            {
                if (users[i][0].equals(user) && users[i][1].equals(pass))
                {
                    return true;
                }
            }

            return false;
        };

        System.out.println(authenticate.apply("Abel","123"));
        System.out.println(authenticate.apply("Abel","234"));


    }
}
