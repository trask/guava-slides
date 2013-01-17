package com.github.trask.guavalunch.base;

import org.apache.commons.lang3.ObjectUtils;

import com.google.common.base.Objects;

public class DefaultValueExample {

    public static void main(String[] args) {

        // guava
        System.out.println(Objects.firstNonNull(null, "<not found>"));

        // commons-lang
        System.out.println(ObjectUtils.defaultIfNull(null, "<not found>"));
    }
}
