package com.github.trask.guavaslides.cache;

import java.util.concurrent.TimeUnit;

import com.github.trask.guavaslides.Names.Name;
import com.github.trask.guavaslides.NicknameService;
import com.google.common.util.concurrent.RateLimiter;

public class RateLimitingNicknameService3 {

    private static final RateLimiter rateLimiter = RateLimiter.create(100.0);

    public static String generateNickname(Name name) throws Exception {
        if (rateLimiter.tryAcquire(name.getFirst().length() + name.getLast().length(), 10, TimeUnit.SECONDS)) {
            return NicknameService.generateNickname(name);
        } else {
            return "Sorry, the nickname service is currently overworked, please try again later";
        }
    }
}
