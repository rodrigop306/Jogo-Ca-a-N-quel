package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import Controller.ControlaNum;
import java.awt.Font;
import javax.swing.SwingConstants;
public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNum1 = new JTextField();
		txtNum1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum1.setEditable(false);
		txtNum1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtNum1.setBounds(21, 56, 60, 80);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum2.setEditable(false);
		txtNum2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtNum2.setColumns(10);
		txtNum2.setBounds(101, 56, 60, 80);
		contentPane.add(txtNum2);
		
		txtNum3 = new JTextField();
		txtNum3.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum3.setEditable(false);
		txtNum3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtNum3.setColumns(10);
		txtNum3.setBounds(177, 56, 60, 80);
		contentPane.add(txtNum3);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBounds(259, 158, 89, 23);
		contentPane.add(btnJogar);
		
		ActionListener jogar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Thread c = new ControlaNum(txtNum1, btnJogar);
				c.start();
				Thread c1 = new ControlaNum(txtNum2, btnJogar);
				c1.start();
				Thread c2 = new ControlaNum(txtNum3, btnJogar);
				c2.start();
				
			}
		};
		btnJogar.addActionListener(jogar);
	}
	
}
