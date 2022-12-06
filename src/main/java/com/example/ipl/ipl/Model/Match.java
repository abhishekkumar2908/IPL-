package com.example.ipl.ipl.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Match {
   @Id

   private int match_id;
   private String date;
   private String venue;
   private String team1;
   private String team2;
   private String stage; 
   private String toss_winner;
   private String toss_decision;
   private String first_ings_score;
   private String first_ings_wkts;
   private String second_ings_score;
   private String second_ings_wkts;
   private String match_winner;
   private String won_by;
   private String margin;
   private String player_of_the_match;
   private String top_scorer;
   private String highscore;
   private String best_bowling;
   private String best_bowling_figure;
   
public int getMatch_id() {
    return match_id;
}
public void setMatch_id(int l) {
    this.match_id = l;
}
public String getDate() {
    return date;  
}
public void setDate(String date) {
    this.date = date;
}
public String getVenue() {
    return venue;
}
public void setVenue(String venue) {
    this.venue = venue;
}
public String getTeam1() {
    return team1;
}
public void setTeam1(String team1) {
    this.team1 = team1;
}
public String getTeam2() {
    return team2;
}
public void setTeam2(String team2) {
    this.team2 = team2;
}
public String getStage() {
    return stage;
}
public void setStage(String stage) {
    this.stage = stage;
}
public String getToss_winner() {
    return toss_winner;
}
public void setToss_winner(String toss_winner) {
    this.toss_winner = toss_winner;
}
public String getToss_decision() {
    return toss_decision;
}
public void setToss_decision(String toss_decision) {
    this.toss_decision = toss_decision;
}
public String getFirst_ings_score() {
    return first_ings_score;
}
public void setFirst_ings_score(String first_ings_score) {
    this.first_ings_score = first_ings_score;
}
public String getFirst_ings_wkts() {
    return first_ings_wkts;
}
public void setFirst_ings_wkts(String first_ings_wkts) {
    this.first_ings_wkts = first_ings_wkts;
}
public String getSecond_ings_score() {
    return second_ings_score;
}
public void setSecond_ings_score(String second_ings_score) {
    this.second_ings_score = second_ings_score;
}
public String getSecond_ings_wkts() {
    return second_ings_wkts;
}
public void setSecond_ings_wkts(String second_ings_wkts) {
    this.second_ings_wkts = second_ings_wkts;
}
public String getMatch_winner() {
    return match_winner;
}
public void setMatch_winner(String match_winner) {
    this.match_winner = match_winner;
}
public String getWon_by() {
    return won_by;
}
public void setWon_by(String won_by) {
    this.won_by = won_by;
}
public String getMargin() {
    return margin;
}
public void setMargin(String margin) {
    this.margin = margin;
}
public String getPlayer_of_the_match() {
    return player_of_the_match;
}
public void setPlayer_of_the_match(String player_of_the_match) {
    this.player_of_the_match = player_of_the_match;
}
public String getTop_scorer() {
    return top_scorer;
}
public void setTop_scorer(String top_scorer) {
    this.top_scorer = top_scorer;
}
public String getHighscore() {
    return highscore;
}
public void setHighscore(String highscore) {
    this.highscore = highscore;
}
public String getBest_bowling() {
    return best_bowling;
}
public void setBest_bowling(String best_bowling) {
    this.best_bowling = best_bowling;
}
public String getBest_bowling_figure() {
    return best_bowling_figure;
}
public void setBest_bowling_figure(String best_bowling_figure) {
    this.best_bowling_figure = best_bowling_figure;
}
public void setId(long parseLong) {
}

   

}



