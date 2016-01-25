package jp.jaki

class PropertyAccesser {

	static main(args) {

		SampleClass sc = new SampleClass();
		
		// フィールド１に値を設定
		sc.field1 = "フィールドセット";

		// フィールドの参照
		println sc.field1;
		println sc.field2;
		
		// Javaのクラスも同じように参照できる
		Date date = new Date();
		println "Date.TimeField:" + date.time;
	}

}


class SampleClass {
	
	def field1;
	def field2 = "Value2";
}