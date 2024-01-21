package webshopclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShoppingCart {
    int cartId;
    List<CartLine> cartLineList = new ArrayList<>();

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "Id='" + cartId + '\'' +
                ", CartLines= {'" +
                    cartLineList.stream().map(CartLine::toString).reduce("", (acc, cartLineStr) -> acc + cartLineStr) +
                '}';
    }
}
