package com.example.Route.models;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Value;

import com.example.Route.Category.NodeType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="nodes")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","nodeID"})
//@JsonIdentityInfo(
//generator = ObjectIdGenerators.PropertyGenerator.class,
//property = "id")
public class Node implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	@JsonIgnore
	private Long nodeID;
	
	@Column(name="name")
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name="nodetype")
	private NodeType type;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="route_id")
	private Route route;
	
	@Column(name="latitude")
	private Double latitude;
	
	@Column(name="longitude")
	private Double longitude;
	
	@Value("${some.key:0.0}")
	@Column(name="altitude")//, columnDefinition="INT DEFAULT 0")
	private Float altitude;
	
	@Column(name="timings")
	private String openTimings;
	
	@Column(name="expecteddroptime")
	private String expectedDropTime;
	
	public Long getId(){
		return this.nodeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public NodeType getType() {
		return type;
	}
	public void setType(NodeType type) {
		this.type = type;
	}
	public Long getRouteID() {
		return this.route.getId();
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Float getAltitude() {
		return altitude;
	}
	public void setAltitude(Float altitude) {
		this.altitude = altitude;
	}
	public String getOpenTimings() {
		return openTimings;
	}
	public void setOpenTimings(String openTimings) {
		this.openTimings = openTimings;
	}
	public String getExpectedDropTime() {
		return expectedDropTime;
	}
	public void setExpectedDropTime(String expectedDropTime) {
		this.expectedDropTime = expectedDropTime;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	
}
