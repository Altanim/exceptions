public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("Andrey", "12345", "12345");
        if (success){
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные не валидны");
        }
    }
}