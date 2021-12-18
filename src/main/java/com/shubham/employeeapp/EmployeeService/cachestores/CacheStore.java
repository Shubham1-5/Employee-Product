package com.shubham.employeeapp.EmployeeService.cachestores;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

/**
 * This class will be used for caching the data in <Key, Value> format
 */
public class CacheStore<T> {

    /**
     * No need to inject this as it is initialized inside the constructor
     */

    private Cache<Integer, T> cache;

    /**
     * Define the constructor to build the cache
     * <p>
     * ttl for mentioning the cache expire time
     */

    public CacheStore(int ttl, TimeUnit timeUnit) {
        cache = CacheBuilder.newBuilder().expireAfterWrite(ttl, timeUnit).concurrencyLevel(Runtime.getRuntime()
                .availableProcessors()).build();
    }

    /**
     * Method to fetch a key from the cache
     */

    public T get(int key) {
        return cache.getIfPresent(key);
    }

    /**
     * Method to add the value to the cache
     */

    public void add(int key, T value) {
        if (key >= 0 && value != null) {
            cache.put(key, value);
        }
    }
}
