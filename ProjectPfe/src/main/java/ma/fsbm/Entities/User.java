package ma.fsbm.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "USERS")
public class User {
	public User(Long id, String userName, String passWord, String name, String firstName) {
		super();
		Id = id;
		UserName = userName;
		PassWord = passWord;
		Name = name;
		FirstName = firstName;
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String UserName;
	private String PassWord;
	private String Name;
	private String FirstName;


}
