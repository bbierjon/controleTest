package ex2;

import java.util.HashMap;
import java.util.Map;

/**
 * Gestionnaire d'inventaire pour suivre les quantités de produits disponibles.
 */
public class InventoryManager {
    private Map<String, Integer> inventory;

    /**
     * Constructeur de la classe InventoryManager.
     */
    public InventoryManager() {
        inventory = new HashMap<>();
    }

    /**
     * Ajoute un produit à l'inventaire avec une quantité spécifiée.
     *
     * @param productId   Identifiant du produit.
     * @param quantity    Quantité à ajouter.
     * @throws IllegalArgumentException si la quantité est inférieure à zéro.
     */
    public void addProduct(String productId, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("La quantité doit être supérieure ou égale à zéro.");
        }

        inventory.put(productId, inventory.getOrDefault(productId, 0) + quantity);
    }

    /**
     * Retire une quantité spécifiée du produit de l'inventaire.
     *
     * @param productId   Identifiant du produit.
     * @param quantity    Quantité à retirer.
     * @throws IllegalArgumentException si le produit n'est pas présent dans l'inventaire
     *                                  ou si la quantité à retirer est supérieure à celle disponible.
     */
    public void removeProduct(String productId, int quantity) {
        if (!inventory.containsKey(productId)) {
            throw new IllegalArgumentException("Le produit n'est pas présent dans l'inventaire.");
        }

        int currentQuantity = inventory.get(productId);
        if (quantity > currentQuantity) {
            throw new IllegalArgumentException("La quantité à retirer est supérieure à celle disponible.");
        }

        inventory.put(productId, currentQuantity - quantity);
    }

    /**
     * Obtient la disponibilité de stock pour un produit donné.
     *
     * @param productId   Identifiant du produit.
     * @return La quantité disponible en stock pour le produit donné.
     */
    public int getStockAvailability(String productId) {
        return inventory.getOrDefault(productId, 0);
    }
}
