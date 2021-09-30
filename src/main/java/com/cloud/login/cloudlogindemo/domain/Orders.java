package com.cloud.login.cloudlogindemo.domain;

import java.util.List;

public class Orders {

	private String status;
	
	private String transactionId;
	
	private List<Order> orders;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Orders() {
	}

	public Orders(String status, String transactionId, List<Order> orders) {
		super();
		this.status = status;
		this.transactionId = transactionId;
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
