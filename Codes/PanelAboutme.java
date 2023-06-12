package Portfolio5;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
// sub class
public class PanelAboutme extends JPanel {
	private ImageIcon profile = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\Guazon-AcademicProfilePhoto_1.jpg")
					.getImage().getScaledInstance(214, 176, Image.SCALE_DEFAULT));
	private ImageIcon info1 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\info.png")
					.getImage().getScaledInstance(60, 53, Image.SCALE_DEFAULT));
	private ImageIcon info2 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\information-button (1).png")
					.getImage().getScaledInstance(60, 53, Image.SCALE_DEFAULT));
	private ImageIcon gradIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets5\\mortarboard.png")
					.getImage().getScaledInstance(96, 87, Image.SCALE_DEFAULT));
	private JPanel infopanel;
	private  JPanel aboutmePanel;
	private JPanel educationalPanel;
	private JTextField namefield;
	private JTextField agefield;
	private JTextField genderfield;
	private JTextField yearfield;
	private JTextField addressfield;
	private JTextField hobbies1field;
	private JTextField hobbies2field;
	private JTextField hobbies3field;
	private JTextField skills1field;
	private JTextField skills2field;
	private JTextField emailfield;
	/**
	 * Create the panel.
	 */
	public PanelAboutme() {
		setBackground(new Color(192, 192, 192));
		setBounds(0, 102, 1280, 630);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBounds(0, 0, 1280, 732);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		// ===== profile start here ======
		JPanel profilepanel = new JPanel();
		profilepanel.setOpaque(false);
		profilepanel.setBounds(71, 27, 1176, 284);
		mainPanel.add(profilepanel);
		profilepanel.setLayout(null);
		
		//========= profile icon============
		JLabel profilelbl = new JLabel("");
		profilelbl.setIcon(profile);
		profilelbl.setBounds(10, 25, 214, 176);
		profilepanel.add(profilelbl);
		
		JLabel namelbl = new JLabel("Efraim P. Guazon ");
		namelbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
		namelbl.setBounds(245, 11, 525, 59);
		profilepanel.add(namelbl);
		
		JLabel courselbl1 = new JLabel("Course : ");
		courselbl1.setFont(new Font("Arial", Font.PLAIN, 15));
		courselbl1.setBounds(245, 79, 60, 34);
		profilepanel.add(courselbl1);
		
		JLabel courselbl2 = new JLabel("Bachelor of Science in Information Technology with specialization in Mobile and Web Applications (BSIT-MWA).");
		courselbl2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 17));
		courselbl2.setBounds(306, 79, 870, 34);
		profilepanel.add(courselbl2);
		
		//======== info icon here===========
		JLabel infolbl1 = new JLabel("");
		infolbl1.setIcon(info1);
		infolbl1.setFont(new Font("Arial", Font.PLAIN, 15));
		infolbl1.setBounds(245, 124, 60, 53);
		profilepanel.add(infolbl1);
		
		JLabel infotext1 = new JLabel("Hi, I am Efraim P. Guazon I am a working student. I am a service crew at McDonalds.");
		infotext1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		infotext1.setBounds(313, 146, 803, 34);
		profilepanel.add(infotext1);
		
		JLabel infotext2 = new JLabel("i work because i want to reduce my parents expenses and shoulder my own allowance and others needs and");
		infotext2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		infotext2.setBounds(255, 179, 803, 34);
		profilepanel.add(infotext2);
		
		JLabel infotext3 = new JLabel("I am currently enrolled at National University (NU) 1st year my course is Bachelor of Science in Information ");
		infotext3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		infotext3.setBounds(255, 208, 803, 34);
		profilepanel.add(infotext3);
		
		JLabel infotext4 = new JLabel("Technology with specialization in Mobile and Web Applications (BSIT-MWA).");
		infotext4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		infotext4.setBounds(255, 239, 803, 34);
		profilepanel.add(infotext4);
		// === profile ends here========
		
		
		// ==== Inforpanel  Start here===========
		JPanel infopanel = new JPanel();
		infopanel.setLayout(new CardLayout());
		infopanel.setOpaque(false);
		infopanel.setBounds(71, 309, 1176, 319);
		mainPanel.add(infopanel);
		
		// ==== about me panel  Start Here ====
		JPanel aboutmePanel = new JPanel();
		aboutmePanel.setLayout(null);
		aboutmePanel.setOpaque(false);// transparent
		infopanel.add(aboutmePanel, "aboutmePanel");
		
		//========== about me function 1
		JLabel aboutmelbl = new JLabel("About me");
		aboutmelbl.setForeground(new Color(0, 128, 192));
		aboutmelbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		aboutmelbl.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        CardLayout cardLayout = (CardLayout) infopanel.getLayout();
		        cardLayout.show(infopanel, "aboutmePanel");
		    }
		});
		aboutmelbl.setBounds(0, 0, 153, 31);
		aboutmePanel.add(aboutmelbl);
		
		//======= educational function 1
		JLabel lblEducational = new JLabel("Educational");
		lblEducational.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblEducational.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        CardLayout cardLayout = (CardLayout) infopanel.getLayout();
		        cardLayout.show(infopanel, "educationalPanel");
		    }
		});
		lblEducational.setBounds(163, 0, 153, 31);
		aboutmePanel.add(lblEducational);
		
		//========= about me panel =======
		JPanel aboutmebodypanel = new JPanel();
		aboutmebodypanel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		aboutmebodypanel.setBounds(0, 32, 1176, 276);
		aboutmePanel.add(aboutmebodypanel);
		aboutmebodypanel.setLayout(null);
		
		JLabel namelbl1 = new JLabel("Name       :");
		namelbl1.setFont(new Font("Arial", Font.PLAIN, 20));
		namelbl1.setBounds(10, 11, 119, 32);
		aboutmebodypanel.add(namelbl1);
		
		JLabel agelbl = new JLabel("Age          : ");
		agelbl.setFont(new Font("Arial", Font.PLAIN, 20));
		agelbl.setBounds(10, 54, 119, 32);
		aboutmebodypanel.add(agelbl);
		
		JLabel genderlbl = new JLabel("Gender     :");
		genderlbl.setFont(new Font("Arial", Font.PLAIN, 20));
		genderlbl.setBounds(10, 97, 119, 32);
		aboutmebodypanel.add(genderlbl);
		
		JLabel lblAddress = new JLabel("Address    :");
		lblAddress.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAddress.setBounds(10, 140, 109, 32);
		aboutmebodypanel.add(lblAddress);
		
		JLabel lblYear = new JLabel("Year         :");
		lblYear.setFont(new Font("Arial", Font.PLAIN, 20));
		lblYear.setBounds(10, 183, 119, 32);
		aboutmebodypanel.add(lblYear);
		
		namefield = new JTextField();
		namefield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		namefield.setText("Guazon, Efraim Piedad");
		namefield.setBounds(130, 11, 305, 32);
		aboutmebodypanel.add(namefield);
		namefield.setEditable(false);// not editable text
		namefield.setColumns(10);
		
		agefield = new JTextField();
		agefield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		agefield.setText("19 years old");
		agefield.setColumns(10);
		agefield.setBounds(130, 57, 305, 32);
		agefield.setEditable(false);// not editable text
		aboutmebodypanel.add(agefield);
		
		genderfield = new JTextField();
		genderfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		genderfield.setText("Male");
		genderfield.setColumns(10);
		genderfield.setBounds(130, 100, 305, 32);
		genderfield.setEditable(false);// not editable text
		aboutmebodypanel.add(genderfield);
		
		yearfield = new JTextField();
		yearfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		yearfield.setText("1st year BSIT-MWA");
		yearfield.setColumns(10);
		yearfield.setBounds(129, 183, 306, 32);
		yearfield.setEditable(false);// not editable text
		aboutmebodypanel.add(yearfield);
		
		addressfield = new JTextField();
		addressfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
		addressfield.setText(" Compound 3 Door 4 Up Makaturing St. Brgy Manresa  Q.C");
		addressfield.setColumns(10);
		addressfield.setBounds(129, 140, 306, 32);
		addressfield.setEditable(false);// not editable text
		aboutmebodypanel.add(addressfield);
		
		JLabel namelbl1_1 = new JLabel("Hobbies       :");
		namelbl1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		namelbl1_1.setBounds(587, 11, 119, 32);
		aboutmebodypanel.add(namelbl1_1);
		
		JLabel agelbl_1 = new JLabel("Skills          : ");
		agelbl_1.setFont(new Font("Arial", Font.PLAIN, 20));
		agelbl_1.setBounds(587, 151, 119, 32);
		aboutmebodypanel.add(agelbl_1);
		
		hobbies1field = new JTextField();
		hobbies1field.setText("Playing Basketball");
		hobbies1field.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		hobbies1field.setEditable(false);
		hobbies1field.setColumns(10);
		hobbies1field.setBounds(716, 11, 305, 32);
		aboutmebodypanel.add(hobbies1field);
		
		hobbies2field = new JTextField();
		hobbies2field.setText("playing online games");
		hobbies2field.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		hobbies2field.setEditable(false);
		hobbies2field.setColumns(10);
		hobbies2field.setBounds(716, 54, 305, 32);
		aboutmebodypanel.add(hobbies2field);
		
		hobbies3field = new JTextField();
		hobbies3field.setText(" playing billiards");
		hobbies3field.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		hobbies3field.setEditable(false);
		hobbies3field.setColumns(10);
		hobbies3field.setBounds(716, 97, 305, 32);
		aboutmebodypanel.add(hobbies3field);
		
		skills1field = new JTextField();
		skills1field.setText("Cooking                             80%");
		skills1field.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		skills1field.setEditable(false);
		skills1field.setColumns(10);
		skills1field.setBounds(716, 194, 305, 32);
		aboutmebodypanel.add(skills1field);
		
		skills2field = new JTextField();
		skills2field.setText("Java                                    50%");
		skills2field.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		skills2field.setEditable(false);
		skills2field.setColumns(10);
		skills2field.setBounds(716, 151, 305, 32);
		aboutmebodypanel.add(skills2field);
		
		JLabel emaillbl = new JLabel("Year         :");
		emaillbl.setFont(new Font("Arial", Font.PLAIN, 20));
		emaillbl.setBounds(10, 228, 119, 32);
		aboutmebodypanel.add(emaillbl);
		
		emailfield = new JTextField();
		emailfield.setText("efraimpiedad@gmail.com");
		emailfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		emailfield.setEditable(false);
		emailfield.setColumns(10);
		emailfield.setBounds(129, 228, 306, 32);
		aboutmebodypanel.add(emailfield);
		
		// ==== About me  panel  END here =========
		
		// ==== educational panel  start here =========
		JPanel educationalPanel = new JPanel();
		educationalPanel.setOpaque(false); // transparent
		educationalPanel.setLayout(null);
		infopanel.add(educationalPanel, "educationalPanel");
		
		//========== about me function 2
		JLabel aboutmelbl2 = new JLabel("About me");
		aboutmelbl2.setForeground(new Color(0, 0, 0));
		aboutmelbl2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		aboutmelbl2.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        CardLayout cardLayout = (CardLayout) infopanel.getLayout();
		        cardLayout.show(infopanel, "aboutmePanel");
		    }
		});
		aboutmelbl2.setBounds(0, 0, 153, 34);
		educationalPanel.add(aboutmelbl2);

		//======= educational function 2
		JLabel educationallbl2 = new JLabel("Educational");
		educationallbl2.setForeground(new Color(0, 128, 192));
		educationallbl2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		educationallbl2.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        CardLayout cardLayout = (CardLayout) infopanel.getLayout();
		        cardLayout.show(infopanel, "educationalPanel");
		    }
		});
		educationallbl2.setBounds(163, 0, 153, 34);
		educationalPanel.add(educationallbl2);
		
		JPanel educbodypanel = new JPanel();
		educbodypanel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		educbodypanel.setBounds(0, 38, 1176, 270);
		educationalPanel.add(educbodypanel);
		educbodypanel.setLayout(null);
		
		JLabel elementarylbl = new JLabel("Elementary");
		elementarylbl.setForeground(Color.BLACK);
		elementarylbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		elementarylbl.setBounds(10, 56, 153, 34);
		educbodypanel.add(elementarylbl);
		
		JLabel gradlbl = new JLabel("");
		gradlbl.setIcon(gradIcon);
		gradlbl.setBounds(10, 101, 96, 87);
		educbodypanel.add(gradlbl);
		
		JLabel lblSanJoseElementary = new JLabel("San Jose Elementary School (SJES)");
		lblSanJoseElementary.setForeground(Color.BLACK);
		lblSanJoseElementary.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblSanJoseElementary.setBounds(116, 100, 263, 34);
		educbodypanel.add(lblSanJoseElementary);
		
		JLabel datelbl = new JLabel("(2010-2016)");
		datelbl.setForeground(Color.BLACK);
		datelbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		datelbl.setBounds(116, 133, 96, 34);
		educbodypanel.add(datelbl);
		
		JLabel highschoolbl = new JLabel("High school");
		highschoolbl.setForeground(Color.BLACK);
		highschoolbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		highschoolbl.setBounds(419, 56, 153, 34);
		educbodypanel.add(highschoolbl);
		
		JLabel highschoolbl2 = new JLabel("San Jose High School (SJHS)");
		highschoolbl2.setForeground(Color.BLACK);
		highschoolbl2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		highschoolbl2.setBounds(525, 100, 221, 34);
		educbodypanel.add(highschoolbl2);
		
		JLabel gradlbl2 = new JLabel("");
		gradlbl2.setIcon(gradIcon);
		gradlbl2.setBounds(419, 101, 96, 87);
		educbodypanel.add(gradlbl2);
		
		JLabel highschoolbl3 = new JLabel("(2016-2020)");
		highschoolbl3.setForeground(Color.BLACK);
		highschoolbl3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		highschoolbl3.setBounds(525, 133, 96, 34);
		educbodypanel.add(highschoolbl3);
		
		JLabel seniorlbl = new JLabel("Senior High");
		seniorlbl.setForeground(Color.BLACK);
		seniorlbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		seniorlbl.setBounds(807, 56, 153, 34);
		educbodypanel.add(seniorlbl);
		
		JLabel seniorlbl2 = new JLabel("San Francisco High School (SFHS)");
		seniorlbl2.setForeground(Color.BLACK);
		seniorlbl2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		seniorlbl2.setBounds(913, 100, 263, 34);
		educbodypanel.add(seniorlbl2);
		
		JLabel gradlbl3 = new JLabel("");
		gradlbl3.setIcon(gradIcon);
		gradlbl3.setBounds(807, 101, 96, 87);
		educbodypanel.add(gradlbl3);
		
		JLabel seniorlbl3 = new JLabel("(2020-2022)");
		seniorlbl3.setForeground(Color.BLACK);
		seniorlbl3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		seniorlbl3.setBounds(913, 133, 96, 34);
		educbodypanel.add(seniorlbl3);
		// ==== educational panel  End here =========
		// ==== Inforpanel Ends Here ================

	}
}
