package com.sannu.spring.retry;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public interface RetryService {

    @Retryable(value = {Exception.class}, maxAttempts = 3, backoff = @Backoff(delay = 5000))
    String retry(String username) throws Exception;

    @Recover
    String recover(Exception e, String username);
}
