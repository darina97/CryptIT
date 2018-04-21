package decryptui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;

import decryptui.CaesarDecrypt;
import decryptui.FibBilDecrypt;
import decryptui.RailFenceDecrypt;

@SuppressWarnings("serial")
public class DecryptMainUI extends JPanel 
{
	public JTabbedPane tabDecrypt = new JTabbedPane(JTabbedPane.TOP);
	public DecryptMainUI() 
	{
		CaesarDecrypt caesarDecypt = new CaesarDecrypt();
		FibBilDecrypt fibBilDecrypt = new FibBilDecrypt();
		RailFenceDecrypt railFenceDecrypt = new RailFenceDecrypt();
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabDecrypt, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabDecrypt, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		
		tabDecrypt.add("Caesar Cipher",caesarDecypt);
		tabDecrypt.add("Rail Fence Cipher",railFenceDecrypt);
		tabDecrypt.add("FibBil Technique",fibBilDecrypt);
	}
}
