package com.github.trask.guavalunch;

import java.util.List;
import java.util.Random;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class Names {

    private static final List<Name> allNames = ImmutableList.of(
            Name.from("Chris", "Fields"),
            Name.from("Darko", "Stefanovic"),
            Name.from("Francis", "O'Briant"),
            Name.from("Keith", "Smith"),
            Name.from("Kenneth", "Grubb"),
            Name.from("Michael", "Bieljeski"),
            Name.from("Radhakrishnan", "Meiappan"),
            Name.from("Scott", "Stevenson"),
            Name.from("Todd", "Pagni"),
            Name.from("Trask", "Stalnaker"),
            Name.from("Yusuke", "Morita")
            );

    private static final List<Name> unusedNames = Lists.newArrayList(allNames);

    private static final Random random = new Random();

    public static Name name() {
        if (unusedNames.isEmpty()) {
            unusedNames.addAll(allNames);
        }
        return unusedNames.remove(random.nextInt(unusedNames.size()));
    }

    public static List<Name> names(int num) {
        List<Name> names = Lists.newArrayList();
        for (int i = 0; i < num; i++) {
            names.add(name());
        }
        return names;
    }

    public static class Name {
        private final String first;
        private final String last;
        public static Name from(String first, String last) {
            return new Name(first, last);
        }
        private Name(String first, String last) {
            this.first = first;
            this.last = last;
        }
        public String getFirst() {
            return first;
        }
        public String getLast() {
            return last;
        }
        @Override
        public int hashCode() {
            return Objects.hashCode(first, last);
        }
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Name) {
                Name that = (Name) obj;
                return Objects.equal(first, that.first)
                        && Objects.equal(last, that.last);
            }
            return false;
        }
        @Override
        public String toString() {
            return first + " " + last;
        }
    }
}
