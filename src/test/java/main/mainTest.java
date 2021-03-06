package main;

import model.Person;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void transaction() {
        String user1Name = "John";
        String user2Name = "Doe";
        int initAmount = 10;
        Person user1 = new Person(user1Name, 0, initAmount);
        Person user2 = new Person(user2Name, 1, initAmount);
        int transAmount = 10;

        main.transaction(user1,user2,transAmount);

        String nowDate = "02/03/2022";
        List<String> transactionDetails = new ArrayList<>();
        transactionDetails.add(nowDate+", "+user1Name+", "+String.valueOf(transAmount)+", "+user2Name);

        assertEquals(0, user1.getPoint());
        assertEquals(20, user2.getPoint());

        assertEquals(main.history, transactionDetails);

        main.transaction(user1,user2,transAmount);

        assertEquals(main.history, transactionDetails);



    }


}