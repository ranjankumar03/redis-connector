/**
 * 
 */
package com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ranjan
 * immutable dto
 */
public final class Subscriber implements Serializable{

	private static final long serialVersionUID = 1L;
	private final long subscriberId;
	private final String subsciberName;
	private final List<Card> mappedCardList;
	
	public Subscriber(long subscriberId, String subsciberName, List<Card> mappedCardList) {
		super();
		this.subscriberId = subscriberId;
		this.subsciberName = subsciberName;
		this.mappedCardList = new ArrayList<>(mappedCardList);
	}
	public long getSubscriberId() {
		return subscriberId;
	}
	
	public String getSubsciberName() {
		return subsciberName;
	}
	
	public List<Card> getMappedCardList() {
		return Collections.unmodifiableList(mappedCardList);
	}
	
	@Override
	public String toString() {
		return "Subscriber [subscriberId=" + subscriberId + ", subsciberName=" + subsciberName + ", mappedCardList="
				+ mappedCardList + "]";
	}
}
