package ar.edu.unlp.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Twitter {
	private ArrayList<User> users = new ArrayList<User>();
	
	public User addUser(String screenName) {
		User newUser = new User(screenName);
		if (users.contains(newUser))
			return null;
		users.add(newUser);
		return newUser;
	}
	
	public Boolean removeUser(String screenName) {
		Iterator<User> i = users.iterator();
		while (i.hasNext()) {
		   User u = i.next();
		   if (u.getScreenName() == screenName) {
			   i.remove();
			   return true;
		   }
		}
		return false;
	}
	
	public Integer getUsersCount() {
		return users.size();
	}

}
