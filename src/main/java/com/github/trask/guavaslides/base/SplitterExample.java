package com.github.trask.guavaslides.base;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;

public class SplitterExample {

    public static void main(String[] args) {

        String names = "Able,, Baker, Charlie,";

        for (String name : names.split(",")) {
            System.out.println("\"" + name + "\"");
        }

        System.out.println(Strings.repeat("-", 80));

        Splitter.on(",")
                .omitEmptyStrings().trimResults()
                .split(names);

        for (String name : Splitter.on(",").omitEmptyStrings().trimResults()
                .split(names)) {
            System.out.println("\"" + name + "\"");
        }
    }
}
// note: Splitter instances are immutable
// note: fluent API
// note: Splitter.split() returns Iterable
