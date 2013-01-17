package com.github.trask.guavaslides.cache;

import com.github.trask.guavaslides.Names.Name;
import com.github.trask.guavaslides.NicknameService;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

class NicknameCache {

    private final LoadingCache<Name, String> nicknameCache = CacheBuilder.newBuilder()
            .build(new CacheLoader<Name, String>() {
                @Override
                public String load(Name name) throws Exception {
                    return NicknameService.generateNickname(name);
                }
            });

    String getNickname(Name name) {
        return nicknameCache.getUnchecked(name);
    }
}
