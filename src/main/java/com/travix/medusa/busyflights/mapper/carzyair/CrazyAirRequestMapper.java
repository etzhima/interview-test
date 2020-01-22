package com.travix.medusa.busyflights.mapper.carzyair;

import org.springframework.stereotype.Component;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirRequest;

@Component
public class CrazyAirRequestMapper {

  public CrazyAirRequest map(BusyFlightsRequest request) {
   
    CrazyAirRequest crazyAirRequest = new CrazyAirRequest();
    crazyAirRequest.setOrigin(request.getOrigin());
    crazyAirRequest.setDestination(request.getDestination());
    crazyAirRequest.setDepartureDate(request.getDepartureDate());
    crazyAirRequest.setReturnDate(request.getReturnDate());
    crazyAirRequest.setPassengerCount(request.getNumberOfPassengers());
    
    return crazyAirRequest;
  }
}
