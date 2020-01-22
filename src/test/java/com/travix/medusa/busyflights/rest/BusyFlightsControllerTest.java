package com.travix.medusa.busyflights.rest;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class BusyFlightsControllerTest {
//TODO all functionality should be covered by tests
  @Autowired
  private MockMvc mvc;
  
  @Test
  void searchFlights() throws Exception {
    //TODO add expected response 
    mvc.perform(MockMvcRequestBuilders.post("/flights").accept(MediaType.APPLICATION_JSON).content("{\"origin\":\"LHR\"}"))
        .andExpect(status().isOk())
        .andExpect(content().string(equalTo("{\"airline\":\"CrazyAirLine\"}")));
  }
}