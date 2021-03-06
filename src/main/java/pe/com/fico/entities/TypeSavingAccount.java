package pe.com.fico.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TypeSavingAccount")
public class TypeSavingAccount {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTypeSavingAccount;
	
	@Column(name="nameTypeSavingAccount", length=40, nullable=false)
	private String nameTypeSavingAccount;

	public TypeSavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeSavingAccount(int idTypeSavingAccount, String nameTypeSavingAccount) {
		super();
		this.idTypeSavingAccount = idTypeSavingAccount;
		this.nameTypeSavingAccount = nameTypeSavingAccount;
	}

	public int getIdTypeSavingAccount() {
		return idTypeSavingAccount;
	}

	public void setIdTypeSavingAccount(int idTypeSavingAccount) {
		this.idTypeSavingAccount = idTypeSavingAccount;
	}

	public String getNameTypeSavingAccount() {
		return nameTypeSavingAccount;
	}

	public void setNameTypeSavingAccount(String nameTypeSavingAccount) {
		this.nameTypeSavingAccount = nameTypeSavingAccount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTypeSavingAccount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeSavingAccount other = (TypeSavingAccount) obj;
		return idTypeSavingAccount == other.idTypeSavingAccount;
	}
	
	

}
