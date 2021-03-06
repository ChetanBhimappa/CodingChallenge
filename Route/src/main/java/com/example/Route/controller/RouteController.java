package com.example.Route.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Route.Category.Courier;
import com.example.Route.Category.Equipment;
import com.example.Route.Category.SegmentType;
import com.example.Route.dto.NodeDto;
import com.example.Route.models.Node;
import com.example.Route.models.Route;
import com.example.Route.repositories.NodeRepository;
import com.example.Route.repositories.RouteRepository;

@RestController
@RequestMapping("/route")
public class RouteController {
	
	@Autowired
	RouteRepository routeRepository;
	@Autowired
	NodeRepository nodeRepository;


	@GetMapping
	List<Route> getRouteList(){
		return routeRepository.findAll();
		
	}
	
	@GetMapping(value="/{routeID}")
	ResponseEntity<Route> getRouteByRouteId(@PathVariable(value="routeID") Long routeID){
		Route route = routeRepository.findOne(routeID);
		if(route!=null){
			return ResponseEntity.ok().body(route);
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping(value="/{routeID}")
	ResponseEntity<Route> deleteRoute(@PathVariable(value="routeID") Long routeID){
		Route route = routeRepository.findOne(routeID);
		if(route!=null){
			List<Node> list = route.getNodes();
			for(Node node: list){
				nodeRepository.delete(node.getId());
			}
			routeRepository.delete(routeID);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	Route creteNewRoute( @RequestBody Route route){
		return routeRepository.save(route);
	}
		
	@PostMapping(value="/node")
	ResponseEntity<Route> createNewNode(@Valid @RequestBody NodeDto nodeDto){
		Long routeId = nodeDto.getRouteID();
		Route route = routeRepository.findOne(routeId);
		if(route!=null){
			Node node = nodeDto.toNode();
			List<Node> list = route.getNodes()!=null?route.getNodes():new ArrayList<Node>();
			list.add(node);
			route.setNodes(list);
			node.setRoute(route);
			node = nodeRepository.save(node);
			route = routeRepository.findOne(routeId);
			return ResponseEntity.ok().body(route);	
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping(value="/node/{nodeID}")
	ResponseEntity<Route> deleteNode(@PathVariable(value="nodeID") Long nodeID){
		Node node = nodeRepository.findOne(nodeID);
		if(node!=null){
			Route route = routeRepository.findOne(node.getRouteID());
			Long routeId = route.getId();
			if(route!=null){
				nodeRepository.delete(node);
				route = routeRepository.findOne(routeId);
				return ResponseEntity.ok().body(route);
			}
		}
		return ResponseEntity.notFound().build();
	}
}
