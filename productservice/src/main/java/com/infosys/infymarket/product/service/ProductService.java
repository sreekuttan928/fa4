package com.infosys.infymarket.product.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.infosys.infymarket.product.dto.ProductDTO;
import com.infosys.infymarket.product.entity.Product;
import com.infosys.infymarket.product.repository.ProductRepository;

@Service
public class ProductService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductRepository productrepo;

	// Fetches 
	public List<ProductDTO> getProductByName(@PathVariable String productname) {

		logger.info("Calldetails request for customer {}", productname);

		List<Product> product = productrepo.findByproductname(productname);
		List<ProductDTO> productDTO = new ArrayList<ProductDTO>();

		for (Product Pro : product) {
			productDTO.add(ProductDTO.valueOf(Pro));
		}
		logger.info("Calldetails for customer : {}", product);

		return productDTO;
	}
	public List<ProductDTO> getProductBycategory(@PathVariable String category) {

		logger.info("Calldetails request for customer {}", category);

		List<Product> product = productrepo.findBycategory(category);
		List<ProductDTO> productDTO = new ArrayList<ProductDTO>();

		for (Product Prod : product) {
			productDTO.add(ProductDTO.valueOf(Prod));
		}
		logger.info("Calldetails for customer : {}", product);

		return productDTO;
	}
}
