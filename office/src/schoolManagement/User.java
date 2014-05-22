package schoolManagement;

import schoolManagement.auth.Role;

public class User 
{
	private Role role;
	private String username;
	private String password;
	
	public User(final String username, final String password, final Role role) 
	{
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public String getUsername()
	{
		return username;
	}
	
	public Role getRole()
	{
		return role;
	}
	
	public boolean matches(final String passphrase)
	{
		return password.equals(passphrase);
	}
}
