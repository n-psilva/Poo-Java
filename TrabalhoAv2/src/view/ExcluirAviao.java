package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AviaoController;
import model.Aviao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExcluirAviao extends JFrame {

	private JPanel contentPane;
	private JTextField txtCod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirAviao frame = new ExcluirAviao();
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
	public ExcluirAviao() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 195, 130);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo:");
		label.setBounds(10, 14, 46, 14);
		contentPane.add(label);
		
		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(56, 11, 86, 20);
		contentPane.add(txtCod);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Aviao aviao = new Aviao();
				AviaoController control = new AviaoController();
				
				aviao.setIdAviao(txtCod.getText());
				
				if(control.delete(aviao) == 1) {
					
					JOptionPane.showMessageDialog(null, "Removido com sucesso!");
				}
				else
					JOptionPane.showMessageDialog(null,"Erro ao remover!");
					
				setVisible(false);
			}
		});
		btnConcluir.setBounds(90, 67, 89, 23);
		contentPane.add(btnConcluir);
	}

}
