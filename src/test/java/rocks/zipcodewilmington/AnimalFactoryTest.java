package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

import static org.junit.Assert.assertEquals;


/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @ Test
    public void testCreateDog() {
        Date birthDate = new Date(2018, 12,1);
        String name = "Cloak";
        String expectedName = ("Cloak");
        Date expectedDate = new Date(2018, 12,1);

        Dog actual = AnimalFactory.createDog(name, birthDate);
        String actualName = actual.getName();
        Date actualDate = actual.getBirthDate();

        Assert.assertTrue(actual instanceof Dog);
        assertEquals(expectedName, actualName);
        assertEquals(expectedDate, actualDate);
    }

    @ Test
    public void testCreateCat() {
        Date birthDate = new Date(2016, 10,5);
        String name = "Dagger";
        String expectedName = ("Dagger");
        Date expectedDate = new Date(2016, 10,5);

        Cat actual = AnimalFactory.createCat(name, birthDate);
        String actualName = actual.getName();
        Date actualDate = actual.getBirthDate();

        Assert.assertTrue(actual instanceof Cat);
        assertEquals(expectedName, actualName);
        assertEquals(expectedDate, actualDate);
    }

}
