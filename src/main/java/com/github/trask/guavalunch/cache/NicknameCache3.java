package com.github.trask.guavalunch.cache;

import com.github.trask.guavalunch.Names.Name;
import com.github.trask.guavalunch.NicknameService;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class NicknameCache3 {

    private static final LoadingCache<Name, String> nicknameCache = CacheBuilder.newBuilder()
            .maximumSize(1000)
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
