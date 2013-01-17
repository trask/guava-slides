package com.github.trask.guavaslides.base;

import java.util.List;
import java.util.Map;

import com.github.trask.guavaslides.Names;
import com.github.trask.guavaslides.Names.Name;
import com.github.trask.guavaslides.NicknameService;
import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

public class JoinerExample {

    public static void main(String[] args) throws Exception {

        List<Name> names = Names.names(3);

        System.out.println(Joiner.on(", ").join(names));

        Map<Name, String> nicknameMap = Maps.newLinkedHashMap();
        for (Name name : names) {
            nicknameMap.put(name, NicknameService.generateNickname(name));
        }

        System.out.println(Joiner.on(", ").withKeyValueSeparator(" => ").join(nicknameMap));

    }
}
