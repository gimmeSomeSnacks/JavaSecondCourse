package task1;

import java.util.function.Predicate;
import java.util.regex.Pattern;


public class Main implements Predicate<String>{
    @Override
    public boolean test(String email) {
        final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        return pattern.matcher(email).matches();
    }

    public static void main(String[] args) {

        String validEmail = "nikita@mail.com";
        String invalidEmail = "non.email.com";
        Main main = new Main();
        System.out.println(main.test(validEmail));
        System.out.println(main.test(invalidEmail));
    }
}
