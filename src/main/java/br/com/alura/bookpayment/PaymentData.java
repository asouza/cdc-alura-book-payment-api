package br.com.alura.bookpayment;

import java.math.BigDecimal;

public class PaymentData {

	private BigDecimal value;
	
	public PaymentData() {
	}
	
	public BigDecimal getValue() {
		return value;
	}
	
	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
