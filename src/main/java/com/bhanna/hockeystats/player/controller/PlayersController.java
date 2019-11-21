package com.bhanna.hockeystats.player.controller;

import com.bhanna.hockeystats.player.models.PlayerResponse;
import com.bhanna.hockeystats.team.controller.NhlRestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayersController {

    @GetMapping("/api/v1/player")
    public PlayerResponse playerInfo() {
        NhlRestService n = new NhlRestService();
        PlayerResponse resp = n.callRestServicePlayer();
        return resp;
    }
}
