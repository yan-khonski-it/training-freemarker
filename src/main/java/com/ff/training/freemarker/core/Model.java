package com.ff.training.freemarker.core;

import java.util.List;

public class Model {

    private UserDetails userDetails;
    private List<Record> records;

    public Model(UserDetails userDetails, List<Record> records) {
        this.userDetails = userDetails;
        this.records = records;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
