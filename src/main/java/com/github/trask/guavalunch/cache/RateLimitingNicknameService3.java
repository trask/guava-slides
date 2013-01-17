package com.github.trask.guavalunch.cache;

import com.github.trask.guavalunch.NicknameService;
import com.github.trask.guavalunch.Names.Name;
import com.google.common.util.concurrent.RateLimiter;

public class RateLimitingNicknameService3 {

    private static final RateLimiter rateLimiter = RateLimiter.create(100.0);

    public static String generateNickname(Name name) throws Exception {
        rateLimiter.acquire(name.getFirst().length() + name.getLast().length());
        return NicknameService.generateNickname(name);
    }
}
