package net.learning.HttpServletRequest.Attribute.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.learning.HttpServletRequest.Attribute.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class Controller {
    @Autowired
    private Service service;

    @PostMapping("/validateTicket")
    public ResponseEntity<String> validateTicket(@RequestHeader("ticketNumber") String ticketNumber) {

        return ResponseEntity.status(HttpStatus.OK).body(service.conditionalCheck(ticketNumber));
    }
}
