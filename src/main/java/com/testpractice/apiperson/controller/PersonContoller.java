package com.testpractice.apiperson.controller;

import com.testpractice.apiperson.models.CheckLimits;
import com.testpractice.apiperson.models.CheckResult;
import com.testpractice.apiperson.models.Group;
import com.testpractice.apiperson.models.PersonGroupLink;
import com.testpractice.apiperson.services.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/persons")
public class PersonContoller {

    //TODO Примерный сервис (реализацию необходимо добавить)
    private final PersonService personService;

    public PersonContoller(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/createGroup")
    public Group createGroup(@RequestBody Group group) {
        return personService.createGroup(group);
    }


    @PostMapping("/updateGroup")
    public Group updateGroup(@RequestBody Group group) {
        return personService.updateGroup(group);
    }

    @PostMapping("/addPersonToGroup")
    public PersonGroupLink addPersonToGroup(@RequestBody PersonGroupLink personGroupLink) {
        return personService.addPersonToGroup(personGroupLink);
    }

    @GetMapping("/groups")
    public List<Group> getGroups(@RequestParam String groupStatus) {
        return personService.getGroups(groupStatus);
    }

    @GetMapping("/group/{id}")

    public Group getGroupById(@PathVariable String id) {
        return personService.getGroupById(id);
    }

    @GetMapping("/deleteGroup/{id}")

    public Group deleteGroup(@PathVariable String id, @RequestParam String startDate) {
        return personService.deleteGroup(id, startDate);
    }

    @GetMapping("/group/{id}/persons")

    public List<PersonGroupLink> getAllPersonsInGroup(@PathVariable String id, @RequestParam String personStatusInGroup) {
        return personService.getAllPersonsInGroup(id, personStatusInGroup);
    }

    @GetMapping("/person/{id}/groups")

    public List<Group> getGroupsForPerson(@PathVariable String id, @RequestParam String groupStatus, @RequestParam String personStatusInGroup) {
        return personService.getGroupsForPerson(id, groupStatus, personStatusInGroup);
    }

    @GetMapping("/group/{groupId}/removePerson/{personId}")

    public PersonGroupLink deletePersonFromGroup(@PathVariable String groupId, @PathVariable String personId, @RequestParam String startDate) {
        return personService.deletePersonFromGroup(groupId, personId, startDate);
    }

    @GetMapping("/person/{id}/checks")

    public List<CheckResult> getPersonChecksHistory(@PathVariable String id) {
        return personService.getPersonChecksHistory(id);
    }

    @GetMapping("/person/{id}/maxChecks/{roleId}")

    public CheckLimits getPersonMaxChecks(@PathVariable String id, @PathVariable String roleId) {
        return personService.getPersonMaxChecks(id, roleId);
    }

    @GetMapping("/person/{id}/availableChecks")

    public CheckLimits getAvailableChecksForPerson(@PathVariable String id) {
        return personService.getAvailableChecksForPerson(id);
    }

    @GetMapping("/person/{id}/isCheckAvailable")

    public Boolean isCheckAvailableForPerson(@PathVariable String id) {
        return personService.isCheckAvailableForPerson(id);
    }
}
