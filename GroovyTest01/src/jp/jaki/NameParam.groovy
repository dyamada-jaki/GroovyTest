package jp.jaki

class NameParam {

	static main(args) {
		// �������A����Ȋ����œn����B
		println "-- printData --"
		printData(value: "�l",
			      title: "�^�C�g��");

		// �����ȗ�
		println "-- defaultData 1 --"
		defaultData("�l");
		
		println "-- defaultData 2 --"
		defaultData("�L�[�Q", "�l�Q");
	}

	static printData(Map param) {
		// Map�̎Q�Ƃ́A�u.�v�i�s���I�h�j�ŎQ�Ƃł���B
		println "title:" + param.title;
		println "value:" + param.value;
		println "default:" + param.default;
	}
	
	static defaultData(String key1="�f�t�H���g�L�[", String val1) {
		println "Key1:" + key1;
		println "val1:" + val1;
	}
}
