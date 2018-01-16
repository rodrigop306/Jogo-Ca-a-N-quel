package Controller;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ControlaNum extends Thread {
	private JTextField txtNum;
	private JButton btnCome�ar;

	public ControlaNum(JTextField txtNum, JButton btnCome�ar) {
		this.txtNum=txtNum;
		this.btnCome�ar=btnCome�ar;
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
		btnCome�ar.setEnabled(false);
		Random r=new Random();
		for(int i=0;i<150;i++) {
			//Random r=new Random(7);
			int num = r.nextInt(7)+1;
			txtNum.setText(""+num);
			Thread.sleep(20);
			if(i==149) {
				btnCome�ar.setEnabled(true);
			}else {
				btnCome�ar.setEnabled(false);
			}
		}
		btnCome�ar.setEnabled(true);
	}
}
