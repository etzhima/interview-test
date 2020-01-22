package com.travix.medusa.busyflights.rest;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.service.BusyFlightsService;

@RestController
public class BusyFlightsController {

  private BusyFlightsService busyFlightsService;

  public BusyFlightsController(final BusyFlightsService busyFlightsService) {
    this.busyFlightsService = busyFlightsService;
  }

  @PostMapping(value = "/flights", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<BusyFlightsResponse> searchFlights(@RequestBody @Valid BusyFlightsRequest request) {
    return new ResponseEntity<>(busyFlightsService.search(request), HttpStatus.OK);
  }
}
