package jp.jaki

class ClosureTest00 {

	static main(args) {
	
		// クロージャとは、「生成時のコンテキストを含んだコードブロック」
		
		// クロージャの定義
		Closure clos = { println "クロージャで表示" }
		
		// 実行方法１
		clos.call();
		
		// 実行方法２
		clos();
		
	}

}
