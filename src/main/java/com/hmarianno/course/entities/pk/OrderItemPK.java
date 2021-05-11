package com.hmarianno.course.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.hmarianno.course.entities.Order;
import com.hmarianno.course.entities.Product;

@Embeddable // essa annotation da JPA indica que uma classe será embutida em
			// outra classe. nesse caso essa é uma classe auxiliar (de chave 
			// primaria composta) que vai ser utilizada pela classe OrderItem

public class OrderItemPK implements Serializable {
	
	// não precisa construtor pra essa classe porque na classe onde ela será
	// embutida (OrderItem) isso já está definido.
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id") // nome da chave estrangeira
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id") // nome da chave estrangeira
	private Product product;
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
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
		OrderItemPK other = (OrderItemPK) obj;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}

}
