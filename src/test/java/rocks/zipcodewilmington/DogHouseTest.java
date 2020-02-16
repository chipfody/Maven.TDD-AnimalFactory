package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    @Before
    @After

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }

    @Test
    public void testAddDog() {
        Dog newDog = AnimalFactory.createDog("Arthur", new Date());
        DogHouse.add(newDog);

        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testRemoveID() {
        Dog newDog2 = AnimalFactory.createDog("Diana", new Date());
        DogHouse.add(newDog2);
        Integer idNewDog = newDog2.getId();


        DogHouse.remove(idNewDog);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveDog() {
        Dog newDog3 = AnimalFactory.createDog("Barry", new Date());
        DogHouse.add(newDog3);

        DogHouse.remove(newDog3);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDogById() {
        Dog newDog4 = AnimalFactory.createDog("Clark", new Date());
        DogHouse.add(newDog4);
        Integer id = newDog4.getId();

        Dog actual = DogHouse.getDogById(id);
        //String expected = "";

        Assert.assertEquals(newDog4, actual);

    }

}
