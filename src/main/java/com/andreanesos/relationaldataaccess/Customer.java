package com.andreanesos.relationaldataaccess;

public record Customer(long id,  String firstName, String lastName) {
    @Override
    public String toString() {
        return String.format("Customer[id=%d, name='%s', last name='%s']", id, firstName, lastName);
    }

}
