package jp.jaki

class StringPattern {

	static main(args) {
		String val = "変数";
		
		// ダブルクォーテーションで囲む場合
		// 変数：○、エスケープ：○
		println "value is $val \\";
		
		// シングルクォーテーションで囲む場合
		// 変数：×、エスケープ：○
		println 'value is $val \\';

	}

}
