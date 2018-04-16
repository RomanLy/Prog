package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean wordCheck(String line){

        Pattern pattern = Pattern.compile("^\\D+$");
        Matcher matcher = pattern.matcher(line);

        return matcher.find();
    }

    public static boolean numberCheck(String line){

        Pattern pattern = Pattern.compile("^\\d+$");
        Matcher matcher = pattern.matcher(line);

        return matcher.find();
    }

}
