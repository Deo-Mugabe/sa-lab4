package webshopclient;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddToCartDto {
    int cartId;
    String productNumber;
    int quantity;
}
