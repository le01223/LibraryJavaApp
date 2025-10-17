package ru.levklv.library.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import ru.levklv.library.dao.PersonDAO;
import org.springframework.validation.Validator;
import ru.levklv.library.models.Person;

@Component
public class PersonValidator implements Validator{
    private PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;
        if (personDAO.getPersonByFullName(person.getFullName()) != null) {
            errors.rejectValue("fullName", "", "Have a person with this full name");
        }
    }
}
