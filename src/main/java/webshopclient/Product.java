package webshopclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    String productNumber;
    String name;
    double price;
    String description;

    @Override
    public String toString() {
        return "Product{" +
                "number='" + productNumber + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", desc=" + description +
                '}';
    }
}
