package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.VooController;
import model.Voo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IncluirVoo extends JFrame {

	private JPanel contentPane;
	private JTextField txtCod;
	private JTextField txtDataP;
	private JTextField txtDataC;
	private JTextField txtHoraS;
	private JTextField txtHoraC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncluirVoo frame = new IncluirVoo();
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
	public IncluirVoo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 233, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo:");
		label.setBounds(10, 14, 46, 14);
		contentPane.add(label);
		
		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(100, 11, 86, 20);
		contentPane.add(txtCod);
		
		JLabel label_1 = new JLabel("Data Partida:");
		label_1.setBounds(10, 39, 75, 14);
		contentPane.add(label_1);
		
		txtDataP = new JTextField();
		txtDataP.setColumns(10);
		txtDataP.setBounds(100, 36, 86, 20);
		contentPane.add(txtDataP);
		
		JLabel label_2 = new JLabel("Data Chegada:");
		label_2.setBounds(10, 64, 83, 14);
		contentPane.add(label_2);
		
		txtDataC = new JTextField();
		txtDataC.setColumns(10);
		txtDataC.setBounds(100, 61, 86, 20);
		contentPane.add(txtDataC);
		
		JLabel label_3 = new JLabel("Hora Sa\u00EDda:");
		label_3.setBounds(10, 89, 83, 14);
		contentPane.add(label_3);
		
		txtHoraS = new JTextField();
		txtHoraS.setColumns(10);
		txtHoraS.setBounds(100, 86, 86, 20);
		contentPane.add(txtHoraS);
		
		JLabel label_4 = new JLabel("Hora Chegada:");
		label_4.setBounds(10, 114, 83, 14);
		contentPane.add(label_4);
		
		txtHoraC = new JTextField();
		txtHoraC.setColumns(10);
		txtHoraC.setBounds(100, 111, 86, 20);
		contentPane.add(txtHoraC);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VooController control = new VooController();
				Voo voo = new Voo();
				
				voo.setIdVoo(txtCod.getText());
				voo.setData_Ini_Ag(txtDataP.getText());
				voo.setData_Fim_Ag(txtDataC.getText());
				voo.setHora_Ini_Ag(txtHoraS.getText());
				voo.setHora_Fim_Ag(txtHoraC.getText());
				
				if(control.create(voo) == 1) {
					
					JOptionPane.showMessageDialog(null,"Adicionado com Sucesso!");
				}
				else
					JOptionPane.showMessageDialog(null,"Erro ao adicionar!");
				
				setVisible(false);
			}
		});
		btnSalvar.setBounds(128, 178, 89, 23);
		contentPane.add(btnSalvar);
	}

}
