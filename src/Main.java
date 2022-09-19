public class Main {
    public static void main(String[] args) {

        int leftOnAccount = 100;
        int addition = 4560;
        int bonus;

        if (addition > 1000) {
            bonus = addition / 100;
        } else {
            bonus = 0;
        }

        int newAccountSum = leftOnAccount + addition + bonus;

        System.out.println(bonus + " руб.");
        System.out.println(newAccountSum + " руб.");


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
