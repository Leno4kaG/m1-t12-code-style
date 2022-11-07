import java.util.Scanner;                                          // Умница, привела код в порядок! Кое-что следует поправить и будет ещё лучше!

public class DepositCalculator {                                   //В соответствии с code style аргументы a, y, d следует обозначать словами раскрывающими их суть.
    double calculateComplexPercent(double a, double y, int d) {    //(насколько я понял эти аргументы аналогичны аргументам метода calculateSimplePercent.)
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return price(pay, 2);
    }

    double calculateSimplePercent(double Amount, double YearRate, int depositPeriod) {
        return price(Amount + Amount * YearRate * depositPeriod, 2);
    }

    double price(double value, int places) {                        //В соответствии с code style наимеование методов необходимо начинать с глаголов.
        double ScaLe = Math.pow(10, places);
        return Math.round(value * ScaLe) / ScaLe;
    }

    void printResult() {
        int period, action;                                         //В соответствии с code style каждый аргумент следует отдельно инициализировать
        Scanner input = new Scanner(System.in);                     //в новой строке. 1 аргумент - 1 строка.
        System.out.println("Введите сумму вклада в рублях:");
        int amount = input.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = input.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = input.nextInt();                                   
        double outVar = 0;                                          //В соответствии с code style инициализацию аргументов следует отделять пустой строкой от 
        if (action == 1) {                                          //остальных инструкций.
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
