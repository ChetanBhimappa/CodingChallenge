package com.example.Route.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Route.models.Node;

@Repository
public interface NodeRepository extends JpaRepository<Node,Long>{

}
