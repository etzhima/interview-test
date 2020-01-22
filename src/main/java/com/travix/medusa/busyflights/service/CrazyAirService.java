package com.travix.medusa.busyflights.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.Flight;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import com.travix.medusa.busyflights.mapper.carzyair.CrazyAirRequestMapper;
import com.travix.medusa.busyflights.mapper.carzyair.CrazyAirResponseMapper;

@Service
public class CrazyAirService implements FlightService {
  
  @Value("${crazyair.url}")
  private String url;
  
  private RestTemplate restTemplate;

  private CrazyAirRequestMapper crazyAirRequestMapper;

  private CrazyAirResponseMapper crazyAirResponseMapper;

  public CrazyAirService(RestTemplate restTemplate,
      CrazyAirRequestMapper crazyAirRequestMapper,
      CrazyAirResponseMapper crazyAirResponseMapper) {
    this.restTemplate = restTemplate;
    this.crazyAirRequestMapper = crazyAirRequestMapper;
    this.crazyAirResponseMapper = crazyAirResponseMapper;
  }

  @Override
  public Flight search(BusyFlightsRequest request) {

    final CrazyAirRequest crazyAirRequest = crazyAirRequestMapper.map(request);
    final CrazyAirResponse response = restTemplate.postForObject(url, crazyAirRequest, CrazyAirResponse.class);
    return crazyAirResponseMapper.map(response);
  }
}
