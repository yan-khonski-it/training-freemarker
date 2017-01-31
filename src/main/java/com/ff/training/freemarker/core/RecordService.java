package com.ff.training.freemarker.core;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class RecordService {

    public List<Record> getRecords() {
        List<Record> records = new ArrayList<Record>();
        records.add(new Record(ZonedDateTime.now(), "text-1", 1L));
        records.add(new Record(ZonedDateTime.of(LocalDateTime.of(1991, 12, 1, 15, 0), ZoneId.systemDefault()), "text-2", 2L));
        records.add(new Record(ZonedDateTime.of(LocalDateTime.of(2016, 11, 12, 15, 0), ZoneId.systemDefault()), "text-3", 3L));
        records.add(new Record(ZonedDateTime.of(LocalDateTime.of(2015, 10, 21, 15, 0), ZoneId.systemDefault()), "text-4", 4L));
        return records;
    }
}
