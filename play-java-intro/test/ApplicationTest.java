import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import models.Person;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;
import play.twirl.api.Html;
import views.html.index;

import static java.util.Arrays.asList;
import static play.test.Helpers.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    @Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a, equalTo(2));
    }

    @Test
    public void renderTemplate() throws Exception {
        Person person = new Person();
        person.name = "Jacob";
        Html html = index.render(asList(person));

        assertThat(html.contentType(), is("text/html"));
        assertThat(html.body(), containsString("Add Person"));
        assertThat(html.body(), containsString("Name: Jacob"));
    }
}
