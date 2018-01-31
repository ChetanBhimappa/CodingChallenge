package com.example.Route.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Route.models.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route,Long>{

}
