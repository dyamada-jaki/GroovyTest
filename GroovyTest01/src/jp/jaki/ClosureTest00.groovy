package jp.jaki

class ClosureTest00 {

	static main(args) {
	
		// �N���[�W���Ƃ́A�u�������̃R���e�L�X�g���܂񂾃R�[�h�u���b�N�v
		
		// �N���[�W���̒�`
		Closure clos = { println "�N���[�W���ŕ\��" }
		
		// ���s���@�P
		clos.call();
		
		// ���s���@�Q
		clos();
		
	}

}
