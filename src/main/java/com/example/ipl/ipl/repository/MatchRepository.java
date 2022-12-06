package com.example.ipl.ipl.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.example.ipl.ipl.Model.Match;

public interface MatchRepository extends CrudRepository<Match,Long>{
    List<Match> getByTeam1OrTeam2(String teamName1 , String teamName2, Pageable pages);
}
