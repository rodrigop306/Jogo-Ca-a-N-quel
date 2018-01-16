package Controller;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ControlaNum extends Thread {
	private JTextField txtNum;
	private JButton btnComešar;

	public ControlaNum(JTextField txtNum, JButton btnComešar) {
		this.txtNum=txtNum;
		this.btnComešar=btnComešar;
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
		btnComešar.setEnabled(false);
		Random r=new Random();
		for(int i=0;i<150;i++) {
			//Random r=new Random(7);
			int num = r.nextInt(7)+1;
			txtNum.setText(""+num);
			Thread.sleep(20);
			if(i==149) {
				btnComešar.setEnabled(true);
			}else {
				btnComešar.setEnabled(false);
			}
		}
		btnComešar.setEnabled(true);
	}
}
