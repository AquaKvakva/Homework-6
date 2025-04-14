package ru.netology.stats;

public class StatsService {

    private long[] sales;

    public long getAllAmount(long[] stats) {
        int sum = 0;
        for (int i = 0; i < stats.length; i++) {
            long num = stats[i];
            sum += num;
        }
        return sum;
    }

    public long getAverageSalesAmount(long[] stats) {
        int sum = 0;
        int averageSum = 0;
        for (int i = 0; i < stats.length; i++) {
            long num = stats[i];
            sum += num;
            averageSum = sum / stats.length;
        }
        return averageSum;
    }

    public int maxSales(long[] sales) {
        this.sales = sales;
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getSalesBelowAverage(long[] sales) {
        int belowAverage = 0;
        long averageSum = getAverageSalesAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int getSalesAboveAverage(long[] sales) {
        int aboveAverage = 0;
        long averageSum = getAverageSalesAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }


}
