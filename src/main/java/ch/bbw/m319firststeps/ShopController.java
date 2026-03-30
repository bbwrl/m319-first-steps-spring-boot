package ch.bbw.m319firststeps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * ShopController – dieser Controller stellt die Produkte über HTTP bereit.
 * Wie eine "Adresse" im Internet:
 *   http://localhost:8080/shop/products  → zeigt alle Produkte
 *   http://localhost:8080/shop/product/0 → zeigt Produkt mit Index 0
 * Sie müssen diesen Code NICHT verändern.
 * Ihre Aufgabe liegt in der Klasse Product.java
 * - Die Klasse arbeitet mit einer einfachen Liste als "Datenbank"
 * - Der Konstruktor füllt die Liste mit Beispielprodukten
 */
@RestController
@RequestMapping("/shop")
public class ShopController {

    private final List<Product> products = new ArrayList<>();

    public ShopController() {
        products.add(new Product("Laptop",        "Elektronik", 999.00, 5));
        products.add(new Product("Kopfhörer",     "Elektronik", 149.90, 12));
        products.add(new Product("Schreibtisch",  "Möbel",      349.00, 3));
        products.add(new Product("Kaffee 500g",   "Lebensmittel", 8.90, 50));
        products.add(new Product("Fahrrad",       "Sport",      599.00, 0)); // nicht verfügbar
    }

    // GET /shop/products --> alle Produktnamen
    @GetMapping("/products")
    public List<String> getAllProductNames() {
        List<String> names = new ArrayList<>();
        for (Product p : products) {
            names.add(p.getName());
        }
        return names;
    }

    // GET /shop/product/{index} --> ein Produkt als Text
    @GetMapping("/products/{index}")
    public String getProduct(@PathVariable int index) {
        if (index < 0 || index >= products.size()) {
            return "Produkt nicht gefunden";
        }
        Product p = products.get(index);

        // TODO: Sobald Sie getInfo() implementiert haben, ersetzen Sie die nächste Zeile:
        // return p.getInfo();
        return p.getName() + " (" + p.getCategory() + ")";
    }

    // GET /shop/product/{index}/price --> Preis eines Produktes
    @GetMapping("/product/{index}/price")
    public String getPrice(@PathVariable int index) {
        if (index < 0 || index >= products.size()) {
            return "Produkt nicht gefunden";
        }
        Product p = products.get(index);

        // TODO: Sobald Sie getPrice() und getPriceWithVat() implementiert haben:
        // return "Preis: CHF " + p.getPrice() + " | inkl. MWST: CHF " + p.getPriceWithVat();
        return "Getter noch nicht implementiert – Aufgabe 1 lösen!";
    }

    // GET /shop/product/{index}/available -> Verfügbarkeit
    @GetMapping("/product/{index}/available")
    public String isAvailable(@PathVariable int index) {
        if (index < 0 || index >= products.size()) {
            return "Produkt nicht gefunden";
        }
        Product p = products.get(index);

        // TODO: Sobald Sie isAvailable() implementiert haben:
        // return p.getName() + " ist " + (p.isAvailable() ? "verfügbar" : "nicht verfügbar");
        return "Getter noch nicht implementiert – Aufgabe 3 lösen!";
    }
}
