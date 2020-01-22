package com.travix.medusa.busyflights.domain.busyflights;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BusyFlightsRequest {

    @NotNull
    @Size(min = 3, max = 3)
    private String origin;
    @NotNull
    @Size(min = 3, max = 3)
    private String destination;
    private String departureDate;
    private String returnDate;
    @NotNull
    @Size(max = 4)
    private int numberOfPassengers;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(final String destination) {
        this.destination = destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(final String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(final String returnDate) {
        this.returnDate = returnDate;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(final int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
