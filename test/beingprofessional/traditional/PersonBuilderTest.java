package beingprofessional.traditional;

import beingprofessional.Person;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kamthes on 19/02/17.
 */
public class PersonBuilderTest {

    @Test
    public void itCreatesAPerson(){
        Person person = new PersonBuilder()
                .withSalutation("Mr.")
                .withFirstName("John")
                .withLastName("Doe")
                .withIsFemale(false)
                .withAddress(new AddressBuilder()
                            .withCity("Pune")
                            .withState("MH")
                            .withStreet("MG Road")
                            .withPin("411001")
                            .createAddress())
                .createPerson();

        Assert.assertThat(person.getSalutation(), Is.is("Mr."));
        Assert.assertThat(person.getFirstName(), Is.is("John"));
        Assert.assertThat(person.getLastName(), Is.is("Doe"));
        Assert.assertThat(person.isFemale(), Is.is(false));
        Assert.assertThat(person.getAddress().getCity(), Is.is("Pune"));
        Assert.assertThat(person.getAddress().getState(), Is.is("MH"));
    }
}
