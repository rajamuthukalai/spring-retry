package com.sannu.spring.retry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RetryServiceImpl implements RetryService {

    Logger logger = LoggerFactory.getLogger(RetryServiceImpl.class);

    @Override
    public String retry(String username) throws Exception {
        logger.info("inside retry service");
        if (username.equals("null")) {
            throw new Exception("testing spring retry");
        }
        return "Welcome " + username.toString() + "! have a nice day!!!";
    }

    @Override
    public String recover(Exception e, String username) {
        return "Welcome " + "default" + "! have a nice day!!!";
    }

}
