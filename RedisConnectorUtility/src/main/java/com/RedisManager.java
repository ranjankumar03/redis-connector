/**
 * 
 */
package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author ranjan
 *
 */
@Component
public class RedisManager {

	@Autowired
	private RedisTemplate<String, Subscriber> redisTemplate;

	public RedisTemplate<String, Subscriber> getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(RedisTemplate<String, Subscriber> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
}
