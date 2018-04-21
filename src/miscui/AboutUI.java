package miscui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class AboutUI extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUI frame = new AboutUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AboutUI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(AboutUI.class.getResource("/img/crypto.png")));
		setTitle("About");
		setBounds(100, 100, 757, 477);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AboutUI.class.getResource("/img/darina.jpg")));
		lblNewLabel.setBounds(10, 219, 170, 150);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(AboutUI.class.getResource("/img/bilal.jpg")));
		label.setBounds(285, 219, 170, 150);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(AboutUI.class.getResource("/img/atashi.jpg")));
		label_1.setBounds(561, 219, 170, 150);
		contentPane.add(label_1);
		
		JLabel lblCryptitIsAn = new JLabel("CryptIT! is an encrypting and decrypting application that has inbuilt algorithms ");
		lblCryptitIsAn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCryptitIsAn.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCryptitIsAn.setBounds(161, 180, 465, 28);
		contentPane.add(lblCryptitIsAn);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(AboutUI.class.getResource("/img/logo.jpg")));
		label_2.setBounds(217, 19, 170, 150);
		contentPane.add(label_2);
		
		JLabel lblBilalHHungund = new JLabel("Darina Gomes");
		lblBilalHHungund.setHorizontalAlignment(SwingConstants.CENTER);
		lblBilalHHungund.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblBilalHHungund.setBounds(10, 380, 170, 28);
		contentPane.add(lblBilalHHungund);
		
		JLabel lblDarinaGom = new JLabel("Bilal H. Hungund");
		lblDarinaGom.setHorizontalAlignment(SwingConstants.CENTER);
		lblDarinaGom.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblDarinaGom.setBounds(285, 380, 170, 28);
		contentPane.add(lblDarinaGom);
		
		JLabel lblAtashiKhatua = new JLabel("Atashi Khatua");
		lblAtashiKhatua.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtashiKhatua.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblAtashiKhatua.setBounds(561, 380, 170, 28);
		contentPane.add(lblAtashiKhatua);
		
		JLabel lblNewLabel_1 = new JLabel("CryptIt!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 38));
		lblNewLabel_1.setBounds(405, 59, 178, 83);
		contentPane.add(lblNewLabel_1);
	}
}
