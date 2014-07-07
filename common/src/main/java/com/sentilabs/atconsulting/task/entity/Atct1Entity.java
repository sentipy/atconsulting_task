package com.sentilabs.atconsulting.task.entity;

import javax.persistence.*;

/**
 * Created by sentipy on 06/07/14.
 */
@Entity
@Table(name = "atct_1", schema = "public", catalog = "atct")
public class Atct1Entity {
    private int column1;
    private String column2;

    @Id
    @Column(name = "column_1")
    public int getColumn1() {
        return column1;
    }

    public void setColumn1(int column1) {
        this.column1 = column1;
    }

    @Basic
    @Column(name = "column_2")
    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Atct1Entity that = (Atct1Entity) o;

        if (column1 != that.column1) return false;
        if (column2 != null ? !column2.equals(that.column2) : that.column2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = column1;
        result = 31 * result + (column2 != null ? column2.hashCode() : 0);
        return result;
    }
}
