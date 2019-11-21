package com.bhanna.hockeystats.team.controller;

import com.bhanna.hockeystats.player.models.PlayerResponse;
import com.bhanna.hockeystats.team.models.TeamResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NhlRestService {
    private String nhlApi = "https://statsapi.web.nhl.com/api/v1";

    public TeamResponse callRestService() {
        RestTemplate restTemplate = new RestTemplate();
        TeamResponse resp = restTemplate.getForObject(this.nhlApi + "/teams/5?expand=team.stats&expand=team.roster", TeamResponse.class);
        return resp;
    }

    public PlayerResponse callRestServicePlayer() {
        RestTemplate restTemplate = new RestTemplate();
        PlayerResponse resp = restTemplate.getForObject(this.nhlApi + "/people/" + "8471675" + "/stats?stats=statsSingleSeason&season=" + "20192020", PlayerResponse.class);
        return resp;
    }

}
