package com.travix.medusa.busyflights.domain.busyflights;

import java.util.ArrayList;
import java.util.List;

public class BusyFlightsResponse {
  private List<Flight> flights = new ArrayList<>();

  public BusyFlightsResponse() {
  }

  public BusyFlightsResponse(List<Flight> flights) {
    this.flights = flights;
  }

  public List<Flight> getFlights() {
    return flights;
  }

  public void setFlights(List<Flight> flights) {
    this.flights = flights;
  }
}
