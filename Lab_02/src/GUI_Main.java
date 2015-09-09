import javax.swing.*;
import java.awt.event.*;

public class GUI_Main extends JFrame {
	
	public static void main(String[] args)
	{
		//create instance of GUI_Main
		GUI_Main myGUI = new GUI_Main();
		
	}
	
	//Create the Frame
	public GUI_Main () {
				
		JPanel panel = new JPanel();
		
		panel.setBorder( BorderFactory.createEmptyBorder( 10, 10, 10, 10 ) );
		
		//create the input text fields
		JLabel title1 = new JLabel( "Value 1" );
		JTextField input1 = new JTextField( 200 );
		
		JLabel title2 = new JLabel( "Value 2" );
		JTextField input2 = new JTextField( 200 );
		
		//create output title and field
		JLabel resultTitle = new JLabel( "Result" );
		JTextField result = new JTextField( 200 );
		
		//add them to screen
		panel.add( title1 );
		panel.add( input1 );
		panel.add( title2 );
		panel.add( input2 );
		
		//add button
		JButton addButton = new JButton( "Add" );
		panel.add( addButton );
		
		panel.add( resultTitle );
		panel.add( result );
		

		
		add( panel );
		
		setTitle( "Calculator App" );
		setSize( 400, 400 );
		setVisible( true );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
	}

}
