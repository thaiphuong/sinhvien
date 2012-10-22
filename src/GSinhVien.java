import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;


public class GSinhVien extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtmssv;
	private JTextField txtho;
	private JLabel lblNewLabel_2;
	private JTextField txtdtb;
	private JButton btadd;
	private JButton btclear;
	private JButton btthoat;
	private JButton btshow;
	private JTextField txtten;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GSinhVien frame = new GSinhVien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */ ArrayList<CSinhVien> dssv= new ArrayList<CSinhVien>();
	private JTextArea txtdssv;
	public GSinhVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTxtmssv());
		contentPane.add(getTxtho());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTxtdtb());
		contentPane.add(getBtadd());
		contentPane.add(getBtclear());
		contentPane.add(getBtthoat());
		contentPane.add(getBtshow());
		contentPane.add(getTxtten());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTxtdssv());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("MSSV");
			lblNewLabel.setBounds(40, 30, 46, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Ho");
			lblNewLabel_1.setBounds(40, 60, 46, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getTxtmssv() {
		if (txtmssv == null) {
			txtmssv = new JTextField();
			txtmssv.setBounds(109, 27, 86, 20);
			txtmssv.setColumns(10);
		}
		return txtmssv;
	}
	private JTextField getTxtho() {
		if (txtho == null) {
			txtho = new JTextField();
			txtho.setBounds(69, 57, 86, 20);
			txtho.setColumns(10);
		}
		return txtho;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("DTB");
			lblNewLabel_2.setBounds(40, 99, 46, 14);
		}
		return lblNewLabel_2;
	}
	private JTextField getTxtdtb() {
		if (txtdtb == null) {
			txtdtb = new JTextField();
			txtdtb.setBounds(144, 96, 86, 20);
			txtdtb.setColumns(10);
		}
		return txtdtb;
	}
	private JButton getBtadd() {
		if (btadd == null) {
			btadd = new JButton("Add");
			btadd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CSinhVien sv=new CSinhVien();
					sv.mssv=txtmssv.getText();
					sv.ho=txtho.getText();
					sv.ten=txtten.getText();
					sv.dtb=Float.parseFloat(txtdtb.getText());
					dssv.add(sv);
					
				}
			});
			btadd.setBounds(10, 128, 89, 23);
		}
		return btadd;
	}
	private JButton getBtclear() {
		if (btclear == null) {
			btclear = new JButton("Clear");
			btclear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtmssv.setText(" ");
					txtho.setText(" ");
					txtten.setText(" ");
					txtdtb.setText(" ");
					txtho.requestFocus();
				}
			});
			btclear.setBounds(109, 128, 89, 23);
		}
		return btclear;
	}
	private JButton getBtthoat() {
		if (btthoat == null) {
			btthoat = new JButton("thoat");
			btthoat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btthoat.setBounds(10, 177, 89, 23);
		}
		return btthoat;
	}
	private JButton getBtshow() {
		if (btshow == null) {
			btshow = new JButton("Show");
			btshow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for(CSinhVien sv: dssv)
					{
						txtdssv.setText(txtdssv.getText()+sv.xuat());
					}
				}
			});
			btshow.setBounds(109, 177, 89, 23);
		}
		return btshow;
	}
	private JTextField getTxtten() {
		if (txtten == null) {
			txtten = new JTextField();
			txtten.setBounds(191, 57, 86, 20);
			txtten.setColumns(10);
		}
		return txtten;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Ten");
			lblNewLabel_3.setBounds(165, 60, 46, 14);
		}
		return lblNewLabel_3;
	}
	private JTextArea getTxtdssv() {
		if (txtdssv == null) {
			txtdssv = new JTextArea();
			txtdssv.setBounds(293, 11, 131, 235);
		}
		return txtdssv;
	}
}
