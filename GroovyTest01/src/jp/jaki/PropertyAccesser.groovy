package jp.jaki

class PropertyAccesser {

	static main(args) {

		SampleClass sc = new SampleClass();
		
		// �t�B�[���h�P�ɒl��ݒ�
		sc.field1 = "�t�B�[���h�Z�b�g";

		// �t�B�[���h�̎Q��
		println sc.field1;
		println sc.field2;
		
		// Java�̃N���X�������悤�ɎQ�Ƃł���
		Date date = new Date();
		println "Date.TimeField:" + date.time;
	}

}


class SampleClass {
	
	def field1;
	def field2 = "Value2";
}