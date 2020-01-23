package fleamarketapp;

// インタフェース(抽象メソッドのみを持つクラス。
// 				インタフェースを継承するには子クラスの後に「implements インタフェースのクラス名」)
public interface ProductService {

	// 抽象メソッド(中身を持たないメソッド。継承した子クラスで中身を実装する)
	abstract void fetchProductInfo();
}
