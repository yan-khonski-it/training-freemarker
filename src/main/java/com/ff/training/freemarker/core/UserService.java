package com.ff.training.freemarker.core;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class UserService {

    public UserDetails getUser() {
        return new UserDetails(null/*"john Doe"*/, ZonedDateTime.of(LocalDateTime.of(1990, 1, 10, 12, 11), ZoneId.systemDefault()), 1L);
    }
}
