package jp.jaki

class AsBoolean {

	static main(args) {
	
		// �T���v���N���X�̍쐬�B�R���X�g���N�^�ɒ���
		BooleanSample bs = new BooleanSample(count:5);
		if(bs){		println "true���ԋp���ꂽ"
		} else {	println "false���ԋp���ꂽ"		}
		
		BooleanSample bs2 = new BooleanSample(count:6);
		if(bs2){	println "true���ԋp���ꂽ"
		} else {	println "false���ԋp���ꂽ"		}

	}
}

class BooleanSample {
	int count;
	boolean asBoolean() {
		return count > 5;
	}
}