package com.service;

import com.models.Person;
import com.reponsitory.PersonReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private PersonReponsitory personReponsitory;


    public boolean login(Person person){
        return personReponsitory.authenicate(person);
    }


}
