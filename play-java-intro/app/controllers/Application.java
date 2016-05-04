package controllers;

import play.*;
import play.mvc.*;
import play.db.jpa.*;
import views.html.*;
import models.Person;
import play.data.FormFactory;
import javax.inject.Inject;
import java.util.List;

import static play.libs.Json.*;

public class Application extends Controller {

    @Inject
    FormFactory formFactory;

    public Result docs(String message) {
        return ok(docs.render(message, "Java"));
    }

    @Transactional(readOnly = true)
    public Result index() {
        return ok(index.render(getResultList()));
    }

    @Transactional
    public Result addPerson() {
        Person person = formFactory.form(Person.class).bindFromRequest().get();
        JPA.em().persist(person);
        return redirect(routes.Application.index());
    }

    @Transactional(readOnly = true)
    public Result getPersons() {
        List<Person> persons = getResultList();
        return ok(toJson(persons));
    }

    private List<Person> getResultList() {
        return (List<Person>) JPA.em().createQuery("select p from Person p").getResultList();
    }
}
