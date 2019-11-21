
package com.bhanna.hockeystats.team.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gamesPlayed",
    "wins",
    "losses",
    "ot",
    "pts",
    "ptPctg",
    "goalsPerGame",
    "goalsAgainstPerGame",
    "evGGARatio",
    "powerPlayPercentage",
    "powerPlayGoals",
    "powerPlayGoalsAgainst",
    "powerPlayOpportunities",
    "penaltyKillPercentage",
    "shotsPerGame",
    "shotsAllowed",
    "winScoreFirst",
    "winOppScoreFirst",
    "winLeadFirstPer",
    "winLeadSecondPer",
    "winOutshootOpp",
    "winOutshotByOpp",
    "faceOffsTaken",
    "faceOffsWon",
    "faceOffsLost",
    "faceOffWinPercentage",
    "shootingPctg",
    "savePctg",
    "penaltyKillOpportunities",
    "savePctRank",
    "shootingPctRank"
})
public class Stat {

    @JsonProperty("gamesPlayed")
    private Integer gamesPlayed;
    @JsonProperty("wins")
    private String wins;
    @JsonProperty("losses")
    private String losses;
    @JsonProperty("ot")
    private String ot;
    @JsonProperty("pts")
    private String pts;
    @JsonProperty("ptPctg")
    private String ptPctg;
    @JsonProperty("goalsPerGame")
    private String goalsPerGame;
    @JsonProperty("goalsAgainstPerGame")
    private String goalsAgainstPerGame;
    @JsonProperty("evGGARatio")
    private String evGGARatio;
    @JsonProperty("powerPlayPercentage")
    private String powerPlayPercentage;
    @JsonProperty("powerPlayGoals")
    private String powerPlayGoals;
    @JsonProperty("powerPlayGoalsAgainst")
    private String powerPlayGoalsAgainst;
    @JsonProperty("powerPlayOpportunities")
    private String powerPlayOpportunities;
    @JsonProperty("penaltyKillPercentage")
    private String penaltyKillPercentage;
    @JsonProperty("shotsPerGame")
    private String shotsPerGame;
    @JsonProperty("shotsAllowed")
    private String shotsAllowed;
    @JsonProperty("winScoreFirst")
    private String winScoreFirst;
    @JsonProperty("winOppScoreFirst")
    private String winOppScoreFirst;
    @JsonProperty("winLeadFirstPer")
    private String winLeadFirstPer;
    @JsonProperty("winLeadSecondPer")
    private String winLeadSecondPer;
    @JsonProperty("winOutshootOpp")
    private String winOutshootOpp;
    @JsonProperty("winOutshotByOpp")
    private String winOutshotByOpp;
    @JsonProperty("faceOffsTaken")
    private String faceOffsTaken;
    @JsonProperty("faceOffsWon")
    private String faceOffsWon;
    @JsonProperty("faceOffsLost")
    private String faceOffsLost;
    @JsonProperty("faceOffWinPercentage")
    private String faceOffWinPercentage;
    @JsonProperty("shootingPctg")
    private Double shootingPctg;
    @JsonProperty("savePctg")
    private Double savePctg;
    @JsonProperty("penaltyKillOpportunities")
    private String penaltyKillOpportunities;
    @JsonProperty("savePctRank")
    private String savePctRank;
    @JsonProperty("shootingPctRank")
    private String shootingPctRank;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gamesPlayed")
    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    @JsonProperty("gamesPlayed")
    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    @JsonProperty("wins")
    public String getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(String wins) {
        this.wins = wins;
    }

    @JsonProperty("losses")
    public String getLosses() {
        return losses;
    }

    @JsonProperty("losses")
    public void setLosses(String losses) {
        this.losses = losses;
    }

    @JsonProperty("ot")
    public String getOt() {
        return ot;
    }

    @JsonProperty("ot")
    public void setOt(String ot) {
        this.ot = ot;
    }

    @JsonProperty("pts")
    public String getPts() {
        return pts;
    }

