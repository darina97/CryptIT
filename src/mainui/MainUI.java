package mainui;

import hashingui.MD5UI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import miscui.AboutUI;
import decryptui.CaesarDecrypt;
import decryptui.DecryptMainUI;
import encryptui.EncryptMainUI;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class MainUI extends JFrame 
{
	private JPanel contentPane;
	JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
	
	JMenuBar mbr = new JMenuBar();
	
	JMenu ciphersMenu = new JMenu("Ciphers");
	
	JMenu encryptMenu = new JMenu("Encrypt");
	JMenu decryptMenu = new JMenu("Decrypt");
	
	JMenuItem caesarEncryptMenu = new JMenuItem("Caesar Cipher");
	JMenuItem viginereEncryptMenu = new JMenuItem("Viginere Cipher");
	JMenuItem railfenceEncryptMenu = new JMenuItem("Rail Fence Cipher");
	JMenuItem playfairEncryptMenu = new JMenuItem("Play Fair Cipher");
	JMenuItem columnerEncryptMenu = new JMenuItem("Columner Cipher");
	JMenuItem fibbilEncryptMenu = new JMenuItem("FibBil Technique");
	
	JMenuItem caesarDecryptMenu = new JMenuItem("Caesar Cipher");
	JMenuItem viginereDecryptMenu = new JMenuItem("Viginere Cipher");
	JMenuItem railfenceDecryptMenu = new JMenuItem("Rail Fence Cipher");
	JMenuItem playfairDecryptMenu = new JMenuItem("Play Fair Cipher");
	JMenuItem columnerDecryptMenu = new JMenuItem("Columner Cipher");
	JMenuItem fibbilDecryptMenu = new JMenuItem("FibBil Technique");
	
	JMenuItem rsaAlgorithmMenu = new JMenuItem("RSA Algorithm");
	
	JMenuItem md5Menu = new JMenuItem("MD5 Algorithm");
	
	JMenu settingsMenu = new JMenu("Settings");
	JMenuItem aboutMenu = new JMenuItem("About");
	JMenuItem helpMenu = new JMenuItem("Help");
	
	EncryptMainUI encryptUI = new EncryptMainUI();
	DecryptMainUI decryptUI = new DecryptMainUI();
	MD5UI md5ui = new MD5UI();
	
	static CaesarDecrypt caesarDecrypt = new CaesarDecrypt();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MainUI() 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainUI.class.getResource("/img/crypto.png")));
		setTitle("CryptIT!");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setJMenuBar(mbr);
		
		mbr.add(ciphersMenu);
		mbr.add(settingsMenu);
		
		ciphersMenu.add(encryptMenu);
		encryptMenu.add(caesarEncryptMenu);
		encryptMenu.add(viginereEncryptMenu);
		encryptMenu.add(railfenceEncryptMenu);
		encryptMenu.add(columnerEncryptMenu);
		encryptMenu.add(fibbilEncryptMenu);
		
		ciphersMenu.add(decryptMenu);
		decryptMenu.add(caesarDecryptMenu);
		decryptMenu.add(railfenceDecryptMenu);
		decryptMenu.add(fibbilDecryptMenu);
		
		ciphersMenu.add(md5Menu);
		
		settingsMenu.add(aboutMenu);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tab, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tab, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
		
		tab.add("Encypt",encryptUI);
		tab.add("Decrypt",decryptUI);
		tab.add("Hashing",md5ui);
		
		aboutMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AboutUI aboutUI = new AboutUI();
				aboutUI.setVisible(true);
			}
		});
		
		encryptMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tab.setSelectedComponent(encryptUI);
				
			}
		});
		
		decryptMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tab.setSelectedComponent(decryptUI);
				
			}
		});
		
		md5Menu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tab.setSelectedComponent(md5ui);
				
			}
		});
		
		
		
	}
}
