package com.infosys.infymarket.product.dto;

import com.infosys.infymarket.product.entity.Product;

public class ProductDTO {

	Integer prodid;
	String productname;
	Integer price;
	Integer stock;
	String description;
	String image;
	Integer sellerid;
	String category;
	String subcategory;
	Integer productrating;
	
	public Integer getProdid() {
		return prodid;
	}

	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getSellerid() {
		return sellerid;
	}

	public void setSellerid(Integer sellerid) {
		this.sellerid = sellerid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public Integer getProductrating() {
		return productrating;
	}

	public void setProductrating(Integer productrating) {
		this.productrating = productrating;
	}

	public ProductDTO() {
		super();
	}
		
		public ProductDTO(Integer prodid, String productname, Integer price, Integer stock, String description,
				String image, Integer sellerid, String category, String subcategory, Integer productrating) {
			this();
			this.prodid = prodid;
			this.productname = productname;
			this.price = price;
			this.stock = stock;
			this.description = description;
			this.image = image;
			this.sellerid = sellerid;
			this.category = category;
			this.subcategory = subcategory;
			this.productrating = productrating;
		}
		
	
	

	// Converts Entity into DTO
	public static ProductDTO valueOf(Product product) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProdid(product.getProdid());
		productDTO.setProductname(product.getProductname());
		productDTO.setPrice(product.getPrice());
		productDTO.setStock(product.getStock());
		productDTO.setDescription(product.getDescription());
		productDTO.setImage(product.getImage());
		productDTO.setSellerid(product.getSellerid());
		productDTO.setCategory(product.getCategory());
		productDTO.setSubcategory(product.getSubcategory());
		productDTO.setProductrating(product.getProductrating());
		return productDTO;
	}


	@Override
	public String toString() {
		return "ProductDTO [prodid=" + prodid + ", productname=" + productname + ", price=" + price + ", stock=" + stock
				+ ", description=" + description + ", image=" + image + ", sellerid=" + sellerid + ", category="
				+ category + ", subcategory=" + subcategory + ", productrating=" + productrating + "]";
	}
}
