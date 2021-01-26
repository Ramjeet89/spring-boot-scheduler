package com.springboot.scheduler.service;

import com.springboot.scheduler.model.User;
import com.springboot.scheduler.repository.UserRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class UserService {

    Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRespository userRespository;

    //scheduler a job to add a data in data based in every 5 seconds
    @Scheduled(fixedRate = 5000)
    public void add2DatabaseJob() {
        User user = new User();
        user.setName("user" + new Random().nextInt(374483));
        userRespository.save(user);
        System.out.println("added service call in " + new Date().toString());
    }

    @Scheduled(cron = "0/15 * * * * *")
    public void fetchDBJob() {
        List<User> users = userRespository.findAll();
        System.out.println("fetch service call in " + new Date().toString());
        System.out.println("No of Record fetched " + users.size());
        logger.info("user:{}", users);
    }
}
