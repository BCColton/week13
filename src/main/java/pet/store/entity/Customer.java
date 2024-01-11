package pet.store.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.EqualsAndHashCode;
import lombok.ToString;

public class Customer {
	
	@Id
	@GeneratedValue
	private Integer customerId;
	private String customerFirstName;
	private String customerLastName;
	
	
	@ManyToMany(mappedBy = "customers", cascade = CascadeType.PERSIST)
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private Set<PetStore> petStores;

}
