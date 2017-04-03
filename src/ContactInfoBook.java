/**
 * To implement and create a contact information book in which stores the data inputed 
 * From a user, into a contact listed text file.
 * This Contact Information Book is for a more business oriented piece of application
 * To store in the details of a contact/client to therefore get hold of for future use/projects/queries
 * George Sulaiman i7437472	
 * Programming Assignment 
 * 28/04/2016
 */

public class ContactInfoBook {


	private String ContactFirstName;
	private String ContactSurname;
	private int ContactPhone;
	private String ContactEmail;

	/**
	 * This is a constructor which implements the four contact information fields into
	 * The Contact Information Book
	 * @param ContactFirstName This is to clarify the contacts First Name
	 * @param ContactSurname This is to clarify the contacts Surname
	 * @param ContactPhone This is to apply the contacts telephone/phone number.
	 * @param ContactEmail This is to get the email of the contacts.
	 */


	public ContactInfoBook (String ContactFirstName, String ContactSurname, int ContactPhone,String ContactEmail)

	{
		this.ContactFirstName = ContactFirstName;
		this.ContactSurname = ContactSurname;
		this.ContactPhone = ContactPhone;
		this.ContactEmail = ContactEmail;

	}



	public String getContactFirstName() //Get the contacts First Name of the contact 
	{
		/**
		 * This returns the First Name in the Contact Information Book
		 * @return this ContactInfoBooks First Name
		 */

		return ContactFirstName;
	}



	public String getContactSurname() //Get the contacts Surname of the contact
	{

		/**
		 * This returns the Surname in the Contact Information Book
		 * @return this ContactInfoBooks Surname
		 */
		
		return ContactSurname;
	}



	public int getContactPhone() //Get the contacts Phone of the contact
	{
		/**
		 * This returns the Phone in the Contact Information Book
		 * @return this ContactInfoBooks Phone
		 */

		return ContactPhone;
	}



	public String getContactEmail() //Get the contacts Email of the contact
	{

		/**
		 * This returns the Email in the Contact Information Book
		 * @return this ContactInfoBooks Email
		 */
		
		return ContactEmail;
	}




}  //This is the end of the class
