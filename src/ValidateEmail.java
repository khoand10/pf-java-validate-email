import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

    static boolean validateEmail(String string){
        Pattern p = Pattern.compile("^[a-zA-Z0-9]{4,10}@[a-zA-Z]+(.)[a-z]+$");
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static void main(String[] args) {
        String[] emails = {"aaaa@gmail.com","khoand@fpt.vn","khoa@gmail.com","@gmail.com","dd@gmail.","+-*/@gmail.com"};
        for (String email:emails) {
            System.out.println(email +": "+ validateEmail(email));
        }
    }
}
