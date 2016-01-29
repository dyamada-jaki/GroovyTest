package jp.jaki

class ClosureTest01 {

	static main(args) {
	
		// �N���[�W���ɂ͈�����n�����Ƃ��ł���B
		
		// �N���[�W���̒�`�@�@�@��������
		Closure clos = { param="a", param2="v" -> println "�󂯎���������� $param, $param2" }
		
		// �N���[�W�������s
		clos("�u�����v", "wwww");
		clos(param2:"xxxx");
		
		// �\�񂳂�Ă�������̗�
		// it : ��̈��������ꍇ�̉�����
		// this : �N���[�W���̒�`���܂ރN���X
		// owner: �N���[�W�����܂ރI�u�W�F�N�g�i�H�j
		// delegate: owner�Ɠ����B�������A�ύX���邱�Ƃ��\
		Closure clos2 = {	println "it       : $it";
							println "this     : $this";
							println "owner    : $owner";
							println "delegate : $delegate"; }

		clos2("����")
		
		// �N���[�W�����̂������Ƃ��ēn�����Ƃ��ł���
		paramClosure("���\�b�h", clos);
		
		// ���������ۂ�����@
		Closure clos3 = { -> println "�����͎󂯎��܂���I" }
		clos3();	// OK
		clos3("a");	// NG
	}

	static paramClosure(String param, Closure clo) {
		clo(param);
	}
}
