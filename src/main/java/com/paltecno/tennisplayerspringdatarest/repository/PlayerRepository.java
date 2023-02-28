package com.paltecno.tennisplayerspringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paltecno.tennisplayerspringdatarest.entity.Player;

//@RepositoryRestResource(path="athletes") 
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
