package jp.jaki

class NameParam {

	static main(args) {
		// 引数を、こんな感じで渡せる。
		println "-- printData --"
		printData(value: "値",
			      title: "タイトル");

		// 引数省略
		println "-- defaultData 1 --"
		defaultData("値");
		
		println "-- defaultData 2 --"
		defaultData("キー２", "値２");
	}

	static printData(Map param) {
		// Mapの参照は、「.」（ピリオド）で参照できる。
		println "title:" + param.title;
		println "value:" + param.value;
		println "default:" + param.default;
	}
	
	static defaultData(String key1="デフォルトキー", String val1) {
		println "Key1:" + key1;
		println "val1:" + val1;
	}
}
