package ch.bbw.m319firststeps;

/**
 * Klasse Product – Modell eines Produktes im Shop.
 * Aufgabe: Ergänzen Sie die fehlenden Getter-Methoden (markiert mit TODO)
 *          und fügen Sie eigene Eigenschaften und Methoden hinzu.
 */
public class Product {

    private String name;
    private String category;
    private double price;
    private int stock;
    private boolean available;

    public Product(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.available = stock > 0;
    }

    // --- Getter-Methoden ---
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    // TODO Aufgabe 1: Implementieren Sie den Getter für "price"
    // public double getPrice() { ... }

    // TODO Aufgabe 2: Implementieren Sie den Getter für "stock"
    // public int getStock() { ... }

    // TODO Aufgabe 3: Implementieren Sie den Getter für "available"
    // Tipp: Bei boolean-Eigenschaften nennen wir die Getter "is..." statt "get..."
    // public boolean isAvailable() { ... }

    // --- Setter-Methoden ---
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        this.stock = stock;
        this.available = stock > 0;
    }

    // --- Eigene Methoden ---
    /**
     * TODO Aufgabe 4: Schreiben Sie eine Methode "getPriceWithVat",
     * die den Preis inkl. 8.1% Mehrwertsteuer zurückgibt (double).
     */

    /**
     * TODO Aufgabe 5: Schreiben Sie eine Methode "getInfo",
     * die einen formatierten String zurückgibt, z.B.:
     * "Laptop | Elektronik | CHF 999.00 | 5 Stück"
     */
}
