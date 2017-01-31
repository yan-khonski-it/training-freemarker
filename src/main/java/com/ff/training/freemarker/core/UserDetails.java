package com.ff.training.freemarker.core;


import java.time.ZonedDateTime;

public class UserDetails {

    private String name;
    private ZonedDateTime birthday;
    private Long id;

    public UserDetails(String name, ZonedDateTime birthday, Long id) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(ZonedDateTime birthday) {
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
