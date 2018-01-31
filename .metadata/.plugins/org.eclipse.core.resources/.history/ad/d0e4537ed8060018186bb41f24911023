package com.example.Route.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.Route.Category.Courier;
import com.example.Route.Category.Equipment;
import com.example.Route.Category.SegmentType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="routes")
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","routeID"})
//@JsonIdentityInfo(
//generator = ObjectIdGenerators.PropertyGenerator.class,
//property = "id")
public class Route implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	@JsonIgnore
	private Long routeID;

	@Column(name="name")
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name="segmentType")
	private SegmentType segmentType;
	
	@Enumerated(EnumType.STRING)
	@Column(name="courier")
	private Courier courier;
	
	@Enumerated(EnumType.STRING)
	@Column(name="equipment")
	private Equipment equipment;
	
	@JsonManagedReference
	@OneToMany(mappedBy="route")
	private List<Node> nodes;
	
	public Long getId(){
		return this.routeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SegmentType getSegmentType() {
		return segmentType;
	}
	public void setSegmentType(SegmentType segmentType) {
		this.segmentType = segmentType;
	}
	public Courier getCourier() {
		return courier;
	}
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	public List<Node> getNodes() {
		return nodes;
	}
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	
	
}
