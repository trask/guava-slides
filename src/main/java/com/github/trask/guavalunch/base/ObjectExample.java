package com.github.trask.guavalunch.base;

import java.util.Date;

import com.google.common.base.Objects;

public class ObjectExample {

    private Long id;
    private String longMatterName;
    private String matterNumber;
    private Date openDate;
    private Date closeDate;

    @Override
    public int hashCode() {
        return Objects.hashCode(id, longMatterName, matterNumber, openDate, closeDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ObjectExample) {
            ObjectExample that = (ObjectExample) obj;
            return Objects.equal(id, id)
                    && Objects.equal(longMatterName, that.longMatterName)
                    && Objects.equal(matterNumber, that.matterNumber)
                    && Objects.equal(openDate, that.openDate)
                    && Objects.equal(closeDate, that.closeDate);
        }
        return false;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("longMatterName", longMatterName)
                .add("matterNumber", matterNumber)
                .add("openDate", openDate)
                .add("closeDate", closeDate)
                .toString();
    }

    public static void main(String[] args) {
        ObjectExample example = new ObjectExample();
        example.id = 1L;
        example.longMatterName = "Plants vs Zombies";
        example.matterNumber = "999";
        example.openDate = new Date();
        example.closeDate = null;
        System.out.println(example);
    }
}
