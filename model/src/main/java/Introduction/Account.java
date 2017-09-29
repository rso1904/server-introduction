package Introduction;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Account {
@Id private String id;
	
	private String username;
	@JsonIgnore private String password;
	private String name;
	private String email;
	
	public String getUsername() {
		return this.username;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public Account(String username, String password, String name, String email) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
}
