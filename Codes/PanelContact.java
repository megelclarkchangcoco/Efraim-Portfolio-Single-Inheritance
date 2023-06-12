package Portfolio5;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

// subs class
public class PanelContact extends JPanel {
	private ImageIcon fb = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\facebook (2).png")
					.getImage().getScaledInstance(94, 76, Image.SCALE_DEFAULT));
	private ImageIcon gmail = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\gmail (2).png")
					.getImage().getScaledInstance(94, 76, Image.SCALE_DEFAULT));
	private ImageIcon twitter = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\twitter (1).png")
					.getImage().getScaledInstance(94, 76, Image.SCALE_DEFAULT));
	private ImageIcon instagram = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\instagram (2).png")
					.getImage().getScaledInstance(94, 76, Image.SCALE_DEFAULT));
	private ImageIcon nuis = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\nulogo.png")
					.getImage().getScaledInstance(94, 76, Image.SCALE_DEFAULT));
	private ImageIcon contact = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\phone.png")
					.getImage().getScaledInstance(94, 76, Image.SCALE_DEFAULT));

	/**
	 * Create the panel.
	 */
	public PanelContact() {
		setBackground(new Color(192, 192, 192));
		setBounds(0, 102, 1280, 733);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBounds(0, 0, 1280, 732);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel fbpanel = new JPanel();
		fbpanel.addMouseListener(new PanelButtonMouseAdapter(fbpanel));
		fbpanel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		fbpanel.setBackground(new Color(0, 128, 192));
		fbpanel.setBounds(185, 11, 364, 148);
		mainPanel.add(fbpanel);
		fbpanel.setLayout(null);
		
		JLabel iconlbl = new JLabel("");
		iconlbl.setIcon(fb);
		iconlbl.setBounds(10, 31, 94, 79);
		fbpanel.add(iconlbl);
		
		JLabel fblbl = new JLabel("Efraim Guazon");
		fblbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		fblbl.setBounds(131, 46, 223, 51);
		fbpanel.add(fblbl);
		
		JPanel instagpanel = new JPanel();
		instagpanel.addMouseListener(new PanelButtonMouseAdapter(instagpanel));
		instagpanel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		instagpanel.setBackground(new Color(0, 128, 192));
		instagpanel.setBounds(185, 206, 364, 148);
		mainPanel.add(instagpanel);
		instagpanel.setLayout(null);
		
		JLabel instaglbl = new JLabel("@epreymgwason");
		instaglbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		instaglbl.setBounds(131, 47, 223, 51);
		instagpanel.add(instaglbl);
		
		JLabel iconlbl2 = new JLabel("");
		iconlbl2.setIcon(instagram);
		iconlbl2.setBounds(10, 32, 94, 79);
		instagpanel.add(iconlbl2);
		
		JPanel twitterpanel = new JPanel();
		twitterpanel.addMouseListener(new PanelButtonMouseAdapter(twitterpanel));
		twitterpanel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		twitterpanel.setBackground(new Color(0, 128, 192));
		twitterpanel.setBounds(712, 206, 364, 148);
		mainPanel.add(twitterpanel);
		twitterpanel.setLayout(null);
		
		JLabel twitterlbl = new JLabel("@gwasonepreym");
		twitterlbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		twitterlbl.setBounds(131, 46, 223, 51);
		twitterpanel.add(twitterlbl);
		
		JLabel iconlbl3 = new JLabel("");
		iconlbl3.setIcon(twitter);
		iconlbl3.setBounds(10, 31, 94, 79);
		twitterpanel.add(iconlbl3);
		
		JPanel gmailpanel = new JPanel();
		gmailpanel.addMouseListener(new PanelButtonMouseAdapter(gmailpanel));
		gmailpanel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		gmailpanel.setBackground(new Color(0, 128, 192));
		gmailpanel.setBounds(712, 11, 364, 148);
		mainPanel.add(gmailpanel);
		gmailpanel.setLayout(null);
		
		JLabel gmaillbl = new JLabel("fraimpiedad@gmail.com");
		gmaillbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		gmaillbl.setBounds(131, 52, 223, 51);
		gmailpanel.add(gmaillbl);
		
		JLabel iconlbl4 = new JLabel("");
		iconlbl4.setIcon(gmail);
		iconlbl4.setBounds(10, 37, 94, 79);
		gmailpanel.add(iconlbl4);
		
		JPanel nuispanel = new JPanel();
		nuispanel.addMouseListener(new PanelButtonMouseAdapter(nuispanel));
		nuispanel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		nuispanel.setBackground(new Color(0, 128, 192));
		nuispanel.setBounds(185, 415, 364, 148);
		mainPanel.add(nuispanel);
		nuispanel.setLayout(null);
		
		JLabel nuislbl = new JLabel("guazonep@students.national-u.edu.ph");
		nuislbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		nuislbl.setBounds(131, 53, 223, 51);
		nuispanel.add(nuislbl);
		
		JLabel iconlbl5 = new JLabel("");
		iconlbl5.setIcon(nuis);
		iconlbl5.setBounds(10, 38, 94, 79);
		nuispanel.add(iconlbl5);
		
		JPanel contanct = new JPanel();
		contanct.addMouseListener(new PanelButtonMouseAdapter(contanct));
		contanct.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		contanct.setBackground(new Color(0, 128, 192));
		contanct.setBounds(712, 415, 364, 148);
		mainPanel.add(contanct);
		contanct.setLayout(null);
		
		JLabel contanctlbl = new JLabel("09636280236");
		contanctlbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		contanctlbl.setBounds(131, 52, 223, 51);
		contanct.add(contanctlbl);
		
		JLabel iconlbl6 = new JLabel("");
		iconlbl6.setIcon(contact);
		iconlbl6.setBounds(10, 37, 94, 79);
		contanct.add(iconlbl6);

	}
	
	 // ================== JPANEL NAMING ACTION LISTENER ===================== 
		private class PanelButtonMouseAdapter extends MouseAdapter{
			
			JPanel panel;
			public PanelButtonMouseAdapter(JPanel panel) {
				this.panel = panel;
			}
			public void mouseEntered(MouseEvent e){
				
				panel.setBackground(new Color(255,  255, 128));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new Color(0, 128, 192));
			}
			
			@Override
			public void mousePressed(MouseEvent e){
				panel.setBackground(new Color(255,  255, 255));
			} 
			
			@Override
			public void mouseReleased(MouseEvent e){
				panel.setBackground(new Color(0, 128, 192));
			}
		}	
}
