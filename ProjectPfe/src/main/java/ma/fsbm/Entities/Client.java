package ma.fsbm.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "CLIENTS")
public class Client extends User {
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getCin() {
		return Cin;
	}
	public void setCin(String cin) {
		Cin = cin;
	}
	public Date getDateAdheration() {
		return DateAdheration;
	}
	public void setDateAdheration(Date dateAdheration) {
		DateAdheration = dateAdheration;
	}
	public List<Inscription> getIns() {
		return ins;
	}
	public void setIns(List<Inscription> ins) {
		this.ins = ins;
	}
	public List<Annonce> getAnnonces() {
		return annonces;
	}
	public void setAnnonces(List<Annonce> annonces) {
		this.annonces = annonces;
	}
	private String Email;
	private String Tel;
	private String Cin;
	@Temporal(TemporalType.DATE)
	private Date DateAdheration;
	@ManyToMany()
	private List<Inscription> ins=new ArrayList<>();
	@OneToMany(mappedBy = "client")
	private List<Annonce> annonces=new ArrayList<>();
	/*@OneToMany(mappedBy = "client")
	private List<Notification> notifications = new ArrayList<>();*/
	public Client(Long Id, String UserName, String PassWord, String Name, String FirstName, String email, String tel,
			String cin, Date dateAdheration, List<Inscription> ins, List<Annonce> annonces) {
		super(Id, UserName, PassWord, Name, FirstName);
		Email = email;
		Tel = tel;
		Cin = cin;
		DateAdheration = dateAdheration;
		this.ins = ins;
		this.annonces = annonces;
		
	}
	
	
	
	
}
