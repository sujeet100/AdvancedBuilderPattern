package beingprofessional.advanced;

import beingprofessional.Person;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kamthes on 19/02/17.
 */
public class AdvancedPersonBuilderTest {

    @Test
    public void itCreatesAPerson() {
        Person person = new PersonBuilder()
                .with($ -> {
                    $.salutation = "Mr.";
                    $.firstName = "John";
                    $.lastName = "Doe";
                    $.isFemale = false;
                    $.isHomewOwner = true;
                    $.address =
                        new PersonBuilder.AddressBuilder()
                            .with($_address -> {
                                $_address.city = "Pune";
                                $_address.state = "MH";
                                $_address.pin = "411001";
                            }).createAddress();
                })
                .createPerson();

        Assert.assertThat(person.getSalutation(), Is.is("Mr."));
        Assert.assertThat(person.getFirstName(), Is.is("John"));
        Assert.assertThat(person.getLastName(), Is.is("Doe"));
        Assert.assertThat(person.isFemale(), Is.is(false));
        Assert.assertThat(person.getAddress().getCity(), Is.is("Pune"));
        Assert.assertThat(person.getAddress().getState(), Is.is("MH"));
    }
}
