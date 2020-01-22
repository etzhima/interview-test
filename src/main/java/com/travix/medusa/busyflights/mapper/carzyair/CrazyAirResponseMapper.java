package com.travix.medusa.busyflights.mapper.carzyair;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.travix.medusa.busyflights.domain.busyflights.Flight;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;

@Component
public class CrazyAirResponseMapper {
  
  public Flight map(final CrazyAirResponse response) {
    final Flight flight = new Flight();
    flight.setAirline(response.getAirline());
    flight.setFare(BigDecimal.valueOf(response.getPrice()));
    flight.setDepartureAirportCode(response.getDepartureAirportCode());
    flight.setDestinationAirportCode(response.getDestinationAirportCode());
    flight.setDepartureDate(response.getDepartureDate());
    flight.setArrivalDate(response.getArrivalDate());
    return flight;
  }

}
