package main;

import com.sun.org.apache.xpath.internal.objects.XString;
import model.person;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void transaction() {
        String user1Name = "John";
        String user2Name = "Doe";
        int initAmount = 10;
        person user1 = new person(user1Name, 0, initAmount);
        person user2 = new person(user2Name, 1, initAmount);
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