package com.overops.examples.service;

import com.overops.examples.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class VeryBrokenService {


    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public void execute(User demoUser, boolean generateEvent) {


        log.trace("user details: {}", demoUser.toString());

        if (generateEvent) {
            throw new UnsupportedOperationException("this broken service isn't very supportive");
        }

    }
}