    @JsonProperty("pts")
    public void setPts(String pts) {
        this.pts = pts;
    }

    @JsonProperty("ptPctg")
    public String getPtPctg() {
        return ptPctg;
    }

    @JsonProperty("ptPctg")
    public void setPtPctg(String ptPctg) {
        this.ptPctg = ptPctg;
    }

    @JsonProperty("goalsPerGame")
    public String getGoalsPerGame() {
        return goalsPerGame;
    }

    @JsonProperty("goalsPerGame")
    public void setGoalsPerGame(String goalsPerGame) {
        this.goalsPerGame = goalsPerGame;
    }

    @JsonProperty("goalsAgainstPerGame")
    public String getGoalsAgainstPerGame() {
        return goalsAgainstPerGame;
    }

    @JsonProperty("goalsAgainstPerGame")
    public void setGoalsAgainstPerGame(String goalsAgainstPerGame) {
        this.goalsAgainstPerGame = goalsAgainstPerGame;
    }

    @JsonProperty("evGGARatio")
    public String getEvGGARatio() {
        return evGGARatio;
    }

    @JsonProperty("evGGARatio")
    public void setEvGGARatio(String evGGARatio) {
        this.evGGARatio = evGGARatio;
    }

    @JsonProperty("powerPlayPercentage")
    public String getPowerPlayPercentage() {
        return powerPlayPercentage;
    }

    @JsonProperty("powerPlayPercentage")
    public void setPowerPlayPercentage(String powerPlayPercentage) {
        this.powerPlayPercentage = powerPlayPercentage;
    }

    @JsonProperty("powerPlayGoals")
    public String getPowerPlayGoals() {
        return powerPlayGoals;
    }

    @JsonProperty("powerPlayGoals")
    public void setPowerPlayGoals(String powerPlayGoals) {
        this.powerPlayGoals = powerPlayGoals;
    }

    @JsonProperty("powerPlayGoalsAgainst")
    public String getPowerPlayGoalsAgainst() {
        return powerPlayGoalsAgainst;
    }

    @JsonProperty("powerPlayGoalsAgainst")
    public void setPowerPlayGoalsAgainst(String powerPlayGoalsAgainst) {
        this.powerPlayGoalsAgainst = powerPlayGoalsAgainst;
    }

    @JsonProperty("powerPlayOpportunities")
    public String getPowerPlayOpportunities() {
        return powerPlayOpportunities;
    }

    @JsonProperty("powerPlayOpportunities")
    public void setPowerPlayOpportunities(String powerPlayOpportunities) {
        this.powerPlayOpportunities = powerPlayOpportunities;
    }

    @JsonProperty("penaltyKillPercentage")
    public String getPenaltyKillPercentage() {
        return penaltyKillPercentage;
    }

    @JsonProperty("penaltyKillPercentage")
    public void setPenaltyKillPercentage(String penaltyKillPercentage) {
        this.penaltyKillPercentage = penaltyKillPercentage;
    }

    @JsonProperty("shotsPerGame")
    public String getShotsPerGame() {
        return shotsPerGame;
    }

    @JsonProperty("shotsPerGame")
    public void setShotsPerGame(String shotsPerGame) {
        this.shotsPerGame = shotsPerGame;
    }

    @JsonProperty("shotsAllowed")
    public String getShotsAllowed() {
        return shotsAllowed;
    }

    @JsonProperty("shotsAllowed")
    public void setShotsAllowed(String shotsAllowed) {
        this.shotsAllowed = shotsAllowed;
    }

    @JsonProperty("winScoreFirst")
    public String getWinScoreFirst() {
        return winScoreFirst;
    }

    @JsonProperty("winScoreFirst")
    public void setWinScoreFirst(String winScoreFirst) {
        this.winScoreFirst = winScoreFirst;
    }

    @JsonProperty("winOppScoreFirst")
    public String getWinOppScoreFirst() {
        return winOppScoreFirst;
    }

