package com.github.trask.guavalunch.base;

import java.util.Date;

public class ObjectExampleEclipse {

    private Long id;
    private String longMatterName;
    private String matterNumber;
    private Date openDate;
    private Date closeDate;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((closeDate == null) ? 0 : closeDate.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((longMatterName == null) ? 0 : longMatterName.hashCode());
        result = prime * result + ((matterNumber == null) ? 0 : matterNumber.hashCode());
        result = prime * result + ((openDate == null) ? 0 : openDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ObjectExampleEclipse other = (ObjectExampleEclipse) obj;
        if (closeDate == null) {
            if (other.closeDate != null)
                return false;
        } else if (!closeDate.equals(other.closeDate))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (longMatterName == null) {
            if (other.longMatterName != null)
                return false;
        } else if (!longMatterName.equals(other.longMatterName))
            return false;
        if (matterNumber == null) {
            if (other.matterNumber != null)
                return false;
        } else if (!matterNumber.equals(other.matterNumber))
            return false;
        if (openDate == null) {
            if (other.openDate != null)
                return false;
        } else if (!openDate.equals(other.openDate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "HashCodeEqualsExampleEclipse [id=" + id + ", longMatterName=" + longMatterName
                + ", matterNumber=" + matterNumber + ", openDate=" + openDate + ", closeDate="
                + closeDate + "]";
    }
}
