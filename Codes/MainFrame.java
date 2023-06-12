package Portfolio5;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;


// mother class
public class MainFrame extends JFrame {
	private ImageIcon xIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\button (1).png")
					.getImage().getScaledInstance(46, 36, Image.SCALE_DEFAULT));

	private JPanel contentPane;
	public static PanelHome panelHome;
	public static PanelAboutme panelAboutme;
	public static PanelContact panelContact;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
//		setIconImage(windowIcon.getImage());
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	    
     //========Create an instance PANEL CLASS =========
		panelHome = new PanelHome();
		panelAboutme = new PanelAboutme();
		panelContact = new PanelContact();
		
      //=== Add the panelHome instance to the content pane of the DashboardFrame===
	    contentPane.add(panelHome);
	    contentPane.add(panelAboutme);
	    contentPane.add(panelContact);
		
	 // Call revalidate() and repaint() to update the frame
	    contentPane.revalidate();
	    contentPane.repaint();
	    
	// == set the bounds of the panel ===
	    
	    panelHome.setBounds(0, 102, 1280, 630);
        panelAboutme.setBounds(0, 102, 1280, 630);
        panelContact.setBounds(0, 102, 1280, 630);
	    
	//==========End  Header Panel =============================
    
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(0, 128, 192));
		headerPanel.setBounds(0, 0, 1280, 102);
		contentPane.add(headerPanel);
		headerPanel.setLayout(null);
		
		//===== homepanel =====
		JPanel HomePanel = new JPanel();
		HomePanel.setBounds(355, 33, 197, 58);
		HomePanel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		HomePanel.addMouseListener(new PanelButtonMouseAdapter(HomePanel){
		    public void mouseClicked(MouseEvent e) {
		        menuClicked(HomePanel);
		        panelHome.setVisible(true);
			    panelAboutme.setVisible(false);
			    panelContact.setVisible(false);


		    }
		});
		HomePanel.setBackground(new Color(0, 128, 192));
		headerPanel.add(HomePanel);
		HomePanel.setLayout(null);
		
		JLabel Homelbl = new JLabel("HOME");
		Homelbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));

		Homelbl.setBounds(63, 0, 156, 58);
		HomePanel.add(Homelbl);
		//=====about me panel====
		JPanel aboutmepanel = new JPanel();
		aboutmepanel.setBounds(577, 33, 197, 58);
		aboutmepanel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		aboutmepanel.addMouseListener(new PanelButtonMouseAdapter(aboutmepanel){
			public void mouseClicked(MouseEvent e) {
				menuClicked(aboutmepanel);
				panelHome.setVisible(false);
			    panelAboutme.setVisible(true);
			    panelContact.setVisible(false);
			}
			});
		aboutmepanel.setBackground(new Color(0, 128, 192));
		headerPanel.add(aboutmepanel);
		aboutmepanel.setLayout(null);
		
		JLabel Aboutme = new JLabel("About me");
		Aboutme.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		Aboutme.setBounds(53, 0, 167, 58);
		aboutmepanel.add(Aboutme);
		
		//=====contactpanel=====
		JPanel contactpanel = new JPanel();
		contactpanel.setBounds(801, 33, 197, 58);
		contactpanel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		contactpanel.addMouseListener(new PanelButtonMouseAdapter(contactpanel) {
			public void mouseClicked(MouseEvent e) {
				menuClicked(contactpanel);
				panelHome.setVisible(false);
			    panelAboutme.setVisible(false);
			    panelContact.setVisible(true);
			}
			});
		contactpanel.setLayout(null);
		contactpanel.setBackground(new Color(0, 128, 192));
		headerPanel.add(contactpanel);
		
		JLabel contactlbl = new JLabel("Contact");
		contactlbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		contactlbl.setBounds(57, 0, 162, 58);
		contactpanel.add(contactlbl);
		
		JLabel exitlbl = new JLabel("");
		exitlbl.setIcon(xIcon);
		exitlbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		exitlbl.setBounds(1224, 11, 46, 36);
		headerPanel.add(exitlbl);

    //=================End  Header Panell================================
		
		JPanel mainPanelcontentpane = new JPanel();
		mainPanelcontentpane.setBackground(new Color(255, 255, 255));
		mainPanelcontentpane.setBounds(0, 102, 1280, 630);
		contentPane.add(mainPanelcontentpane);
		mainPanelcontentpane.setLayout(null);
		
		

	}
	
	// create new method for JPanel class
	public void menuClicked(JPanel selectedPanel){
		panelHome.setVisible(false);
	    panelAboutme.setVisible(false);
	    panelContact.setVisible(false);
	    selectedPanel.setVisible(true);
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
