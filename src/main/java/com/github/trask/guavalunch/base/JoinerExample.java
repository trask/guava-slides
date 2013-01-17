package com.github.trask.guavalunch.base;

import java.util.List;
import java.util.Map;

import com.github.trask.guavalunch.Names;
import com.github.trask.guavalunch.Names.Name;
import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

public class JoinerExample {

    public static void main(String[] args) {

        List<Name> names = Names.names(3);

        System.out.println(Joiner.on(", ").join(names));

        Map<String, String> firstToLastMap = Maps.newLinkedHashMap();
        for (Name name : names) {
            firstToLastMap.put(name.getFirst(), name.getLast());
        }

        System.out.println(Joiner.on(", ").withKeyValueSeparator(" => ").join(firstToLastMap));
    }
}
