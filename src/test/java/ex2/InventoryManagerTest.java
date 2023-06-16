package ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Classe de test pour la classe InventoryManager.
 */
public class InventoryManagerTest {
    private InventoryManager inventoryManager;

    /**
     * Méthode exécutée avant chaque test pour initialiser l'objet InventoryManager.
     */
    @BeforeEach
    public void setup() {
        inventoryManager = new InventoryManager();
    }

    /**
     * Test la méthode getStockAvailability lorsque le stock est suffisant pour un produit.
     * Vérifie si la disponibilité du stock correspond à la quantité ajoutée.
     *
     * @param productId     l'identifiant du produit
     * @param stockQuantity la quantité de stock
     */
    @ParameterizedTest
    @CsvSource({"P001, 100", "P002, 5", "P003, 0"})
    public void testGetStockAvailability_sufficientStock(String productId, int stockQuantity) {
        inventoryManager.addProduct(productId, stockQuantity);

        int stockAvailability = inventoryManager.getStockAvailability(productId);

        Assertions.assertEquals(stockQuantity, stockAvailability);
    }

    /**
     * Test la méthode getStockAvailability lorsque le stock est insuffisant pour un produit.
     * Vérifie si la disponibilité du stock correspond à la quantité ajoutée.
     *
     * @param productId     l'identifiant du produit
     * @param stockQuantity la quantité de stock
     */
    @ParameterizedTest
    @CsvSource({"P004, 10", "P005, 2", "P006, 0"})
    public void testGetStockAvailability_insufficientStock(String productId, int stockQuantity) {
        inventoryManager.addProduct(productId, stockQuantity);

        int stockAvailability = inventoryManager.getStockAvailability(productId);

        Assertions.assertEquals(stockQuantity, stockAvailability);
    }

    /**
     * Test la méthode getStockAvailability lorsque le stock est vide pour un produit.
     * Vérifie si la disponibilité du stock correspond à la quantité ajoutée.
     *
     * @param productId     l'identifiant du produit
     * @param stockQuantity la quantité de stock
     */
    @ParameterizedTest
    @CsvSource({"P007, 0", "P008, 0", "P009, 0"})
    public void testGetStockAvailability_emptyStock(String productId, int stockQuantity) {
        inventoryManager.addProduct(productId, stockQuantity);

        int stockAvailability = inventoryManager.getStockAvailability(productId);

        Assertions.assertEquals(stockQuantity, stockAvailability);
    }

    /**
     * Test la méthode getStockAvailability lorsqu'un produit n'est pas présent dans l'inventaire.
     * Vérifie si une IllegalArgumentException est levée.
     *
     * @param productId     l'identifiant du produit
     * @param stockQuantity la quantité de stock
     */
    @ParameterizedTest
    @CsvSource({"P007, 0", "P008, 0", "P009, 0"})
    public void testGetStockAvailability_productNotInInventory(String productId, int stockQuantity) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            inventoryManager.removeProduct(productId, stockQuantity);
        });
    }
}
