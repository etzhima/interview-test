package com.travix.medusa.busyflights.domain.busyflights;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Flight {

  private String airline;
  private String supplier;
  private BigDecimal fare;
  @NotNull
  @Size(min = 3, max = 3)
  private String departureAirportCode;
  @NotNull
  @Size(min = 3, max = 3)
  private String destinationAirportCode;
  private String departureDate;
  private String arrivalDate;

  public String getAirline() {
    return airline;
  }

  public void setAirline(String airline) {
    this.airline = airline;
  }

  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public BigDecimal getFare() {
    return fare;
  }

  public void setFare(BigDecimal fare) {
    this.fare = fare;
  }

  public void setFare(Double fare) {
    this.fare = BigDecimal.valueOf(fare).round(new MathContext(2));
  }

  public String getDepartureAirportCode() {
    return departureAirportCode;
  }

  public void setDepartureAirportCode(String departureAirportCode) {
    this.departureAirportCode = departureAirportCode;
  }

  public String getDestinationAirportCode() {
    return destinationAirportCode;
  }

  public void setDestinationAirportCode(String destinationAirportCode) {
    this.destinationAirportCode = destinationAirportCode;
  }

  public String getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }

  public String getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
  }
}
