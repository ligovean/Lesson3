package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPsw {
    public static void main(String[] args) {
        Scanner scPsw = new Scanner(System.in);
        System.out.println("Set your password: ");
        if (checkPsw(scPsw.nextLine()))
            System.out.println("Right password!");
        else{
            System.out.println("Your password does not satisfy the current policy.");
            System.out.println("Password must be 8-20 characters consisting of numbers, uppercase and lowercase letters and !@#$%^&* characters!");
        }
    }

    public static boolean checkPsw(String psw){
        Pattern p = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[0-9a-zA-Z!@#$%^&*]{8,20}");
        //[0-9a-zA-Z!@#$%^&*] - Множество возможных символов для пароля.
        //{8,20} - Минимум 8, максимум 20 символов.
        //(?=.*[!@#$%^&*]) - В строке должны быть перечисленные спецсимволы.
        //(?=.*[0-9]) - В строке должны быть цифры из диапозона 0-9.
        //аналогично для диапозона [a-z] и [A-Z]
        Matcher m = p.matcher(psw);
        return m.matches();
    }
}