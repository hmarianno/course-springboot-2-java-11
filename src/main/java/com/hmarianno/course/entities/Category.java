package com.hmarianno.course.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/* mapeamentos do JPA */
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/* mapeamentos do JPA */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ig;
	private String name;
	
	// o mappedBy = "categories" abaixo é uma referência à seguinte linha lá 
	// na classe relacionada Product: 
	//				private Set<Category> categories = new HashSet<>();
	//@Transient
	@JsonIgnore
	@ManyToMany(mappedBy = "categories")
	private Set<Product> products = new HashSet<>();
		
	public Category() {}
	
	public Category(Long ig, String name) {
		super();
		this.ig = ig;
		this.name = name;
	}

	public Long getIg() {
		return ig;
	}

	public void setIg(Long ig) {
		this.ig = ig;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ig == null) ? 0 : ig.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (ig == null) {
			if (other.ig != null)
				return false;
		} else if (!ig.equals(other.ig))
			return false;
		return true;
	}

}
