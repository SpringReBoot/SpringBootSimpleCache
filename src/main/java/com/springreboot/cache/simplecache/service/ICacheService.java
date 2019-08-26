package com.springreboot.cache.simplecache.service;

public interface ICacheService {

	public Double doComplexCalculation(Double value);
	
	public void evictCache();
}
