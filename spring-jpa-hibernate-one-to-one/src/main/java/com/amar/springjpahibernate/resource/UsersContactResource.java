package com.amar.springjpahibernate.resource;


import com.amar.springjpahibernate.repository.UsersContactRepository;
import com.amar.springjpahibernate.model.Users;
import com.amar.springjpahibernate.model.UsersContact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/rest/userscontact")
@RestController
public class UsersContactResource {

    private UsersContactRepository usersContactRepository;

    public UsersContactResource(UsersContactRepository usersContactRepository) {
        this.usersContactRepository = usersContactRepository;
    }

    @GetMapping(value = "/all")
    public List<UsersContact> getUsersContact() {
        return usersContactRepository.findAll();
    }

    @GetMapping(value = "/update/{name}")
    public List<UsersContact> update(@PathVariable final String name) {

        UsersContact usersContact = new UsersContact();

        Users users = new Users();
        users.setTeamName("Dev")
                .setSalary(120)
                .setName(name);


        usersContact.setPhoneNo(111)
                .setUsers(users);

        usersContactRepository.save(usersContact);

        return usersContactRepository.findAll();


    }


}
