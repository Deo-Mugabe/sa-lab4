package webshopclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class RestClientApplication implements CommandLineRunner {


	RestTemplate restTemplate = new RestTemplate();
	private String serverUrl = "http://localhost:8080";

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Adding New Product");
		restTemplate.postForLocation(serverUrl + "/products", new Product("0002","Product2", 59.99, "Intresting Product 2"));
		System.out.println("Added new Product");

		System.out.println("Getting Product");
		Product product = restTemplate.getForObject(serverUrl + "/products/0002",Product.class);
		System.out.println(product);
		System.out.println("Got Product");

		System.out.println("Adding Product to Shopping Cart");
		restTemplate.postForLocation(serverUrl + "/carts", new AddToCartDto(2,"0002", 5));

		System.out.println("Added Product to Shopping Cart");

		System.out.println("Getting Shopping Cart");
		ShoppingCart cart = restTemplate.getForObject(serverUrl + "/carts/2",ShoppingCart.class);
		System.out.println(cart);
		System.out.println("Got Shopping Cart");
	}
}
