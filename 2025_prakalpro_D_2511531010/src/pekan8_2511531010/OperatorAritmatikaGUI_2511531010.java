package pekan8_2511531010;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511531010 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textangka1;
	private JTextField textangka2;
	private JTextField texthasil;
	
	private void pesanPeringatan (String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError (String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"kesalahan",JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511531010 frame = new OperatorAritmatikaGUI_2511531010();
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
	public OperatorAritmatikaGUI_2511531010() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 20, 394, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Angka 1");
		lblNewLabel_1.setBounds(30, 42, 91, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Angka 2");
		lblNewLabel_1_1.setBounds(30, 82, 91, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Operator");
		lblNewLabel_1_1_1.setBounds(30, 123, 91, 31);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hasil");
		lblNewLabel_1_1_1_1.setBounds(30, 172, 91, 31);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textangka1 = new JTextField();
		textangka1.setHorizontalAlignment(SwingConstants.CENTER);
		textangka1.setBounds(87, 48, 65, 24);
		contentPane.add(textangka1);
		textangka1.setColumns(10);
		
		textangka2 = new JTextField();
		textangka2.setHorizontalAlignment(SwingConstants.CENTER);
		textangka2.setBounds(87, 88, 65, 24);
		contentPane.add(textangka2);
		textangka2.setColumns(10);
		
		texthasil = new JTextField();
		texthasil.setEditable(false);
		texthasil.setHorizontalAlignment(SwingConstants.CENTER);
		texthasil.setBounds(87, 178, 65, 24);
		contentPane.add(texthasil);
		texthasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(87, 123, 65, 28);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if(textangka1.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 1");	
				} else if(textangka2.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 2");	
				} else {
					try {
						int a= Integer.valueOf(textangka1.getText());
						int b= Integer.valueOf(textangka2.getText());
						int c= cbOperator.getSelectedIndex();
						if(c==0) {hasil= a+b; }
						if(c==1) {hasil= a-b; }
						if(c==2) {hasil= a*b; }
						if(c==3) {hasil= a/b; }
						if(c==4) {hasil= a%b; }
						texthasil.setText(String.valueOf(hasil));
					} catch (NumberFormatException ex) {
						pesanError("Angka 1 dan Angka 2 tidak valid");
					}
				}
				
			}
		});
		btnNewButton.setBounds(176, 126, 84, 24);
		contentPane.add(btnNewButton);

	}
}
