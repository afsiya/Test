package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="visitor")
public class VisitorEntity {
	@Id
	@Column
	private Integer id;
	@Column
	private String date;
	@Column
	private Integer vistor;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getVisitor() {
		return vistor;
	}
	public void setVisitor(Integer visitor) {
		this.vistor = visitor;
	}

}
