package ma.fsbm.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Inscription {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Lotissement> getLots() {
		return Lots;
	}
	public void setLots(List<Lotissement> lots) {
		Lots = lots;
	}
	public List<Client> getCls() {
		return cls;
	}
	public void setCls(List<Client> cls) {
		this.cls = cls;
	}
	public List<Virement> getVirements() {
		return virements;
	}
	public void setVirements(List<Virement> virements) {
		this.virements = virements;
	}
	public List<Appartement> getAppartements() {
		return appartements;
	}
	public void setAppartements(List<Appartement> appartements) {
		this.appartements = appartements;
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	@OneToMany(mappedBy ="inscription"  ,fetch = FetchType.EAGER)
	 private List<Lotissement> Lots=new ArrayList<>();
	@ManyToMany(mappedBy = "ins" ,fetch = FetchType.LAZY)
	 private List<Client> cls=new ArrayList<>();
	@OneToMany(mappedBy = "inscription")
	 private List<Virement> virements;
	@OneToMany(mappedBy = "inscription")
	private List<Appartement> appartements;
	
	
	 

}
