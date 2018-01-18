import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 
public class Screen extends JPanel implements ActionListener{
 
	private Contact[] contactList; 
	private JButton searchFirstButton; 
	private JButton searchLastButton;
	private JButton searchUsername;
	private JTextField firstNameInput; 
	
	private JTextPane searchResultPane; 
	private JTextPane allContactsPane;
	
	private JButton searchSuffix;
	private JButton searchDomain;
    private int x = 100;
    private int y = 100;
    private BufferedImage strawberryImg;
	
    public void paintComponent(Graphics g)
	{
         
        super.paintComponent(g);
        g.drawImage(strawberryImg, 500, y	, null);
		g.setFont(new Font("Futura", Font.PLAIN, 30));
		g.drawString("Results", 350, 50);
		g.drawString("Contact List", 30, 50);
		g.drawString("Phone", 645, 50);
 
     
    }
     
    public Screen()
	{
         
        this.setLayout(null);
         
		contactList = new Contact[10]; 
		
		contactList[0] = new Contact("John", "Parker", "johnny12@gmail.com"); 
		contactList[1] = new Contact("Jen", "Seldserson", "jennybenny@yahoo.com"); 
		contactList[2] = new Contact("Jose", "Perez","josep@mvla.net"); 
		contactList[3] = new Contact("Jack", "Pauly","jackyp2@gmail.com");
		contactList[4] = new Contact("Shaan", "Patel","shaanspatel2@gmail.com");
		contactList[5] = new Contact("Joe", "Workingman","carterpewds@mvla.net");
		contactList[6] = new Contact("Kim", "Berly","kimwhatsup@yahoo.com");
		contactList[7] = new Contact("Amber", "Flowers","amberflows@mvla.net");
		contactList[8] = new Contact("Kate" , "Ulmerton","katedate@yahoo.com");
		contactList[9] = new Contact("Big", "Shaq","theoneandonly@gmail.com");
		//fill in contacts here 
		
		searchLastButton =  new JButton("Search Last Name");
		searchLastButton.setBounds(600,240,150,30); 
		searchLastButton.addActionListener(this);
		this.add(searchLastButton); 
		
		searchFirstButton =  new JButton("Search First Name");
		searchFirstButton.setBounds(600,280,150,30); 
		searchFirstButton.addActionListener(this);
		this.add(searchFirstButton); 
		
		searchUsername =  new JButton("Search Username");
		searchUsername.setBounds(600,320,150,30); 
		searchUsername.addActionListener(this);
		this.add(searchUsername); 
		
		searchSuffix =  new JButton("Search Suffix");
		searchSuffix.setBounds(600,150,150,30); 
		searchSuffix.addActionListener(this);
		this.add(searchSuffix); 
		
		searchDomain =  new JButton("Search Domain");
		searchDomain.setBounds(600,200,150,30); 
		searchDomain.addActionListener(this);
		this.add(searchDomain); 
		
		firstNameInput = new JTextField(); 
		firstNameInput.setBounds(626,360,100,30); 
		this.add(firstNameInput); 
		
		searchResultPane = new JTextPane(); 
		searchResultPane.setBounds(310,100,200,350);
		this.add(searchResultPane);
		allContactsPane = new JTextPane(); 
		allContactsPane.setBounds(10,100,200,350); 
		this.add(allContactsPane);
		String text = "";
		for(Contact each : contactList)
		{
			text += each + "\n";
		}
		allContactsPane.setText( text ); 
         
        this.setFocusable(true);    
        try {
            strawberryImg = ImageIO.read(new File("strawberry.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
     
    public Dimension getPreferredSize()
	{
        //Sets the size of the panel
        return new Dimension(1920,1080);

    }
  

 
    public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == searchFirstButton)
		{
			String inputText = firstNameInput.getText();
			
			String resultsText = "";
			for(int i = 0; i < contactList.length; i++)
			{
				if(contactList[i].getFirstName().equals(inputText)) 
				{
					resultsText += contactList[i] + "\n";
				}
			}
			searchResultPane.setText(resultsText);
		}
		if(e.getSource() == searchLastButton)
		{
			String inputText = firstNameInput.getText();
			
			String resultsText = "";
			for(int i = 0; i < contactList.length; i++)
			{
				if(contactList[i].getLastName().equals(inputText)) 
				{
					resultsText += contactList[i] + "\n";
				}
			}
			searchResultPane.setText(resultsText);
		}
		if(e.getSource() == searchUsername)
		{
			String inputText = firstNameInput.getText();
			
			String resultsText = "";
			for(int i = 0; i < contactList.length; i++)
			{
				if(contactList[i].getUsername().equals(inputText)) 
				{
					resultsText += contactList[i] + "\n";
				}
			}
			searchResultPane.setText(resultsText);
		}
	
		if(e.getSource() == searchSuffix)
		{
			String inputText = firstNameInput.getText();
			
			String resultsText = "";
			for(int i = 0; i < contactList.length; i++)
			{
				if(contactList[i].getSuffix().equals(inputText)) 
				{
					resultsText += contactList[i] + "\n";
				}
			}
			searchResultPane.setText(resultsText);
		}
		
		if(e.getSource() == searchDomain)
		{
			String inputText = firstNameInput.getText();
			
			String resultsText = "";
			for(int i = 0; i < contactList.length; i++)
			{
				if(contactList[i].getDomain().equals(inputText)) 
				{
					resultsText += contactList[i] + "\n";
				}
			}
			searchResultPane.setText(resultsText);
		}
		
    }
	
	
 
}
//END OF SCREEN
