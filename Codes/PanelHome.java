package Portfolio5;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

// sub class
public class PanelHome extends JPanel {
	
	// ========= all image here and size
	private ImageIcon nulogo = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\nulogo.png")
					.getImage().getScaledInstance(337, 294, Image.SCALE_DEFAULT));

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBackground(new Color(192, 192, 192));
		setBounds(0, 102, 1280, 630);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBounds(0, 0, 1280, 732);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel introducenamelbl = new JLabel("Hi, I am");
		introducenamelbl.setForeground(new Color(0, 0, 0));
		introducenamelbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 87));
		introducenamelbl.setBounds(93, 256, 328, 141);
		mainPanel.add(introducenamelbl);
		
		JLabel lblIAmBsitmwa = new JLabel(" I am BSIT-MWA Student at");
		lblIAmBsitmwa.setForeground(new Color(0, 0, 0));
		lblIAmBsitmwa.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		lblIAmBsitmwa.setBounds(103, 330, 532, 141);
		mainPanel.add(lblIAmBsitmwa);
		
		JLabel lblNationalUniversityOf = new JLabel("National University of Manila.");
		lblNationalUniversityOf.setForeground(new Color(0, 0, 0));
		lblNationalUniversityOf.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		lblNationalUniversityOf.setBounds(630, 330, 700, 141);
		mainPanel.add(lblNationalUniversityOf);
		
		JLabel introducenamelbl_1 = new JLabel("Efraim P. Guazon.");
		introducenamelbl_1.setForeground(new Color(0, 0, 0));
		introducenamelbl_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 87));
		introducenamelbl_1.setBounds(419, 256, 768, 141);
		mainPanel.add(introducenamelbl_1);
		
		//========= Nulogo here==================
		JLabel nulogolbl = new JLabel("");
		nulogolbl.setIcon(nulogo);
		nulogolbl.setBounds(472, 11, 337, 294);
		mainPanel.add(nulogolbl);

	}
}
