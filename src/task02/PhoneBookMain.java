package task02;

public class PhoneBookMain {
    public static void main(String[] args) {

        PhoneBook pb1 = new PhoneBook();
        pb1.add("+7 (499) 481-53-22","Иванов");
        pb1.add("+7 (3852) 52-32-11","Иванов");
        pb1.add("+7 (3852) 48-23-21","Петров");
        pb1.add("+7 (3852) 48-23-21","Сидоров");
        pb1.add("+7 (3852) 22-53-56","Кюхельбекер");

        System.out.println(pb1.get("Иванов"));
        System.out.println(pb1.get("Петров"));
        System.out.println(pb1.get("Сидоров"));
        System.out.println(pb1.get("Кюхельбекер"));

    }
}
