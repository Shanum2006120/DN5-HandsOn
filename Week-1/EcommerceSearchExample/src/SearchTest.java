public class SearchTest {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {

        for (Product p : products) {
            if (p.productId == id)
                return p;
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == id)
                return products[mid];

            else if (products[mid].productId < id)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        System.out.println("Linear Search:");

        Product p1 = linearSearch(products, 104);

        if (p1 != null)
            System.out.println(p1.productName);

        System.out.println();

        System.out.println("Binary Search:");

        Product p2 = binarySearch(products, 104);

        if (p2 != null)
            System.out.println(p2.productName);
    }
}