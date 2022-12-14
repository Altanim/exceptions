public class Data {
    private static final String VALID_CHARACTERS="qazwsxedcrfvtgbyhnujmikolpQAZWSXEDCRFVTGBYHNUJMIKOLP0123456789_";
    private Data() {

    }

    public static boolean validate(String login,
                                   String password,
                                   String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        }catch (WrongPasswordExeption | WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
        }

        private static void check (String login,
                                   String password,
                                   String confirmPassword)throws WrongPasswordExeption, WrongLoginException{
        if (!validate(login)) {
            throw new WrongLoginException("Невалидный логин!");
        }
            if (!validate(password)) {
                throw new WrongPasswordExeption("Невалидный пароль!");
        }
            if (!password.equals(confirmPassword)){
                throw new WrongPasswordExeption("Пароли не совпадают!");
            }
        }
        private static boolean validate(String s){
        if (s.length() > 20){
            return false;
        }
            for (int i = 0; i < s.length(); i++) {
                if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))){
                    return false;
                }
                
            }
            return true;
        }
        }


