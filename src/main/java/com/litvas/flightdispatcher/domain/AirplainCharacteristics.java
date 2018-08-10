package com.litvas.flightdispatcher.domain;

public class AirplainCharacteristics {

    private int maxSpeed;
    private int acceleration;
    private int changeHeight;
    private double changeCourse;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getChangeHeight() {
        return changeHeight;
    }

    public void setChangeHeight(int changeHeight) {
        this.changeHeight = changeHeight;
    }

    public double getChangeCourse() {
        return changeCourse;
    }

    public void setChangeCourse(double changeCourse) {
        this.changeCourse = changeCourse;
    }
}

