package com.gordon.rawe;

import com.alibaba.fastjson.JSON;
import com.gordon.rawe.models.Community;
import com.gordon.rawe.models.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gordon on 2015/8/24.
 */
public class Main {
    public static void main(String... args) {
        Person person = new Person("gordon", 23, "gordon.tongji@hotmail.com");
//        Person person = new Person();
        log(person);
        String personString = person.toString();
        Person backPerson = JSON.parseObject(personString, Person.class);
        log(backPerson.getAge());

        ArrayList<Person> people = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            people.add(new Person("gordon" + String.valueOf(i), i, "email no " + String.valueOf(i)));
        }
        String backPeopleString = JSON.toJSONString(people);
        log(backPeopleString);
        List<Person> backPeople = JSON.parseArray(backPeopleString, Person.class);
        for (Person p : backPeople) {
            log(p.getEmail());
        }
        Community community = new Community("lvyuan",people);
        log(community);
        String communitString = community.toString();
        Community backCommunity = JSON.parseObject(communitString,Community.class);
    }

    private static void log(Object str) {
        System.out.println(str);
    }
}
