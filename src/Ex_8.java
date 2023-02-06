public class Ex_8 {
    public static void  main(String[] args) {
        int saveMoney = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += saveMoney;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
}
