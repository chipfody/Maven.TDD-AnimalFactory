package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Before
    @After
    public void teardown(){
        CatHouse.clear();
    }

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        Cat newCat = AnimalFactory.createCat("Steven", new Date());
        CatHouse.add(newCat);

        // When
        //CatHouse.add(new );

        // Then
        //Cat.getNumberOfCats();

        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testAddCat() {
        Cat newCat2 = AnimalFactory.createCat("Norrin", new Date());
        CatHouse.add(newCat2);

        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testRemoveID() {
        Cat newCat3 = AnimalFactory.createCat("Namor", new Date());
        CatHouse.add(newCat3);
        Integer idNewDog = newCat3.getId();


        CatHouse.remove(idNewDog);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveCat() {
        Cat newCat4 = AnimalFactory.createCat("Clea", new Date());
        CatHouse.add(newCat4);

        CatHouse.remove(newCat4);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDogById() {
        Cat newCat5 = AnimalFactory.createCat("Clint", new Date());
        CatHouse.add(newCat5);
        Integer id = newCat5.getId();

        Cat actual = CatHouse.getCatById(id);
        //String expected = "";

        Assert.assertEquals(newCat5, actual);

    }

}


