package com.github.trask.guavaslides.cache;

import com.github.trask.guavaslides.NicknameService;
import com.github.trask.guavaslides.Names.Name;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class NicknameCache2 {

    private static final LoadingCache<Name, String> nicknameCache = CacheBuilder.newBuilder()
            .weakKeys()
            .build(new CacheLoader<Name, String>() {
                @Override
                public String load(Name name) throws Exception {
                    return NicknameService.generateNickname(name);
                }
            });

    public static String getNickname(Name name) {
        return nicknameCache.getUnchecked(name);
    }
}
