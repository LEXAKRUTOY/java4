
public class Main {

    public static void main(String[] args) {
        Product product = new Product("Apple", 100, 0.5f);

        product.displayInfo();
        product.increaseQuantity(20);
        product.decraseQuantity(30);
        product.changePrice(0.7f);
        product.displayInfo();
    }
}
    class Product {

        String name;
        int quantity;
        float price;

        public Product(String name, int quantity, float price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
        void displayInfo(){
            System.out.printf("Name: %s \t Quantity: %d \t Price: %.2f", name, quantity, price);
        }
        void increaseQuantity(int a){
            quantity += a;
            System.out.printf("\nThe quantity of the product increases by %d pieces. The new quantity of products is %d", a, quantity);
        }
        void decraseQuantity(int a){
            quantity -= a;
            System.out.printf("\nThe quantity of the product decreases by %d pieces. The new quantity of products is %d", a, quantity);
        }
        void changePrice(float a){
            price = a;
            System.out.printf("\nPrice changed to %.2f\n", a);
        }
    }

