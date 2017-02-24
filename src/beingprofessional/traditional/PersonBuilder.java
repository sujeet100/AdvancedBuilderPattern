package beingprofessional.traditional;

import beingprofessional.Address;
import beingprofessional.Person;

public class PersonBuilder {
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private Address address;
    private boolean isFemale;
    private boolean isEmployed;
    private boolean isHomewOwner;

    public PersonBuilder withSalutation(String salutation) {
        this.salutation = salutation;
        return this;
    }

    public PersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    public PersonBuilder withAddress(Address address) {
        this.address = address;
        return this;
    }

    public PersonBuilder withIsFemale(boolean isFemale) {
        this.isFemale = isFemale;
        return this;
    }

    public PersonBuilder withIsEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
        return this;
    }

    public PersonBuilder withIsHomewOwner(boolean isHomewOwner) {
        this.isHomewOwner = isHomewOwner;
        return this;
    }

    public Person createPerson() {
        return new Person(salutation, firstName, middleName, lastName, suffix, address, isFemale, isEmployed, isHomewOwner);
    }
}