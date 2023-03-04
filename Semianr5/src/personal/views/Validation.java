package personal.views;

import personal.model.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
        Pattern namePattern = Pattern.compile("^\\S+$");
        Pattern phonePattern = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
    public void validateUser(User inputUser) throws Exception{
        Matcher nameMatcher = namePattern.matcher(inputUser.getFirstName());
        Matcher lastnameMatcher = namePattern.matcher(inputUser.getLastName());
        Matcher phoneMatcher = phonePattern.matcher(inputUser.getPhone());
        if(!nameMatcher.find()){
            throw new Exception("This name is not allowed!");
        }
        if(!lastnameMatcher.find()){
            throw new Exception("This last name is not allowed!");
        }
        if(!phoneMatcher.find()){
            throw new Exception("This phone is not allowed!");
        }
    }
}
