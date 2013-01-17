package com.github.trask.guavaslides.base;

import com.google.common.base.CaseFormat;

public class CaseFormatExample {

    public static void main(String[] args) {

        String fieldName = "matterPersonRoleInvolvementType";

        String columnName = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, fieldName);

        System.out.println(columnName);
    }
}
