package com.reponsitory;

import com.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonReponsitory {

    @Autowired
    private Person person;


    public boolean authenicate(Person person){

        if(person.getUsername().equals(person.getPassword())){
            return false;
        }
        return true;
    }


}
