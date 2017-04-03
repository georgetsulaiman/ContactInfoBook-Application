/**
 * To implement and create a contact information book in which stores the data inputed 
 * From a user, into a contact listed text file.
 * This Contact Information Book is for a more business oriented piece of application
 * To store in the details of a contact/client to therefore get hold of for future use/projects/queries
 * George Sulaiman i7437472	
 * Programming Assignment 
 * 28/04/2016
 */


import javax.swing.*;
import java.awt.event.*; 
import java.awt.*;
import java.io.*;

public class ContactInfoBookGui implements ActionListener {

	private JLabel lblFirstName, lblSurname,  lblPhone, lblEmail;
	private JTextField txtFirstName, txtSurname, txtPhone, txtEmail;
	private JButton btnClear;
	private JButton btnSave;
	private JButton btnExit;
	private JPanel panel;

	/**
	 * This is to clarify each method with their own individual sub topics in order to establish a meaning and appearance to the graphical user interface
	 * @param lblFirstName This is a fixed implement which appears to the user guiding the user to type the first name into the text fields
	 * @param lblSurname This is a fixed implement which appears to the user guiding the user to type surname into the text fields
	 * @param lblPhone This is a fixed implement which appears to the user guiding the user to type the telephone/phone number into the text fields
	 * @param lblEmail This is a fixed implement which appears to the user guiding the user to type in the email of the specific contact/client into the text fields
	 * @param txtFirstName This is where the user types in their first name
	 * @param txtSurname This is where the user types in their surname
	 * @param txtPhone This is where the user types in their telephone/phone number
	 * @param txtEmail This is where the user types in their email
	 * @param btnClear This is a 'Clear' button which is used to delete the data from each text field
	 * @param btnSave This is a 'Save' button which saves the data from the text fields into a text file
	 * @param btnExit This is the 'Exit' button which closes the Contact Information Book application/interface
	 * @param panel The is the background area in which allows multiple functions to be applied onto, in order to build the whole graphical user interface (GUI)
	 */



	public static void main(String[] args) {
		new ContactInfoBookGui();
	}



	public ContactInfoBookGui(){

		JFrame frame = new JFrame("Contact Info Book");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation(350, 200);
		frame.setSize(600,290);
		frame.setVisible(true);


		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);


		ImageIcon image = new ImageIcon("contactinfo.png");
		JLabel label = new JLabel();
		label = new JLabel(image);
		label.setBounds(5, 115, 128, 128);
		panel.add(label);


		lblFirstName = new JLabel("First Name :");
		lblFirstName.setBounds(45, 50, 150, 20);
		Font f1 = new Font("Arial", Font.BOLD, 15);
		lblFirstName.setFont(f1);
		lblFirstName.setForeground(Color.WHITE);
		panel.add(lblFirstName);
		txtFirstName = new JTextField();
		txtFirstName.setBounds(130, 50, 150, 20);
		panel.add(txtFirstName);


		lblSurname = new JLabel ("Surname :");
		lblSurname.setBounds(295,50,150,20);
		Font f2 = new Font ("Arial",Font.BOLD,15);
		lblSurname.setFont(f2);
		lblSurname.setForeground(Color.WHITE);
		panel.add(lblSurname);
		txtSurname = new JTextField();
		txtSurname.setBounds(375,50,150,20);
		panel.add(txtSurname);


		lblPhone = new JLabel("Phone :");
		lblPhone.setBounds(45,100,100,20);
		Font f3 = new Font ("Arial", Font.BOLD,15);
		lblPhone.setFont(f3);
		lblPhone.setForeground(Color.WHITE);
		panel.add(lblPhone);
		txtPhone = new JTextField();
		txtPhone.setBounds(130,100,150,20);
		panel.add(txtPhone);


		lblEmail = new JLabel("Email :");
		lblEmail.setBounds(295,100,100,20);
		Font f4 = new Font ("Arial", Font.BOLD,15);
		lblEmail.setFont(f4);
		lblEmail.setForeground(Color.WHITE);
		panel.add(lblEmail);
		txtEmail = new JTextField();
		txtEmail.setBounds(375,100,180,20);
		panel.add(txtEmail);



		//buttons
		btnClear = new JButton ("Clear");
		btnClear.setBounds(140,200,100,25);
		panel.add(btnClear);
		btnClear.addActionListener(new ClearHandler());

		btnSave = new JButton ("Save");
		btnSave.setBounds(290,200,100,25);
		panel.add(btnSave);
		btnSave.addActionListener(new SaveHandler());

		btnExit = new JButton ("Exit");
		btnExit.setBounds(440,200,100,25);
		panel.add(btnExit);
		btnExit.addActionListener(new ExitHandler());


		frame.add(panel); 
		frame.setVisible(true);
	}

	//button actions

	public void actionPerformed(ActionEvent e){ } Action Listener; {
	}

	class ClearHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {

			txtFirstName.setText("");
			txtSurname.setText("");
			txtPhone.setText("");
			txtEmail.setText("");

		}
	}


	class SaveHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {


			// create new Text File using BufferedWrite
			BufferedWriter outfile;


			try {


				//File file = new File("contacts"); - Saves the data from the text fields into a text file.
				File file = new File("contacts");
				FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
				outfile = new BufferedWriter(fw);
				outfile.write("First Name : " + txtFirstName.getText());
				outfile.write("\t Surname : " + txtSurname.getText());
				outfile.write("\t Phone : " + txtPhone.getText());
				outfile.write("\t Email : " + txtEmail.getText());


				outfile.newLine();
				outfile.close();

			} catch (IOException e) {
				e.printStackTrace();
			}


			int n = JOptionPane.showConfirmDialog(panel, 
					"Are you sure you want to Save?",
					"Exit?", 
					JOptionPane.YES_NO_OPTION);
			if(n == JOptionPane.YES_OPTION)

			{
				JOptionPane.showMessageDialog(panel, "The contact has been saved");
				if(n == JOptionPane.YES_OPTION);
				//When saving the data from the text fields into the text file,
				//There is a duplication error
				//The process was when pressing 'save button' and then clicking on 'no'
				//To not save, it would still save the first time
				//And then save the second time, when wanting to save again by pressing 'yes'.
				//In this situation, it would have been better to only be sent to the text file once.

				//For validation, I would have ensured that the 'txtFirstName' and 'txtSurname'
				//JTextFields would have a 'string' variable in which only allows a user to input
				//letters (String) and nothing else, with a maximum character limit of 25 letters.
				//For the JTextField of of the 'txtPhone', I would have recommended to have implemented
				//An int variable to allow only numbers(digits) and  set character limit to 
				//Be a maximum of 11 digits.

			}

		}
	}
}

class ExitHandler implements ActionListener{
	public void actionPerformed(ActionEvent event) {

		JFrame option = new JFrame();
		int n = JOptionPane.showConfirmDialog(option, "Are you sure you want to exit?", "Exit?", 
				JOptionPane.YES_NO_OPTION); {
					if(n == JOptionPane.YES_OPTION){
						System.exit(0);

					}

				}
	}
}

