package jp.jaki

class AsBoolean {

	static main(args) {
	
		// サンプルクラスの作成。コンストラクタに注目
		BooleanSample bs = new BooleanSample(count:5);
		if(bs){		println "trueが返却された"
		} else {	println "falseが返却された"		}
		
		BooleanSample bs2 = new BooleanSample(count:6);
		if(bs2){	println "trueが返却された"
		} else {	println "falseが返却された"		}

	}
}

class BooleanSample {
	int count;
	boolean asBoolean() {
		return count > 5;
	}
}