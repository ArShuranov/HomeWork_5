public class Ex_9 {
    public static void  main(String[] args) {
        int saveMoney = 29_000;
        float total = 0;
        for (int i = 1; i <= 12; i++) {
            total += total/100;
            total += saveMoney;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
}
