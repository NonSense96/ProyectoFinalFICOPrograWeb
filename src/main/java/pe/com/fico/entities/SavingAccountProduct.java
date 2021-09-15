package pe.com.fico.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SavingAccountProduct")

public class SavingAccountProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSavingAccount;

	@Column(name = "typeSA", nullable = false)
	private String typeSavingAccount;

	@Column(name = "minOpeningSA", nullable = false)
	private float minOpeningSaving;

	@Column(name = "secureFoundSA", nullable = false)
	private boolean secureFounSA;

	@Column(name = "freeOperationSA", nullable = false)
	private int freeOperationSA;

	@Column(name = "mantCostSA", nullable = false)
	private float mantCostSA;

	@ManyToOne
	@JoinColumn(name = "idProduct", nullable = false)
	private Product product;

	// Constructor
	public SavingAccountProduct() {
		super();
	}

	public SavingAccountProduct(int idSavingAccount, String typeSavingAccount, float minOpeningSaving, boolean secureFounSA,
			int freeOperationSA, float mantCostSA, Product product) {
		super();
		this.idSavingAccount = idSavingAccount;
		this.typeSavingAccount = typeSavingAccount;
		this.minOpeningSaving = minOpeningSaving;
		this.secureFounSA = secureFounSA;
		this.freeOperationSA = freeOperationSA;
		this.mantCostSA = mantCostSA;
		this.product = product;
	}
	// Getters and Setters

	public int getIdSavingAccount() {
		return idSavingAccount;
	}

	public void setIdSavingAccount(int idSavingAccount) {
		this.idSavingAccount = idSavingAccount;
	}

	public String getTypeSavingAccount() {
		return typeSavingAccount;
	}

	public void setTypeSavingAccount(String typeSavingAccount) {
		this.typeSavingAccount = typeSavingAccount;
	}

	public float getMinOpeningSaving() {
		return minOpeningSaving;
	}

	public void setMinOpeningSaving(float minOpeningSaving) {
		this.minOpeningSaving = minOpeningSaving;
	}

	public boolean isSecureFounSA() {
		return secureFounSA;
	}

	public void setSecureFounSA(boolean secureFounSA) {
		this.secureFounSA = secureFounSA;
	}

	public int getFreeOperationSA() {
		return freeOperationSA;
	}

	public void setFreeOperationSA(int freeOperationSA) {
		this.freeOperationSA = freeOperationSA;
	}

	public float getMantCostSA() {
		return mantCostSA;
	}

	public void setMantCostSA(float mantCostSA) {
		this.mantCostSA = mantCostSA;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}