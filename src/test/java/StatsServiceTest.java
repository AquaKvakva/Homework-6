import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    private final StatsService service = new StatsService();
    long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void testAllAmount() {

        long result = service.getAllAmount(stats);

        Assertions.assertEquals(180, result);
    }

    @Test
    public void testAverageSalesAmount() {

        long result = service.getAverageSalesAmount(stats);

        Assertions.assertEquals(15, result);

    }

    @Test
    public void testMaxSales() {

        long result = service.maxSales(stats);

        Assertions.assertEquals(8, result);
    }

    @Test
    public void testMinSales() {

        long result = service.minSales(stats);

        Assertions.assertEquals(9, result);

    }

    @Test
    public void testSalesBelowAverage() {

        long result = service.getSalesBelowAverage(stats);

        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSalesAboveAverage() {

        long result = service.getSalesAboveAverage(stats);

        Assertions.assertEquals(5, result);
    }
}
