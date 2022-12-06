package com.example.ipl.ipl.data;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.example.ipl.ipl.Model.Match;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

  private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

  @Override
  public Match process(final MatchInput matchInput) throws Exception {
    Match match = new Match();
        match.setMatch_id((matchInput.getMatch_id()));
        match.setDate((matchInput.getDate()));
        match.setVenue(matchInput.getVenue());
        match.setTeam1(matchInput.getTeam1());
        match.setTeam2(matchInput.getTeam2());
        match.setStage(matchInput.getStage());
        match.setToss_winner(matchInput.getToss_winner());
        match.setToss_decision(matchInput.getToss_decision());
        match.setFirst_ings_score(matchInput.getFirst_ings_score());
        match.setFirst_ings_wkts(matchInput.getFirst_ings_wkts());
        match.setSecond_ings_score(matchInput.getSecond_ings_score());
        match.setSecond_ings_wkts(matchInput.getSecond_ings_wkts());
        match.setMatch_winner(matchInput.getMatch_winner());
        match.setWon_by(matchInput.getWon_by());
        match.setMargin(matchInput.getMargin());
        match.setPlayer_of_the_match(matchInput.getPlayer_of_the_match());
        match.setTop_scorer(matchInput.getTop_scorer());
        match.setHighscore(matchInput.getHighscore());
        match.setBest_bowling(matchInput.getBest_bowling());
        match.setBest_bowling_figure(matchInput.getBest_bowling_figure());




    return match;
  }
}