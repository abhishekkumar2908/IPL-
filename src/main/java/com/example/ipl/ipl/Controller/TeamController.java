package com.example.ipl.ipl.Controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ipl.ipl.Model.Team;
import com.example.ipl.ipl.repository.MatchRepository;
import com.example.ipl.ipl.repository.TeamRepository;
@RestController
public class TeamController {
    private TeamRepository teamRepo;
    private MatchRepository matchRepo;
    public TeamController(TeamRepository teamRepo, MatchRepository matchRepo){
        this.teamRepo = teamRepo;
        this.matchRepo = matchRepo;
    }
    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName){
        Team team = this.teamRepo.findByteamName(teamName);
        Pageable pages = PageRequest.of(0,1);
        team.setMatches(this.matchRepo.getByTeam1OrTeam2(teamName, teamName, pages));        
        return team;
    }    
}

 