package com.litvas.flightdispatcher.domain;

public class TemporaryPoint {

    private String latitude;
    private String longitude;
    private int heightFlight;
    private int speedFlight;
    private double courseFlight;
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

    public double getCourseFlight() {
        return courseFlight;
    }

    public void setCourseFlight(double courseFlight) {
        this.courseFlight = courseFlight;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
