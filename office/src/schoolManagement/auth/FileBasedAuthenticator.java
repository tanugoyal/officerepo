package schoolManagement.auth;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import schoolManagement.User;

public class FileBasedAuthenticator implements Authenticator
{
	Map<String, User> usernameMap = new HashMap<String, User>();
	
	public FileBasedAuthenticator(final String fileStore) throws FileNotFoundException, IOException 
	{
		try (BufferedReader br = new BufferedReader(new FileReader(fileStore))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(";");
				User user = new User(tokens[0], tokens[1], Role.valueOf(tokens[2]));
				usernameMap.put(tokens[0], user);
			}
		}
 
	}

	@Override
	public User authenticate(final String userName, final String password)
		throws AuthenticationException 
	{
		if (userName == null) {
			throw new AuthenticationException("Username is null");
		}
		if (!usernameMap.containsKey(userName)) {
			throw new AuthenticationException("Username " + userName + " does not exist");
		}
		if (!usernameMap.get(userName).matches(password)) {
			throw new AuthenticationException("Username and password do not match");
		}
		
		return usernameMap.get(userName);
	}

}
