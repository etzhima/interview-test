package com.travix.medusa.busyflights.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.domain.busyflights.Flight;

@Service
public class BusyFlightsService{
  
  private List<FlightService> flightServices;

  public BusyFlightsService(final List<FlightService> flightServices) {
    this.flightServices = flightServices;
  }

  public BusyFlightsResponse search(final BusyFlightsRequest busyFlightsRequest)  {
    //TODO refactor to use completableFuture
    final List<Flight> flights = flightServices.stream()
        .map(serv -> serv.search(busyFlightsRequest))
        .collect(Collectors.toList());
    
    return new BusyFlightsResponse(flights);
  }
}
