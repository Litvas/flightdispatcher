package com.litvas.flightdispatcher.domain;

import java.util.List;

public class Flight {

    private Long id;
    private List<WayPoint> wayPoints;
    private List<TemporaryPoint> temporaryPoints;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<WayPoint> getWayPoints() {
        return wayPoints;
    }

    public void setWayPoints(List<WayPoint> wayPoints) {
        this.wayPoints = wayPoints;
    }

    public List<TemporaryPoint> getTemporaryPoints() {
        return temporaryPoints;
    }

    public void setTemporaryPoints(List<TemporaryPoint> temporaryPoints) {
        this.temporaryPoints = temporaryPoints;
    }
}
