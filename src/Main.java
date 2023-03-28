public class Main {
    public static void main(String[] args) {
        boolean result = Validator.validate("test_1234", "Qwerty_1", "Qwerty_1");
        if (result) {
            System.out.println("Логин и пароль корректные");
        } else {
            System.out.println("Логин и/или пароль некорректный");
        }
    }
}