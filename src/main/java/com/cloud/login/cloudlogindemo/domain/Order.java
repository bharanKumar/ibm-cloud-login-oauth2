package com.cloud.login.cloudlogindemo.domain;

public class Order {
	public Order() {
	}

	public Order(Long id, Long customerId, String description, String estimatedDeliveryDate, String transactionId,
			String status) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.description = description;
		this.estimatedDeliveryDate = estimatedDeliveryDate;
		this.transactionId = transactionId;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private Long id;

	private Long customerId;
	
	private String description;
	
	private String estimatedDeliveryDate;
	
	private String transactionId;
	
	private String status;
}
