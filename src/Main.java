import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;

public class Main {

    // Задача 1-6
    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    // Задача 1-7
    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        return num >= min && num <= max;
    }

    // Задача 1-8
    public boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return false;
        }

        return a % b == 0 || b % a == 0;
    }

    // Задача 1-9
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // Задача 1-10
    public int lastNumSum(int a, int b) {
        return Math.abs(a % 10) + Math.abs(b % 10);
    }

    // Задача 2-6
    public boolean sum3(int x, int y, int z) {
        return x + y == z
                || x + z == y
                || y + z == x;
    }

    // Задача 2-7
    public int sum2(int x, int y) {
        int sum = x + y;

        if (sum >= 10 && sum <= 19) {
            return 20;
        }

        return sum;
    }

    // Задача 2-8
    public String age(int x) {

        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastDigit == 1 && lastTwoDigits != 11) {
            return x + " год";
        }

        if (lastDigit >= 2
                && lastDigit <= 4
                && !(lastTwoDigits >= 12
                && lastTwoDigits <= 14)) {
            return x + " года";
        }

        return x + " лет";
    }

    // Задача 2-9
    public String day(int x) {

        switch (x) {
            case 1:
                return "понедельник";

            case 2:
                return "вторник";

            case 3:
                return "среда";

            case 4:
                return "четверг";

            case 5:
                return "пятница";

            case 6:
                return "суббота";

            case 7:
                return "воскресенье";

            default:
                return "это не день недели";
        }
    }

    // Задача 2-10
    public void printDays(String x) {

        switch (x.toLowerCase()) {

            case "понедельник":
                System.out.println("понедельник");

            case "вторник":
                System.out.println("вторник");

            case "среда":
                System.out.println("среда");

            case "четверг":
                System.out.println("четверг");

            case "пятница":
                System.out.println("пятница");

            case "суббота":
                System.out.println("суббота");

            case "воскресенье":
                System.out.println("воскресенье");
                break;

            default:
                System.out.println("это не день недели");
        }
    }

    // Задача 3-6
    public boolean equalNum(int x) {

        int lastDigit = x % 10;

        while (x > 0) {

            if (x % 10 != lastDigit) {
                return false;
            }

            x /= 10;
        }

        return true;
    }

    // Задача 3-7
    public void square(int x) {

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Задача 3-8
    public void leftTriangle(int x) {

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Задача 3-9
    public void rightTriangle(int x) {

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Задача 3-10
    public void guessGame() {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int secretNumber = random.nextInt(10);

        int attempts = 0;
        int userNumber;

        do {

            System.out.print("Введите число от 0 до 9: ");

            userNumber = scanner.nextInt();

            attempts++;

            if (userNumber != secretNumber) {
                System.out.println("Вы не угадали.");
            }

        } while (userNumber != secretNumber);

        System.out.println("Вы угадали!");
        System.out.println("Вы отгадали число за " + attempts + " попытки(ок).");
    }

    // Задача 4-6
    public void reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // Задача 4-7
    public int[] reverseBack(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }

        return result;
    }

    // Задача 4-8
    public int[] concat(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    // Задача 4-9
    public int[] findAll(int[] arr, int x) {

        int count = 0;

        for (int value : arr) {
            if (value == x) {
                count++;
            }
        }

        int[] result = new int[count];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }

    // Задача 4-10
    public int[] deleteNegative(int[] arr) {

        int count = 0;

        for (int value : arr) {
            if (value >= 0) {
                count++;
            }
        }

        int[] result = new int[count];

        int index = 0;

        for (int value : arr) {
            if (value >= 0) {
                result[index] = value;
                index++;
            }
        }

        return result;
    }

    // Проверка ввода числа
    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    // Ввод массива
    private static int[] readArray(Scanner scanner) {

        System.out.print("Введите размер массива: ");
        int size = readInt(scanner);

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.print("Элемент [" + i + "]: ");
            arr[i] = readInt(scanner);
        }

        return arr;
    }

    // Меню первой группы
    private static void showFirstGroup(
            Scanner scanner,
            Main tasks) {

        int choice;

        do {
            System.out.println("\n===== ПЕРВАЯ ГРУППА =====");
            System.out.println("6 - Большая буква");
            System.out.println("7 - Диапазон");
            System.out.println("8 - Делитель");
            System.out.println("9 - Равенство");
            System.out.println("10 - Многократный вызов");
            System.out.println("0 - Назад");
            System.out.print("Выберите задачу: ");

            choice = readInt(scanner);

            switch (choice) {

                case 6:
                    System.out.print("Введите символ: ");
                    char x = scanner.next().charAt(0);

                    System.out.println("Результат: " + tasks.isUpperCase(x));
                    break;

                case 7:
                    System.out.print("Введите a: ");
                    int a = readInt(scanner);

                    System.out.print("Введите b: ");
                    int b = readInt(scanner);

                    System.out.print("Введите num: ");
                    int num = readInt(scanner);

                    System.out.println("Результат: " + tasks.isInRange(a, b, num));
                    break;

                case 8:
                    System.out.print("Введите a: ");
                    a = readInt(scanner);

                    System.out.print("Введите b: ");
                    b = readInt(scanner);

                    System.out.println("Результат: " + tasks.isDivisor(a, b));
                    break;

                case 9:
                    System.out.print("Введите a: ");
                    a = readInt(scanner);

                    System.out.print("Введите b: ");
                    b = readInt(scanner);

                    System.out.print("Введите c: ");
                    int c = readInt(scanner);

                    System.out.println("Результат: " + tasks.isEqual(a, b, c));
                    break;

                case 10:
                    System.out.print("Введите первое число: ");
                    int n1 = readInt(scanner);

                    System.out.print("Введите второе число: ");
                    int n2 = readInt(scanner);

                    System.out.print("Введите третье число: ");
                    int n3 = readInt(scanner);

                    System.out.print("Введите четвертое число: ");
                    int n4 = readInt(scanner);

                    System.out.print("Введите пятое число: ");
                    int n5 = readInt(scanner);

                    int lastResult = tasks.lastNumSum(n1, n2);

                    System.out.println(n1 + " + " + n2 + " = " + lastResult);

                    int newResult = tasks.lastNumSum(lastResult, n3);

                    System.out.println(lastResult + " + " + n3 + " = " + newResult);

                    lastResult = newResult;

                    newResult = tasks.lastNumSum(lastResult, n4);

                    System.out.println(lastResult + " + " + n4 + " = " + newResult);

                    lastResult = newResult;

                    newResult = tasks.lastNumSum(lastResult, n5);

                    System.out.println(lastResult + " + " + n5 + " = " + newResult);

                    System.out.println("Итог: " + newResult);
                    break;

                case 0:
                    System.out.println("Возврат в главное меню.");
                    break;

                default:
                    System.out.println("Такого пункта меню нет.");
            }

        } while (choice != 0);
    }

    // Меню второй группы
    private static void showSecondGroup(
            Scanner scanner,
            Main tasks) {

        int choice;

        do {
            System.out.println("\n===== ВТОРАЯ ГРУППА =====");
            System.out.println("6 - Тройная сумма");
            System.out.println("7 - Двойная сумма");
            System.out.println("8 - Возраст");
            System.out.println("9 - День недели");
            System.out.println("10 - Вывод дней недели");
            System.out.println("0 - Назад");
            System.out.print("Выберите задачу: ");

            choice = readInt(scanner);

            switch (choice) {

                case 6:
                    System.out.print("Введите x: ");
                    int x = readInt(scanner);

                    System.out.print("Введите y: ");
                    int y = readInt(scanner);

                    System.out.print("Введите z: ");
                    int z = readInt(scanner);

                    System.out.println("Результат: " + tasks.sum3(x, y, z));
                    break;

                case 7:
                    System.out.print("Введите x: ");
                    x = readInt(scanner);

                    System.out.print("Введите y: ");
                    y = readInt(scanner);

                    System.out.println("Результат: " + tasks.sum2(x, y));
                    break;

                case 8:
                    System.out.print("Введите возраст: ");
                    x = readInt(scanner);

                    System.out.println(tasks.age(x));
                    break;

                case 9:
                    System.out.print("Введите номер дня: ");
                    x = readInt(scanner);

                    System.out.println(tasks.day(x));
                    break;

                case 10:
                    System.out.print("Введите день недели: ");
                    scanner.nextLine();

                    String dayName = scanner.nextLine();

                    tasks.printDays(dayName);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Такого пункта меню нет.");
            }

        } while (choice != 0);
    }

    // Меню третьей группы
    private static void showThirdGroup(
            Scanner scanner,
            Main tasks) {

        int choice;

        do {
            System.out.println("\n===== ТРЕТЬЯ ГРУППА =====");
            System.out.println("6 - Одинаковость");
            System.out.println("7 - Квадрат");
            System.out.println("8 - Левый треугольник");
            System.out.println("9 - Правый треугольник");
            System.out.println("10 - Угадайка");
            System.out.println("0 - Назад");
            System.out.print("Выберите задачу: ");

            choice = readInt(scanner);

            switch (choice) {

                case 6:
                    System.out.print("Введите число: ");
                    int x = readInt(scanner);

                    System.out.println(tasks.equalNum(x));
                    break;

                case 7:
                    System.out.print("Введите размер квадрата: ");
                    x = readInt(scanner);

                    tasks.square(x);
                    break;

                case 8:
                    System.out.print("Введите высоту треугольника: ");
                    x = readInt(scanner);

                    tasks.leftTriangle(x);
                    break;

                case 9:
                    System.out.print("Введите высоту треугольника: ");
                    x = readInt(scanner);

                    tasks.rightTriangle(x);
                    break;

                case 10:
                    tasks.guessGame();
                    break;

                case 0:
                    System.out.println("Возврат в главное меню.");
                    break;

                default:
                    System.out.println("Такого пункта меню нет.");
            }

        } while (choice != 0);
    }

    // Меню четвертой группы
    private static void showFourthGroup(
            Scanner scanner,
            Main tasks) {

        int choice;

        do {
            System.out.println("\n===== ЧЕТВЕРТАЯ ГРУППА =====");
            System.out.println("6 - Реверс");
            System.out.println("7 - Возвратный реверс");
            System.out.println("8 - Объединение");
            System.out.println("9 - Все вхождения");
            System.out.println("10 - Удалить негатив");
            System.out.println("0 - Назад");
            System.out.print("Выберите задачу: ");

            choice = readInt(scanner);

            switch (choice) {

                case 6:
                    int[] arr = readArray(scanner);

                    tasks.reverse(arr);

                    System.out.println("Результат: " + Arrays.toString(arr));
                    break;

                case 7:
                    arr = readArray(scanner);

                    System.out.println("Результат: " + Arrays.toString(tasks.reverseBack(arr)));
                    break;

                case 8:
                    System.out.println("Первый массив:");
                    int[] arr1 = readArray(scanner);

                    System.out.println("Второй массив:");
                    int[] arr2 = readArray(scanner);

                    System.out.println("Результат: " + Arrays.toString(tasks.concat(arr1, arr2)));
                    break;

                case 9:
                    arr = readArray(scanner);

                    System.out.print(
                            "Введите искомое число: ");
                    int x = readInt(scanner);

                    System.out.println("Результат: " + Arrays.toString(tasks.findAll(arr, x)));
                    break;

                case 10:
                    arr = readArray(scanner);

                    System.out.println("Результат: " + Arrays.toString(tasks.deleteNegative(arr)));
                    break;

                case 0:
                    break;

                default:
                    System.out.println(
                            "Такого пункта меню нет.");
            }

        } while (choice != 0);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Main tasks = new Main();

        int groupChoice;

        do {
            System.out.println("\n===== ГЛАВНОЕ МЕНЮ =====");
            System.out.println("1 - Первая группа Методы");
            System.out.println("2 - Вторая группа Условия");
            System.out.println("3 - Третья группа Циклы");
            System.out.println("4 - Четвертая группа Массивы");
            System.out.println("0 - Выход");
            System.out.print("Выберите группу: ");

            groupChoice = readInt(scanner);

            switch (groupChoice) {

                case 1:
                    showFirstGroup(scanner, tasks);
                    break;

                case 2:
                    showSecondGroup(scanner, tasks);
                    break;

                case 3:
                    showThirdGroup(scanner, tasks);
                    break;

                case 4:
                    showFourthGroup(scanner, tasks);
                    break;

                case 0:
                    System.out.println("Программа завершена.");
                    break;

                default:
                    System.out.println("Такого пункта меню нет.");
            }

        } while (groupChoice != 0);

        scanner.close();
    }
}