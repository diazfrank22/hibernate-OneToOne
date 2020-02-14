package hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idDeparment", unique = true)
	private Integer idDeparment;
	@Column(name = "nameDeparment")
	private String nameDeparment;
	

	public Integer getIdDeparment() {
		return idDeparment;
	}

	public void setIdDeparment(Integer idDeparment) {
		this.idDeparment = idDeparment;
	}

	public String getNameDeparment() {
		return nameDeparment;
	}

	public void setNameDeparment(String nameDeparment) {
		this.nameDeparment = nameDeparment;
	}
}
