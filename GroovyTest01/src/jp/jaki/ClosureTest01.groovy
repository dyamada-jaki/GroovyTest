package jp.jaki

class ClosureTest01 {

	static main(args) {
	
		// クロージャには引数を渡すこともできる。
		
		// クロージャの定義　　　↓仮引数
		Closure clos = { param="a", param2="v" -> println "受け取った引数は $param, $param2" }
		
		// クロージャを実行
		clos("「引数」", "wwww");
		clos(param2:"xxxx");
		
		// 予約されている引数の例
		// it : 一つの引数を取る場合の仮引数
		// this : クロージャの定義を含むクラス
		// owner: クロージャを含むオブジェクト（？）
		// delegate: ownerと同じ。ただし、変更することが可能
		Closure clos2 = {	println "it       : $it";
							println "this     : $this";
							println "owner    : $owner";
							println "delegate : $delegate"; }

		clos2("引数")
		
		// クロージャ自体を引数として渡すこともできる
		paramClosure("メソッド", clos);
		
		// 引数を拒否する方法
		Closure clos3 = { -> println "引数は受け取りません！" }
		clos3();	// OK
		clos3("a");	// NG
	}

	static paramClosure(String param, Closure clo) {
		clo(param);
	}
}
