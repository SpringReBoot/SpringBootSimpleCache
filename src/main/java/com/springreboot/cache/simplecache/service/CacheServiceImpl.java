package com.springreboot.cache.simplecache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CacheServiceImpl implements ICacheService {

	@Autowired
	CacheManager cacheManager;

	@Cacheable(cacheNames = { "cache1" })
	@Override
	public Double doComplexCalculation(Double value) {

		// Fake slow performance for complex calculation
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return Double.MAX_VALUE;
	}

	@Scheduled(initialDelay = 10 * 60 * 1000, fixedRate = 10 * 60 * 1000)
	@CacheEvict(cacheNames = "cache1", allEntries = true)
	public void evictCache() {
		System.out.println("Clearing cache...");
	}
}
