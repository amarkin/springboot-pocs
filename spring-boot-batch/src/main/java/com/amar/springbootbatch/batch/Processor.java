package com.amar.springbootbatch.batch;

import com.amar.springbootbatch.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;


import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static final Map<String, String> DEPT_NAME = new HashMap<>();

    public Processor() {
        DEPT_NAME.put("001", "Dev");
        DEPT_NAME.put("002", "Lead");
        DEPT_NAME.put("003", "Arch");
    }

    @Override
    public User process(User user) throws Exception {

        user.setDept(DEPT_NAME.get(user.getDept().trim()));

        return user;
    }
}
