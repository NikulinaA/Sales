import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = service.sum(sales); // п.1 Сумма всех продаж
        System.out.println(sum);

        int abs = service.average(sales);
        System.out.println(abs);

        int saleMax = service.maxi(sales);
        System.out.println(saleMax);

        int saleMin = service.min(sales);
        System.out.println(saleMin);

        int countMonthPriority = service.countMonthPriority(sales);
        System.out.println(countMonthPriority);

        int countMonthNoPriority = service.countMonthNoPriority(sales);
        System.out.println(countMonthNoPriority);


    }


}
