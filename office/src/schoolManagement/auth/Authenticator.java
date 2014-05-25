package schoolManagement.auth;

import schoolManagement.model.User;

public interface Authenticator 
{
	public class AuthenticationException extends Exception 
	{
		private static final long serialVersionUID = -1239624595892055963L;
		public AuthenticationException(final String msg) 
		{
			super(msg);
		}
	}

	public User authenticate(final String userName, final String password)
			throws AuthenticationException;

}
