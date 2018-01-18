public class Contact 
{
	private String firstName; 
	private String lastName; 
	private String Username;
	private String suffix; 
	private String email;
	private String domain; 
	public Contact(String firstName, String lastName, String email)
	{
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.email = email; 
	}
	public String getFirstName()
	{
		return firstName; 
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getUsername()
	{
		int UsernamePostion = email.indexOf("@"); 
		Username = email.substring(0,UsernamePostion);
		return Username;
	}
	public String getSuffix()
	{
		int DomainLocation = email.lastIndexOf(".");
		suffix = email.substring(DomainLocation + 1); 
		return suffix;
	}
	
	public String getDomain()
	{
		int DomainLocation2 = email.lastIndexOf("@");
		int checkPos2 = email.lastIndexOf(".");
		domain = email.substring(DomainLocation2 + 1,checkPos2 ); 
		return domain;
	}
	
	public String getEmail()
	{
		return email;
	}
	public String toString()
	{
		return firstName + "  " + lastName  + " " + email;
	}
}
// END OF CONTACTS
