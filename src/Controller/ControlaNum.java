package Controller;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ControlaNum extends Thread {
	private JTextField txtNum;
	private JButton btnComeçar;

	public ControlaNum(JTextField txtNum, JButton btnComeçar) {
		this.txtNum=txtNum;
		this.btnComeçar=btnComeçar;
	}
	public void run() {
		try {
			sorteiaNum();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void sorteiaNum() throws InterruptedException {
		btnComeçar.setEnabled(false);
		Random r=new Random();
		for(int i=0;i<150;i++) {
			//Random r=new Random(7);
			int num = r.nextInt(7)+1;
			txtNum.setText(""+num);
			Thread.sleep(20);
			if(i==149) {
				btnComeçar.setEnabled(true);
			}else {
				btnComeçar.setEnabled(false);
			}
		}
		btnComeçar.setEnabled(true);
	}
}
