package com.github.trask.guavalunch.cache;

import com.github.trask.guavalunch.Names.Name;
import com.github.trask.guavalunch.NicknameService;
import com.google.common.util.concurrent.RateLimiter;

public class RateLimitingNicknameService {

    private static final RateLimiter rateLimiter = RateLimiter.create(5.0);

    public static String generateNickname(Name name) throws Exception {
        rateLimiter.acquire();
        return NicknameService.generateNickname(name);
    }
}
