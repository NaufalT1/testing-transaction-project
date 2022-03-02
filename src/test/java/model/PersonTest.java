package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("Get Name of a person")
    void getName() {
        String actualName = "Robert";

        Person person1 = new Person(actualName,1,10);

        String personName = person1.getName();

        assertEquals(actualName,personName);
    }

    @Test
    @DisplayName("Set a new name to person")
    void setName() {
        String changeName = "Tony";

        Person person1 = new Person("Chris",1,20);

        person1.setName(changeName);

        String personName = person1.getName();

        assertEquals(changeName,personName);
    }

    @Test
    @DisplayName("Get ID from person")
    void getId(){
        Integer actualID = 23;

        Person person1 = new Person("Tom",actualID,20);

        Integer personID = person1.getId();

        assertEquals(actualID,personID);

    }

    @Test
    @DisplayName("Get points from person")
    void getPoint() {
        Integer actualPoint = 549;

        Person person1 = new Person("Tom",1,actualPoint);

        Integer personPoint = person1.getPoint();

        assertEquals(actualPoint,personPoint);
    }

    @Test
    @DisplayName("Set new points to person")
    void setPoint() {
        Integer actualPoint = 92;
        Integer changePoint = 291;

        Person person1 = new Person("Milo",1,actualPoint);

        person1.setPoint(changePoint);

        Integer personPoint = person1.getPoint();

        assertEquals(changePoint,personPoint);

    }
}