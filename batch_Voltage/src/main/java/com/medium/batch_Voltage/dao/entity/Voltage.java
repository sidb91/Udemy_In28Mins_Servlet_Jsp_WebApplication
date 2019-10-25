package com.medium.batch_Voltage.dao.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Voltage {
	
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Column(name = "volt", precision = 10, scale = 4, nullable = false)
	private BigDecimal volt;
	
	@NotNull
	@Column(name = "time", nullable = false)
	private double time;
	
	public Voltage() {
	}

	public Voltage(final BigDecimal volt, final double time) {
		this.volt = volt;
		this.time = time;
	}

	public BigDecimal getVolt() {
		return volt;
	}

	public void setVolt(BigDecimal volt) {
		this.volt = volt;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
}
