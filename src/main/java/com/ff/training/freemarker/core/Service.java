package com.ff.training.freemarker.core;

public class Service {

    private UserService userService = new UserService();
    private RecordService recordService = new RecordService();

    public Model getModel() {
        return new Model(userService.getUser(), recordService.getRecords());
    }
}
