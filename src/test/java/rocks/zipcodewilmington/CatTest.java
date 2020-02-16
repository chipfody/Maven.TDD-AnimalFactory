package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
     @ Test
    public void testSetName() {
        Integer id = 3445;
        Date birthDate = new Date();
        String expected = "Nightcrawler";
        Cat cat = new Cat(expected, birthDate, id);

        cat.setName(expected);

        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @ Test
    public void testSetBirthDate() {
        Integer id = 1234;
        String name = "Cyclops";
        Date givenDate = new Date(2010, 1, 1);
        Date expected = new Date (2017, 4,6);
        Cat cat = new Cat(name, givenDate, id);

        cat.setBirthDate(new Date(2017, 4, 6));

        Date actual = cat.getBirthDate();


        Assert.assertEquals(expected, actual);
    }
    @ Test
    public void testspeak() {
        Integer id = 5639;
        Date birthDate = new Date();
        String name = "Xavier";
        String expected = "meow!";

        Cat cat = new Cat(name, birthDate, id);

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
    @ Test
    public void testEat() {
        Integer id = 2965;
        Date birthDate = new Date();
        String name = "Beast";
        Food catFood = new Food();

        Cat cat = new Cat(name, birthDate, id);
        cat.eat(catFood);
        Integer expected = 1;


        Integer actual = cat.getNumberOfMealsEaten();


       Assert.assertEquals(expected, actual);
      }

    @ Test
    public void testID() {
        Integer expected = 13579;
        Date birthDate = new Date();
        String name = "Iceman";

        Cat cat = new Cat(name, birthDate, expected);

        Integer actual = cat.getId();

        Assert.assertEquals(expected, actual);
    }

    @ Test
    public void testInstanceOf() {
        Integer id = 246875;
        Date birthDate = new Date();
        String name = "Archangel";

        Cat cat = new Cat(name, birthDate, id);

        Boolean expected = true;
        Boolean actual = cat instanceof Animal;

        Assert.assertEquals(expected, actual);
    }

    @ Test
    public void test2InstanceOf() {
        Integer id = 3479104;
        Date birthDate = new Date();
        String name = "Colossus";

        Cat cat = new Cat(name, birthDate, id);

        Boolean expected = true;
        Boolean actual = cat instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }

}
