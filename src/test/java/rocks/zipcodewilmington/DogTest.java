package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    /**@Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    } */
    @Before
    @After

    @ Test
    public void testSetName() {
        Integer id = 1357913;
        Date birthDate = new Date();
        String expected = "Steve";
        Dog dog = new Dog(expected, birthDate, id);

        dog.setName(expected);

        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @ Test
    public void testSetBirthDate() {
        Integer id = 100004;
        String name = "Thor";
        Date givenDate = new Date(2010, 1, 1);
        Date expected = new Date (2017, 4,6);
        Dog dog = new Dog(name, givenDate, id);

        dog.setBirthDate(new Date(2017, 4, 6));

        Date actual = dog.getBirthDate();


        Assert.assertEquals(expected, actual);
    }
    @ Test
    public void testspeak() {
        Integer id = 246810;
        Date birthDate = new Date();
        String name = "Natasha";
        String expected = "bark!";

        Dog dog = new Dog(name, birthDate, id);

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
    @ Test
    public void testEat() {
        Integer id = 698;
        Date birthDate = new Date();
        String name = "Tony";

        Dog dog = new Dog(name, birthDate, id);
        Food alpo = new Food();
        Integer expected = 1;

        dog.eat(alpo);
        Integer actual = dog.getNumberOfMealsEaten();


        Assert.assertEquals(expected, actual);
    }

    @ Test
    public void testID() {
        Integer expected = 124816;
        Date birthDate = new Date();
        String name = "Janet";

        Dog dog = new Dog(name, birthDate, expected);

        Integer actual = dog.getId();

        Assert.assertEquals(expected, actual);
    }

    @ Test
    public void testInstanceOf() {
        Integer id = 578642;
        Date birthDate = new Date();
        String name = "Bruce";

        Dog dog = new Dog(name, birthDate, id);

        Boolean expected = true;
        Boolean actual = dog instanceof Animal;

        Assert.assertEquals(expected, actual);
    }

    @ Test
    public void test2InstanceOf() {
        Integer id = 52060120;
        Date birthDate = new Date();
        String name = "Bucky";

        Dog dog = new Dog(name, birthDate, id);

        Boolean expected = true;
        Boolean actual = dog instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }

}
