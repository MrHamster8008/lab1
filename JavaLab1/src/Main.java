import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exersizes ex = new Exersizes();
        int choice, num1, num2, num3,answerint;
        int[] answerarr;
        String answerstr;
        char answerchar;
        boolean answerbool;
        double answerdouble;

        while (true) {
            System.out.println("\nВыберите метод для выполнения:");
            System.out.println("1. Сумма двух последних цифр числа");
            System.out.println("2. Проверка положительного числа");
            System.out.println("3. Проверка заглавной буквы");
            System.out.println("4. Проверка делимости чисел");
            System.out.println("5. Сумма последних цифр двух чисел");
            System.out.println("6. Безопасное деление");
            System.out.println("7. Сравнение двух чисел");
            System.out.println("8. Проверка суммы пар чисел");
            System.out.println("9. Правильное окончание для возраста");
            System.out.println("10. Вывод дней недели");
            System.out.println("11. Обратный список чисел");
            System.out.println("12. Возведение в степень");
            System.out.println("13. Проверка одинаковых цифр");
            System.out.println("14. Печать треугольника");
            System.out.println("15. Игра угадай число");
            System.out.println("16. Поиск последнего вхождения");
            System.out.println("17. Вставка элемента в массив");
            System.out.println("18. Переворот массива");
            System.out.println("19. Объединение массивов");
            System.out.println("20. Удаление отрицательных чисел");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Хорошего дня ");
                    scanner.close();
                    return;

                case 1:
                    System.out.print("Введите число: ");
                    num1 = scanner.nextInt();
                    answerint = ex.sumLastNums(num1);
                    System.out.println("Сумма двух последних цифр: " + answerint);
                    break;

                case 2:
                    System.out.print("Введите число: ");
                    num1 = scanner.nextInt();
                    answerbool = ex.isPositive(num1);
                    System.out.println("Число " + num1 + " положительное: " + answerbool);
                    break;

                case 3:
                    System.out.print("Введите символ: ");
                    answerchar = scanner.next().charAt(0);
                    answerbool = ex.isUpperCase(answerchar);
                    System.out.println("Символ '" + answerchar + "' заглавный: " + answerbool);
                    break;

                case 4:
                    System.out.print("Введите первое число: ");
                    num1 = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    num2 = scanner.nextInt();
                    answerbool = ex.isDivisor(num1, num2);
                    System.out.println("Одно число делится на другое: " + answerbool);
                    break;

                case 5:
                    System.out.print("Введите первое число: ");
                    num1 = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    num2 = scanner.nextInt();
                    answerint = ex.lastNumSum(num1, num2);
                    System.out.println("Сумма последних цифр: " + answerint);
                    break;

                case 6:
                    System.out.print("Введите делимое: ");
                    num1 = scanner.nextInt();
                    System.out.print("Введите делитель: ");
                    num2 = scanner.nextInt();
                    answerdouble = ex.safeDiv(num1, num2);
                    System.out.println("Результат деления: " + answerdouble);
                    break;

                case 7:
                    System.out.print("Введите первое число: ");
                    num1 = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    num2 = scanner.nextInt();
                    answerstr = ex.makeDecision(num1, num2);
                    System.out.println("Результат сравнения: " + answerstr);
                    break;

                case 8:
                    System.out.print("Введите первое число: ");
                    num1 = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    num2 = scanner.nextInt();
                    System.out.print("Введите третье число: ");
                    num3 = scanner.nextInt();
                    answerbool = ex.sum3(num1, num2, num3);
                    System.out.println("Есть пара чисел с суммой равной третьему: " + answerbool);
                    break;

                case 9:
                    System.out.print("Введите возраст: ");
                    num1 = scanner.nextInt();
                    answerstr = ex.age(num1);
                    System.out.println(num1 + answerstr);
                    break;

                case 10:
                    System.out.print("Введите день недели: ");
                    scanner.nextLine(); // Очистка буфера
                    answerstr = scanner.nextLine();
                    ex.printDays(answerstr);
                    break;

                case 11:
                    System.out.print("Введите начальное число: ");
                    num1 = scanner.nextInt();
                    answerstr = ex.reverseListNums(num1);
                    System.out.println("Обратная последовательность: " + answerstr);
                    break;

                case 12:
                    System.out.print("Введите основание: ");
                    num1 = scanner.nextInt();
                    System.out.print("Введите степень: ");
                    num2 = scanner.nextInt();
                    answerint = ex.pow(num1, num2);
                    System.out.println("Результат: " + answerint);
                    break;

                case 13:
                    System.out.print("Введите число: ");
                    num1 = scanner.nextInt();
                    answerbool = ex.equalNum(num1);
                    System.out.println("Все цифры одинаковые: " + answerbool);
                    break;

                case 14:
                    System.out.print("Введите размер треугольника: ");
                    num1 = scanner.nextInt();
                    ex.leftTriangle(num1);
                    break;

                case 15:
                    ex.guessGame();
                    break;

                case 16:
                    System.out.print("Введите размер массива: ");
                    int size = scanner.nextInt();
                    answerarr = new int[size];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        answerarr[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число для поиска: ");
                    num1 = scanner.nextInt();
                    answerint = ex.findLast(answerarr, num1);
                    System.out.println("Последний индекс: " + answerint);
                    break;

                case 17:
                    System.out.print("Введите размер массива: ");
                    size = scanner.nextInt();
                    answerarr = new int[size];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        answerarr[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число для вставки: ");
                    num1 = scanner.nextInt();
                    System.out.print("Введите позицию для вставки: ");
                    num2 = scanner.nextInt();
                    int[] newArray = ex.add(answerarr, num1, num2);
                    System.out.println("Новый массив: " + Arrays.toString(newArray));
                    break;

                case 18:
                    System.out.print("Введите размер массива: ");
                    size = scanner.nextInt();
                    answerarr = new int[size];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        answerarr[i] = scanner.nextInt();
                    }
                    ex.reverse(answerarr);
                    System.out.println("Перевернутый массив: " + Arrays.toString(answerarr));
                    break;

                case 19:
                    System.out.print("Введите размер первого массива: ");
                    int size1 = scanner.nextInt();
                    int[] array1 = new int[size1];
                    System.out.println("Введите элементы первого массива:");
                    for (int i = 0; i < size1; i++) {
                        array1[i] = scanner.nextInt();
                    }

                    System.out.print("Введите размер второго массива: ");
                    int size2 = scanner.nextInt();
                    int[] array2 = new int[size2];
                    System.out.println("Введите элементы второго массива:");
                    for (int i = 0; i < size2; i++) {
                        array2[i] = scanner.nextInt();
                    }

                    int[] concatenated = ex.concat(array1, array2);
                    System.out.println("Объединенный массив: " + Arrays.toString(concatenated));
                    break;

                case 20:
                    System.out.print("Введите размер массива: ");
                    size = scanner.nextInt();
                    answerarr = new int[size];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        answerarr[i] = scanner.nextInt();
                    }
                    int[] positiveArray = ex.deleteNegative(answerarr);
                    System.out.println("Массив без отрицательных чисел: " + Arrays.toString(positiveArray));
                    break;

                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }


        }
    }
}
