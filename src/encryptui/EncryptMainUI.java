package encryptui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;

import encryptui.CaesarEncrypt;
import encryptui.ColumnerEncrypt;
import encryptui.FibBilEncrypt;
import encryptui.RailFenceEncrypt;
import encryptui.ViginereEncrypt;

@SuppressWarnings("serial")
public class EncryptMainUI extends JPanel {

	public EncryptMainUI() 
	{
		CaesarEncrypt caesarEncypt = new CaesarEncrypt();
		ViginereEncrypt viginereEncrypt = new ViginereEncrypt();
		RailFenceEncrypt railFenceEncrypt = new RailFenceEncrypt();
		ColumnerEncrypt columnerEncrypt = new ColumnerEncrypt();
		FibBilEncrypt fibBilEncrypt = new FibBilEncrypt();
		
		JTabbedPane tabEncrypt = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabEncrypt, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabEncrypt, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		
		tabEncrypt.add("Caesar Cipher",caesarEncypt);
		tabEncrypt.add("Viginere Cipher",viginereEncrypt);
		tabEncrypt.add("Rail Fence Cipher",railFenceEncrypt);
		tabEncrypt.add("Columner Cipher",columnerEncrypt);
		tabEncrypt.add("FibBil Technique",fibBilEncrypt);
	}

}
