package com.litvas.flightdispatcher.domain;

public class Airplain {

    private Long id;
    private AirplainCharacteristics airplainCharacteristics;
    private TemporaryPoint position;
    private Flight flight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AirplainCharacteristics getAirplainCharacteristics() {
        return airplainCharacteristics;
    }

    public void setAirplainCharacteristics(AirplainCharacteristics airplainCharacteristics) {
        this.airplainCharacteristics = airplainCharacteristics;
    }

    public TemporaryPoint getPosition() {
        return position;
    }

    public void setPosition(TemporaryPoint position) {
        this.position = position;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
