import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите 2 число: ");
        int num2 = scanner.nextInt();

        int res;

        System.out.print("Действие: ");
        String action = scanner.nextLine();//тут проблем с этой функцией я ее подобрал методом тыка
        action = scanner.nextLine();//и я так и не понял что это обозначает

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат сложения = " + res);
                break;

            case "-":
                res = num1 - num2;
                System.out.println("Результат вычитания = " + res);
                break;

            case "*":
                res = num1 * num2;
                System.out.println("Результат умножения = " + res);
                break;

            case "/":
                if (num2 == 0)
                    System.out.println("Error - на ноль не делится");
                else {
                    res = num1 / num2;
                    System.out.println("Результат деления = " + res);
                }
                break;
            default:
                System.out.println("вы что-то не то ввели");

        }

    }
}