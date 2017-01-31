package com.ff.training.freemarker.core;

import java.time.ZonedDateTime;

public class Record {

    private ZonedDateTime created;
    private String text;
    private Long id;

    public Record(ZonedDateTime created, String text, Long id) {
        this.created = created;
        this.text = text;
        this.id = id;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public void setCreated(ZonedDateTime created) {
        this.created = created;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
