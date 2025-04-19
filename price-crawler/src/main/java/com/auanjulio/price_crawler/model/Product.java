package com.auanjulio.price_crawler.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tab_product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cdProduct;
	
	private String txName;
	
	private String txUrl;
	
	private String txSite;
	
	private BigDecimal vlTargetPrice;
	
	@OneToMany(mappedBy = "tab_product", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PriceHistory> listPriceHistory;
}
