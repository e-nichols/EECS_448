import javax.swing.*;
import java.awt.event.*;

public class GUI_Main extends JFrame implements ActionListener {
	
	//global declare of result and input fields
	JTextField resultField = new JTextField( 10 );
	JTextField input1 = new JTextField( 10 );
	JTextField input2 = new JTextField( 10 );
	
	public static void main(String[] args)
	{
		
		//create instance of GUI_Main
		GUI_Main myGUI = new GUI_Main();
		
	}
	
	//Create the Frame
	public GUI_Main () {
				
		JPanel panel = new JPanel();
		setTitle( "Calculator App" );
		
		panel.setBorder( BorderFactory.createEmptyBorder( 10, 10, 10, 10 ) );
		
		//create the input titles
		JLabel title1 = new JLabel( "Value 1" );
		JLabel title2 = new JLabel( "Value 2" );
		
		//create output title and field
		JLabel resultTitle = new JLabel( "Result" );
		resultField.setEditable( false );
		
		//add them to screen
		panel.add( title1 );
		panel.add( input1 );
		panel.add( title2 );
		panel.add( input2 );
		
		//add button
		JButton addButton = new JButton( "Add" );
		panel.add( addButton );
		addButton.addActionListener( this );
		
		panel.add( resultTitle );
		panel.add( resultField );
		
		add( panel );
		setVisible( true );	
		setSize( 500, 500 );
		
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
	}
	
	//implement Action Methods
	public void actionPerformed( ActionEvent e) 
	{
		int val1, val2;
		
		String string1 = input1.getText();
		String string2 = input2.getText();
		
		//handles case of user only inputting value in one or none of the input fields
		if( string1.length() == 0 ) 
		{
			 val1 = 0;
		}
		else
		{
			val1 = Integer.parseInt(string1);
		}
		
		if( string2.length() == 0 ) 
		{
			 val2 = 0;
		}
		else
		{
			val2 = Integer.parseInt(string2);
		}
		
		//calculate!
		int result = val1+val2;
		
		//set result to String and send to resultField
		String resultString = Integer.toString(result);
		resultField.setText(resultString);
	}

}
