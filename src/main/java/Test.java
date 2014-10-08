import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {


    public String Test(String base, String remove)
    {
        StringBuilder result = new StringBuilder(base);
        List<List<Integer>> tab = new ArrayList<List<Integer>>();

        Pattern pattern = Pattern.compile(remove, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(base);
            while(matcher.find())
            {
                result.delete(matcher.start(), matcher.end());
            }



        return result.toString();
    }


    public static void main(String[] args) {

        Test t= new Test();
        System.out.println(t.Test("Hello there", "llo"));
        }


    }