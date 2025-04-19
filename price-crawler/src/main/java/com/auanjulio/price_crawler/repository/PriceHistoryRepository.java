package com.auanjulio.price_crawler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auanjulio.price_crawler.model.PriceHistory;

public interface PriceHistoryRepository extends JpaRepository<PriceHistory, Integer>{

	List<PriceHistory> findByCdProductOrderByTimestampDesc(Integer cdProduct);
}
