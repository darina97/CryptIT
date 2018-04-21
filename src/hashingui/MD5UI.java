package hashingui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import maincode.HashingAlgorithm;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

@SuppressWarnings("serial")
public class MD5UI extends JPanel 
{
	private JTextField textFieldMessage;
	private JTextField textFieldHash;
	private JTextField textFieldFilePath;
	private JTextField textFieldFileHash;
	public MD5UI() 
	{
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new MatteBorder(1, 2, 1, 2, (Color) new Color(0, 0, 0)), "Find the Hash Code of Message", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 2, 1, 2, (Color) new Color(0, 0, 0)), "File Hash Code", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(51, Short.MAX_VALUE))
		);
		
		textFieldFilePath = new JTextField();
		textFieldFilePath.setEditable(false);
		textFieldFilePath.setColumns(10);
		
		JButton btnFileChooser = new JButton("Choose File");
		btnFileChooser.setToolTipText("Choose File");
		
		textFieldFileHash = new JTextField();
		textFieldFileHash.setToolTipText("MD5 for File");
		textFieldFileHash.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFileHash.setEditable(false);
		textFieldFileHash.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(textFieldFilePath, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnFileChooser, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
						.addComponent(textFieldFileHash, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldFilePath, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFileChooser))
					.addGap(18)
					.addComponent(textFieldFileHash, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblEnterTheMessage = new JLabel("Enter the message: ");
		
		textFieldMessage = new JTextField();
		textFieldMessage.setToolTipText("Enter Message");
		textFieldMessage.setColumns(10);
		
		JButton btnHashCode = new JButton("Hash Code");
		btnHashCode.setToolTipText("Find Hash Code");
		
		textFieldHash = new JTextField();
		textFieldHash.setToolTipText("MD5 Hash Code");
		textFieldHash.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHash.setEditable(false);
		textFieldHash.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldHash, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
						.addComponent(btnHashCode, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblEnterTheMessage, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textFieldMessage, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterTheMessage, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldMessage, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnHashCode)
					.addGap(18)
					.addComponent(textFieldHash, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(81, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);
		
		btnHashCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldHash.setText(HashingAlgorithm.getMd5(textFieldMessage.getText()));
			}
		});
		
		btnFileChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.showDialog(getParent(), "Choose");
				File selectedFile = fileChooser.getSelectedFile();
				textFieldFilePath.setText(selectedFile.getAbsolutePath());
				
				textFieldFileHash.setText(HashingAlgorithm.getMd5(textFieldFilePath.getText()));
			}
		});
	}
}
