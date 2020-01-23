package fleamarketapp;

// インタフェースを継承したいのでクラス名の後に「implements インタフェースのクラス名」
public class ProductServiceImpl implements ProductService{

	// インタフェースに定義されているfetchProductInfo()をオーバーライドし、実装する。
	public void fetchProductInfo() {

		ProductRepository productrepository = new ProductRepository("ﾌｰﾄﾞ付きﾊﾟｰｶｰ",1200,"ウニクロ","フリーサイズ",12,"ﾜﾝﾎﾟｲﾝﾄでﾛｺﾞが入っています");

		System.out.println(productrepository.getName());
		System.out.println(productrepository.getPrice());
		System.out.println(productrepository.getLabel());
		System.out.println(productrepository.getSize());
		System.out.println(productrepository.getGood());
		System.out.println(productrepository.getComment());

	}

}
