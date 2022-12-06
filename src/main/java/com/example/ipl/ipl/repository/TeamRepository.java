package com.example.ipl.ipl.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ipl.ipl.Model.Team;
//@Repository
public interface TeamRepository extends CrudRepository<Team,Long> {
    Team findByteamName(String teamName);
}
