package com.github.trask.guavaslides.base;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class ObjectExampleLombok {

    private Long id;
    private String longMatterName;
    private String matterNumber;
    private Date openDate;
    private Date closeDate;
}
// groovy built-in: @EqualsAndHashCode
// scala built-in: case class
