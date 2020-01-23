package fleamarketapp;

public class ProductServiceRun {
	private ProductService productservice;

	// main関数
	public static void main(String[] args) {

		ProductService productservice = new ProductServiceImpl();
		productservice.fetchProductInfo();
	}

}
