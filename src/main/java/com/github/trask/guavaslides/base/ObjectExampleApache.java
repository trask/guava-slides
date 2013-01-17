package com.github.trask.guavaslides.base;

import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ObjectExampleApache implements Comparable<ObjectExampleApache> {

    private Long id;
    private String longMatterName;
    private String matterNumber;
    private Date openDate;
    private Date closeDate;

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static void main(String[] args) {
        ObjectExampleApache example = new ObjectExampleApache();
        example.id = 1L;
        example.longMatterName = "Plants vs Zombies";
        example.matterNumber = "999";
        example.openDate = new Date();
        example.closeDate = null;
        System.out.println(example);
    }

    @Override
    public int compareTo(ObjectExampleApache that) {
        return CompareToBuilder.reflectionCompare(this, that);
    }
}
