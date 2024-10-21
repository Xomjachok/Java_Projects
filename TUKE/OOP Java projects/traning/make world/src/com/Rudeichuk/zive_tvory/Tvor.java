package com.Rudeichuk.zive_tvory;
import java.util.Date;
public abstract class Tvor extends Date implements bornable, dieble{
    protected Date day_of_birth;
    protected Date day_of_die;

    public Date getDay_of_birth() {
        return day_of_birth;
    }

    @Override
    public void born(Date day_of_birth) {

    }

    @Override
    public void die(Date day_of_die) {

    }
}
