package com.bhanna.hockeystats.team.controller;

import com.bhanna.hockeystats.team.models.TeamResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamsController {

    @GetMapping("/api/v1/team")
    public TeamResponse teamInfo() {
        NhlRestService n = new NhlRestService();
        TeamResponse resp = n.callRestService();
        return resp;
    }

}
