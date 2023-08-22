package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.Product;

public class ProductMinDTO {

	private Long id;
	private String name;

	public ProductMinDTO(Long id, String name) {
		this.id = id;
		this.name = name;

	}

	public ProductMinDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
