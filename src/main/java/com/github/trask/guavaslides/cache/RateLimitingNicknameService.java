package com.github.trask.guavaslides.cache;

import com.github.trask.guavaslides.NicknameService;
import com.github.trask.guavaslides.Names.Name;
import com.google.common.util.concurrent.RateLimiter;

public class RateLimitingNicknameService {

    private static final RateLimiter rateLimiter = RateLimiter.create(5.0);

    public static String generateNickname(Name name) throws Exception {
        rateLimiter.acquire();
        return NicknameService.generateNickname(name);
    }
}
