package com.amar.springjpahibernate.resource;


import com.amar.springjpahibernate.repository.UsersLogRepository;
import com.amar.springjpahibernate.model.Users;
import com.amar.springjpahibernate.model.UsersLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users/log")
public class UsersLogResource {

    private UsersLogRepository usersLogRepository;

    public UsersLogResource(UsersLogRepository usersLogRepository) {
        this.usersLogRepository = usersLogRepository;
    }

    @GetMapping(value = "/all")
    public List<UsersLog> getAll() {

        return usersLogRepository.findAll();
    }


    @GetMapping(value = "/update/{name}")
    public List<UsersLog> update(@PathVariable final String name) {

        Users users = new Users();

        users.setName(name)
                .setSalary(120)
                .setTeamName("Dev");

        UsersLog usersLog1 = new UsersLog();
        usersLog1.setUsers(users);
        usersLog1.setLog("Hi Log 1");

        usersLogRepository.save(usersLog1);

        UsersLog usersLog2 = new UsersLog();
        usersLog2.setUsers(users);
        usersLog2.setLog("Hi Log 2");
        usersLogRepository.save(usersLog2);

        return usersLogRepository.findAll();

    }
}
