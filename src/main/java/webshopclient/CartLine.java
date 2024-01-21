package webshopclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CartLine {
	int quantity;
	Product product;

	@Override
	public String toString() {
		return "CartLine{" +
				"quantity='" + quantity + '\'' +
				", product= {'" + product.toString()+
				'}';
	}
}
