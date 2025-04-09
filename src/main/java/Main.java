import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        int [] stats = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        System.out.println( "Сумма чисел: " + service.getAllAmount( stats ) );

        System.out.println( "Средняя сумма: " + service.getAverageSalesAmount( stats ) );

        System.out.println( "Лучший месяц продаж: " + service.maxSales( stats ));

        System.out.println( "Худший месяц продаж: " + service.minSales( stats ));

        System.out.println( "Месяцев с продажами ниже среднего: " + service.getSalesBelowAverage( stats ));

        System.out.println( "Месяцев с продажами выше среднего: " + service.getSalesAboveAverage( stats ));
        

    }
}