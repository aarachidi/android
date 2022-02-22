package com.example.rachidi_achraf;

public class Driver {
    int position;
    DriverDetail driver;
    Team team;
    String points;
    int saison;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public DriverDetail getDriver() {
        return driver;
    }

    public void setDriver(DriverDetail driver) {
        this.driver = driver;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public int getSaison() {
        return saison;
    }

    public void setSaison(int saison) {
        this.saison = saison;
    }
}
