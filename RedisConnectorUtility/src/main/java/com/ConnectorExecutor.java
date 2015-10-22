package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ConnectorExecutor {

	public static RedisManager redisManager;
	public static ApplicationContext appContext;

	static {
		appContext = new FileSystemXmlApplicationContext("E:/scala/RedisConnectorUtility/spring-context.xml");
	}

	public static void main(String[] args) {

		List<Card> mappedCardList = new ArrayList<>(
				Arrays.asList(new Card(1111222233334444L, "Credit"), new Card(4444333322221111L, "Debit")));

		Subscriber subscriber = new Subscriber(001, "John Mac", mappedCardList);

		RedisManager bean = (RedisManager) appContext.getBean("redisManager");
		if (bean == null) {

			throw new IllegalArgumentException("Error in Context Argu,emt..");
		} else {
			// Persisting in cache
			bean.getRedisTemplate().opsForHash().put("SubscriberA", subscriber.hashCode(), subscriber);

			// Retrieving Subscriber from redis cache
			Subscriber fetchedSubscriber = (Subscriber) bean.getRedisTemplate().opsForHash().get("SubscriberA",
					subscriber.hashCode());
			
			//redisTemplate.opsForSet().remove("SubscriberA", subscriber.hashCode());

			System.out.println("Subscriber details fetched from Redis Cache:::::" + fetchedSubscriber);
		}

	}

}
