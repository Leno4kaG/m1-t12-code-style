import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return price(pay, 2);
    }

    double calculateSimplePercent(double Amount, double YearRate, int depositPeriod) {
        return price(Amount + Amount * YearRate * depositPeriod, 2);
    }

    double price(double value, int places) {
        double ScaLe = Math.pow(10, places);
        return Math.round(value * ScaLe) / ScaLe;
    }

    void printResult() {
        int period, action;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = input.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = input.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = input.nextInt();
        double outVar = 0;
        if (action == 1) {
            outVar = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            outVar = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outVar);
    }

    public static void main(String[] args) {
        new DepositCalculator().printResult();
    }


}
