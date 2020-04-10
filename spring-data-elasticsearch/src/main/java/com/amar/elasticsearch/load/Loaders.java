package com.amar.elasticsearch.load;

import com.amar.elasticsearch.jparepository.UserJpaRepository;
import com.amar.elasticsearch.model.Users;
import com.amar.elasticsearch.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    UserJpaRepository userJpaRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){

        operations.putMapping(Users.class);
        System.out.println("Loading Data");
        List<Users> data = getData();
        userJpaRepository.save(data); //saves to H2 DB

        List<Users> usersList = userJpaRepository.findAll(); //Get from H2 DB
        usersRepository.save(usersList); //loads into Elastic
        System.out.printf("Loading Completed");

    }

    private List<Users> getData() {
        List<Users> userses = new ArrayList<>();
        userses.add(new Users("Amar",123L, "Dev", 12000L));
        userses.add(new Users("Konatham",1234L, "Lead", 22000L));
        userses.add(new Users("Reddy",1235L, "Arch", 12000L));
        return userses;
    }
}
