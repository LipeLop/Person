package com.testpractice.apiperson.services;


import com.testpractice.apiperson.models.CheckLimits;
import com.testpractice.apiperson.models.CheckResult;
import com.testpractice.apiperson.models.Group;
import com.testpractice.apiperson.models.PersonGroupLink;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    public Group createGroup(Group group) {
        return group;
    }

    public Group updateGroup(Group group) {
        return group;
    }

    public PersonGroupLink addPersonToGroup(PersonGroupLink personGroupLink) {
        return personGroupLink;
    }

    public List<Group> getGroups(String groupStatus) {
        return null;
    }

    public Group getGroupById(String id) {
        return null;
    }

    public Group deleteGroup(String id, String startDate) {
        return null;
    }

    public List<PersonGroupLink> getAllPersonsInGroup(String id, String personStatusInGroup) {
        return null;
    }

    public List<Group> getGroupsForPerson(String id, String groupStatus, String personStatusInGroup) {
        return null;
    }

    public PersonGroupLink deletePersonFromGroup(String groupId, String personId, String startDate) {
        return null;
    }

    public List<CheckResult> getPersonChecksHistory(String id) {
        return null;
    }

    public CheckLimits getPersonMaxChecks(String id, String roleId) {
        return null;
    }

    public CheckLimits getAvailableChecksForPerson(String id) {
        return null;
    }

    public Boolean isCheckAvailableForPerson(String id) {
        return null;
    }
}
