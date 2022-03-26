package ar.edu.unlp.oo2.ejercicio_1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
	private String screenName;
	private Set<Tweet> tweets = new HashSet<Tweet>(); 

	public String getScreenName() {
		return screenName;
	}
	
	public User(String screenName) {
		this.screenName = screenName;
	}
	
	public Tweet addTweet(String message) {
		Tweet newTweet = new Tweet(message, this);
		tweets.add(newTweet);
		return newTweet;
	}
	
	public Tweet addRetweet(String message, Tweet tweet) {
		Tweet newTweet = new Tweet(message, this, tweet);
		tweets.add(newTweet);
		return newTweet;
	}
	
	public Integer getTweetsCount() {
		return tweets.size();
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;

	    User user = (User) o;

	    return screenName == user.screenName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(screenName);
	}
}
