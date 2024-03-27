package com.study.api.user;

import java.sql.SQLException;
import java.util.*;

import com.study.api.enums.Messenger;


public interface UserService {
    Map<String, ?> login(Member memberParam) throws SQLException;

    Map<String, ?> updatePassword(Member user) throws SQLException;

    Map<String, ?> findUsersByName(Member name);

    Map<String, ?> findUsersByNemeFramMap(String name);

    Map<String, ?> findUsersByJob(String userJob);

    Map<String, ?> findUsersByJobFromMap(String job);

    String addUsers();

    Map<String, ?> getUserMap();

    String test();

    Map<String, ?> findUsers() throws SQLException;

    Messenger touch();

    Messenger rm();

    Map<String, ?> tain(Member mems) throws SQLException;

    Map<String, ?> ls() throws SQLException;
}