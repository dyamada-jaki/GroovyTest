package jp.jaki

class DataTypeDefKeyword {

	static main(args) {
		
		// 変数の型は省略できます。この場合、defを使用します。
		
		// 数値を設定
		def val = 1;
		
		println val;
		println val.class;
		
		// 文字を設定
		val = "String";
		
		println val;
		println val.class;
		
	}

}
