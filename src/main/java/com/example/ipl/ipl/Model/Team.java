package com.example.ipl.ipl.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Team {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String teamName;
    private Long totalMatches;
    private Long totalWins;

    @Transient
    private List<Match> matches;
    
    
    public int getId() {
        return id;
    }
    public Team(String teamName, Long e) {
        this.teamName = teamName;
        this.totalMatches = e;
    }
    public List<Match> getMatches() {
        return matches;
    }
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
    public Team() {
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public Long getTotalMatches() {
        return totalMatches;
    }
    public void setTotalMatches(Long totalMatches) {
        this.totalMatches = totalMatches;
    }
    public Long getTotalWins() {
        return totalWins;
    }
    public void setTotalWins(Long l) {
        this.totalWins = l;
    }
    @Override
    public String toString() {
        return "Team [teamName=" + teamName + ", totalMatches=" + totalMatches + ", totalWins=" + totalWins + "]";
    }
}    
    
    
