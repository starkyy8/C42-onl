package Homework_13;

public class LoginValidator {
    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException{
        if (login.length() > 20){
            throw new WrongLoginException("Логин не должен быть более 20 символов");
        }
        if (login.contains(" ")){
            throw new WrongLoginException("Логин не должен содержать пробел");
        }
        if (password.length() >= 20){
            throw new WrongPasswordException("Пароль не должен быть более 20 символов");
        }
        if (password.contains(" ")){
            throw new WrongLoginException("Пароль не должен содержать пробел");
        }
        boolean hasDigit = false;
        for (char c : password.toCharArray()){
            if(Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if(!hasDigit){
            throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру");
        }
        if (!confirmPassword.equals(password)){
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}
