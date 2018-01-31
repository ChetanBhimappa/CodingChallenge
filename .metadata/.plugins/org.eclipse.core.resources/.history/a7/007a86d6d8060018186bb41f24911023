package com.example.Route.dto;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.Route.Category.NodeType;
import com.example.Route.models.Node;

public class NodeDto {
		
		/**
		 * 
		 */

		private String name;
		private NodeType type;
		private Long routeID;
		private Double latitude;
		private Double longitude;
		private Float altitude=0.0f;
		private String openTimings;
		private String expectedDropTime;
		
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
			return routeID;
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
		
		public Node toNode(){
			Node node = new Node();
			node.setAltitude(this.getAltitude());
			node.setLatitude(this.getLatitude());
			node.setLongitude(this.getLongitude());
			node.setName(this.getName());
			node.setOpenTimings(this.getOpenTimings());
			node.setType(this.getType());
			node.setExpectedDropTime(this.getExpectedDropTime());

			return node;
		}

}