    @JsonProperty("winOppScoreFirst")
    public void setWinOppScoreFirst(String winOppScoreFirst) {
        this.winOppScoreFirst = winOppScoreFirst;
    }

    @JsonProperty("winLeadFirstPer")
    public String getWinLeadFirstPer() {
        return winLeadFirstPer;
    }

    @JsonProperty("winLeadFirstPer")
    public void setWinLeadFirstPer(String winLeadFirstPer) {
        this.winLeadFirstPer = winLeadFirstPer;
    }

    @JsonProperty("winLeadSecondPer")
    public String getWinLeadSecondPer() {
        return winLeadSecondPer;
    }

    @JsonProperty("winLeadSecondPer")
    public void setWinLeadSecondPer(String winLeadSecondPer) {
        this.winLeadSecondPer = winLeadSecondPer;
    }

    @JsonProperty("winOutshootOpp")
    public String getWinOutshootOpp() {
        return winOutshootOpp;
    }

    @JsonProperty("winOutshootOpp")
    public void setWinOutshootOpp(String winOutshootOpp) {
        this.winOutshootOpp = winOutshootOpp;
    }

    @JsonProperty("winOutshotByOpp")
    public String getWinOutshotByOpp() {
        return winOutshotByOpp;
    }

    @JsonProperty("winOutshotByOpp")
    public void setWinOutshotByOpp(String winOutshotByOpp) {
        this.winOutshotByOpp = winOutshotByOpp;
    }

    @JsonProperty("faceOffsTaken")
    public String getFaceOffsTaken() {
        return faceOffsTaken;
    }

    @JsonProperty("faceOffsTaken")
    public void setFaceOffsTaken(String faceOffsTaken) {
        this.faceOffsTaken = faceOffsTaken;
    }

    @JsonProperty("faceOffsWon")
    public String getFaceOffsWon() {
        return faceOffsWon;
    }

    @JsonProperty("faceOffsWon")
    public void setFaceOffsWon(String faceOffsWon) {
        this.faceOffsWon = faceOffsWon;
    }

    @JsonProperty("faceOffsLost")
    public String getFaceOffsLost() {
        return faceOffsLost;
    }

    @JsonProperty("faceOffsLost")
    public void setFaceOffsLost(String faceOffsLost) {
        this.faceOffsLost = faceOffsLost;
    }

    @JsonProperty("faceOffWinPercentage")
    public String getFaceOffWinPercentage() {
        return faceOffWinPercentage;
    }

    @JsonProperty("faceOffWinPercentage")
    public void setFaceOffWinPercentage(String faceOffWinPercentage) {
        this.faceOffWinPercentage = faceOffWinPercentage;
    }

    @JsonProperty("shootingPctg")
    public Double getShootingPctg() {
        return shootingPctg;
    }

    @JsonProperty("shootingPctg")
    public void setShootingPctg(Double shootingPctg) {
        this.shootingPctg = shootingPctg;
    }

    @JsonProperty("savePctg")
    public Double getSavePctg() {
        return savePctg;
    }

    @JsonProperty("savePctg")
    public void setSavePctg(Double savePctg) {
        this.savePctg = savePctg;
    }

    @JsonProperty("penaltyKillOpportunities")
    public String getPenaltyKillOpportunities() {
        return penaltyKillOpportunities;
    }

    @JsonProperty("penaltyKillOpportunities")
    public void setPenaltyKillOpportunities(String penaltyKillOpportunities) {
        this.penaltyKillOpportunities = penaltyKillOpportunities;
    }

    @JsonProperty("savePctRank")
    public String getSavePctRank() {
        return savePctRank;
    }

    @JsonProperty("savePctRank")
    public void setSavePctRank(String savePctRank) {
        this.savePctRank = savePctRank;
    }

    @JsonProperty("shootingPctRank")
    public String getShootingPctRank() {
        return shootingPctRank;
    }

    @JsonProperty("shootingPctRank")
    public void setShootingPctRank(String shootingPctRank) {
        this.shootingPctRank = shootingPctRank;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
