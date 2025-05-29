import java.util.Arrays;
import java.util.Random;

public  class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(" Задача№1 ");
        int[] spending = generateRandomArray();
        int sum = 0;
        for (int expense : spending) {
            sum += expense;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        {


            System.out.println(" Задача№2 ");
            int[] expence = {36_000, 45_500, 39_985, 21_456, 21_477};
            Arrays.sort(expence);
            int max = expence[0];
            int min = expence[0];
            for (int i = 1; i < expence.length; i++){
                if (expence[i] < min) {
                    min = expence[i];
                }
                if (expence[i] > max){
                    max=expence[i];
                }
            }
            System.out.println(" Минимальная сумма трат за неделю составила " + min + " рублей ");
            System.out.println(" Максимальная сумма трат за неделю составила " + max + " рублей ");

            System.out.println(" Задача№3 ");
            int[] monthExpence = {34567, 123458, 65390, 568806, 235541};
            int total = 0;
            for (int week : monthExpence) {
                total = total + week;
            }
            float weekAverage = (total / (monthExpence.length));
            System.out.println(" Средняя сумма трат за месяц составила " + weekAverage + " рублей ");

            System.out.println(" Задача№4 ");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

            int start = 0;
            int end = reverseFullName.length - 1;

            while (start < end) {
                char temp = reverseFullName[start];
                reverseFullName[start] = reverseFullName[end];
                reverseFullName[end] = temp;
                start++;
                end--;
            }

            for (int i = 0; i < reverseFullName.length; i++) {
                System.out.print(reverseFullName[i]);
            }
        }
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000); // Генерация случайного числа до 1000
        }
        return array;
    }
}
