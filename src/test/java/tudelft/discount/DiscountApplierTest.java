package tudelft.discount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DiscountApplierTest {

    @Test
    void testHomeCategoryDiscount() {

        ProductDao dao = Mockito.mock(ProductDao.class);

        Product p1 = new Product("Refrigeradora", 1000, "HOME");

        Mockito.when(dao.all()).thenReturn(Arrays.asList(p1));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(900, p1.getPrice());
    }

    @Test
    void testBusinessCategoryIncrease() {

        ProductDao dao = Mockito.mock(ProductDao.class);

        Product p1 = new Product("Laptop", 1000, "BUSINESS");

        Mockito.when(dao.all()).thenReturn(Arrays.asList(p1));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(1100, p1.getPrice());
    }

    @Test
    void testMultipleProducts() {

        ProductDao dao = Mockito.mock(ProductDao.class);

        Product p1 = new Product("TV", 500, "HOME");
        Product p2 = new Product("PC", 800, "BUSINESS");

        Mockito.when(dao.all()).thenReturn(Arrays.asList(p1, p2));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(450, p1.getPrice());
        assertEquals(880, p2.getPrice());
    }
}