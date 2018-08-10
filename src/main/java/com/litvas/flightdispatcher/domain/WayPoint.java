package com.litvas.flightdispatcher.domain;

public class WayPoint {

    private String latitude;
    private String longitude;
    private int heightFlight;
    private int speedFlight;
    private Flight flight;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getHeightFlight() {
        return heightFlight;
    }

    public void setHeightFlight(int heightFlight) {
        this.heightFlight = heightFlight;
    }

    public int getSpeedFlight() {
        return speedFlight;
    }

    public void setSpeedFlight(int speedFlight) {
        this.speedFlight = speedFlight;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
