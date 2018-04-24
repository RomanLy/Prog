package util.impl;

import util.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator implements Validation{

    public Validator(){
    }
    @Override
    public boolean wordCheck(String line){

        Pattern pattern = Pattern.compile("^\\D+$");
        Matcher matcher = pattern.matcher(line);

        return matcher.find();
    }
    @Override
    public  boolean numberCheck(String line){

        Pattern pattern = Pattern.compile("^\\d+$");
        Matcher matcher = pattern.matcher(line);

        return matcher.find();
    }
    @Override
    public  boolean phoneNumberCheck(String line){

        Pattern pattern = Pattern.compile("^((\\+?380)([0-9]{9}))$");
        Matcher matcher1 = pattern.matcher(line);

        return matcher1.matches();
    }


}
