package ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class InventoryManagerTest {
    private InventoryManager inventoryManager;


    @BeforeEach
    public void setup() {
        inventoryManager = new InventoryManager();
    }

    
    @ParameterizedTest
    @CsvSource({"P001, 100", "P002, 5", "P003, 0"})
    public void testGetStockAvailability_sufficientStock(String productId, int stockQuantity) {
        inventoryManager.addProduct(productId, stockQuantity);

        int stockAvailability = inventoryManager.getStockAvailability(productId);

        Assertions.assertEquals(stockQuantity, stockAvailability);
    }


    @ParameterizedTest
    @CsvSource({"P004, 10", "P005, 2", "P006, 0"})
    public void testGetStockAvailability_insufficientStock(String productId, int stockQuantity) {
        inventoryManager.addProduct(productId, stockQuantity);

        int stockAvailability = inventoryManager.getStockAvailability(productId);

        Assertions.assertEquals(stockQuantity, stockAvailability);
    }

    @ParameterizedTest
    @CsvSource({"P007, 0", "P008, 0", "P009, 0"})
    public void testGetStockAvailability_emptyStock(String productId, int stockQuantity) {
        inventoryManager.addProduct(productId, stockQuantity);

        int stockAvailability = inventoryManager.getStockAvailability(productId);

        Assertions.assertEquals(stockQuantity, stockAvailability);
    }

    @ParameterizedTest
    @CsvSource({"P007, 0", "P008, 0", "P009, 0"})
    public void testGetStockAvailability_productNotInInventory(String productId, int stockQuantity) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            inventoryManager.removeProduct(productId, stockQuantity);
        });
    }
}
