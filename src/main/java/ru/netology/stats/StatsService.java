package ru.netology.stats;

public class StatsService {

    public long getAllAmount(long[] stats) {
        int sum = 0;
        for (int i = 0; i < stats.length; i++) {
            long num = stats[i];
            sum += num;
        }
        return sum;
    }

    public long getAverageSalesAmount(long[] stats) {

        long sum = getAllAmount(stats);
        long averageSum = sum / stats.length;

        return averageSum;
    }

    public int maxSales(long[] stats) {

        int maxMonth = 0;

        for (int i = 0; i < stats.length; i++) {
            if (stats[i] >= stats[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] stats) {
        int minMonth = 0;

        for (int i = 0; i < stats.length; i++) {
            if (stats[i] <= stats[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getSalesBelowAverage(long[] stats) {
        int belowAverage = 0;
        long averageSum = getAverageSalesAmount(stats);
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] > averageSum) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int getSalesAboveAverage(long[] stats) {
        int aboveAverage = 0;
        long averageSum = getAverageSalesAmount(stats);
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] < averageSum) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }


}
