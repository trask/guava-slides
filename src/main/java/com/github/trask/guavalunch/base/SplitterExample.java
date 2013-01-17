package com.github.trask.guavalunch.base;

import static com.github.trask.guavalunch.Names.name;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;

public class SplitterExample {

    public static void main(String[] args) {

        String names = name() + ", " + name() + ",, " + name() + ",";

        for (String name : names.split(",")) {
            System.out.println("\"" + name + "\"");
        }

        System.out.println(Strings.repeat("-", 80));

        for (String name : Splitter.on(",").omitEmptyStrings().trimResults()
                .split(names)) {
            System.out.println("\"" + name + "\"");
        }
    }
}
// note: Splitter instances are immutable
// note: fluent API
// note: Splitter.split() returns Iterable
