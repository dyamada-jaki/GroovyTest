package jp.jaki

// インポートするクラスに別名を付けられる
import java.lang.IllegalArgumentException as IAE;

class ClassAlias {

	static main(args) {
		if (!args) {
			throw new IAE("引数を入れてください。");
		}

	}

}
