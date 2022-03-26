package ar.edu.unlp.oo2.ejercicio_1;

public class Tweet {

	private String message;
	private Tweet parent;
	private User owner;

	public Tweet(String message, User owner) {
		if (message.length() < 1 || message.length() > 140)
			throw new IllegalArgumentException("Message must be between 1 and 140 characters");
		
		this.message = message;
		this.owner = owner;
	}
	
	public Tweet(String message, User owner, Tweet parent) {
		this(message, owner);
		this.parent = parent;
	}

	public String getMessage() {
		return message;
	}

	public User getOwner() {
		return owner;
	}

	public Tweet getParent() {
		return parent;
	}
}
