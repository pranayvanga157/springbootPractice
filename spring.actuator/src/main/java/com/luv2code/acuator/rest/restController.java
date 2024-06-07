package com.luv2code.acuator.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCoach() {
        return teamCoach;
    }

    public void setTeamCoach(String teamCoach) {
        this.teamCoach = teamCoach;
    }

    @Value("${team.name}")
  private String teamName;
    @Value("${team.coach}")
  private String teamCoach ;


    @GetMapping("/demo")
    public String getData (){
            return "restController{" +
                    "teamName='" + teamName + '\'' +
                    ", teamCoach='" + teamCoach + '\'' +
                    '}';
        }



}
